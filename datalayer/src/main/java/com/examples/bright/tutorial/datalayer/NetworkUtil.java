package com.examples.bright.tutorial.datalayer;

import android.content.Context;
import android.util.Log;

import com.examples.bright.tutorial.models.comic.ResultComicEntity;
import com.examples.bright.tutorial.models.common.DataEntity;
import com.examples.bright.tutorial.models.gson.ComicsDeserializer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * This class can now be used by an Instumented test or by the application itself
 * Created by bright on 23/07/2017.
 */

public class NetworkUtil {

    public static Cache provideHttpCache(Context myApplication) {
        int cacheSize = 10 * 1024 * 1024;
        Cache cache = new Cache(new File(myApplication.getCacheDir().getPath()), cacheSize);
        return cache;
    }

    public static OkHttpClient provideOkhttpClient(
            Cache cache,
            HttpLoggingInterceptor httpLoggingInterceptor,
            NetworkInterceptor networkInterceptor) {

        final OkHttpClient.Builder client;

        if (BuildConfig.BUILD_TYPE.equals("debugForTesting")) {
            client  = new OkHttpClient.Builder(); // NO CACHE
        } else {
            client  = new OkHttpClient.Builder().cache(cache);
            addCachingInterceptor(client, 86400); // 86400 in secs = 1 Day
        }

        client.interceptors().add(httpLoggingInterceptor);
        client.interceptors().add(networkInterceptor);
        return client.build();
    }

    public static HttpLoggingInterceptor provideHttpLoggingInterceptor() {
        HttpLoggingInterceptor.Logger logger = new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                Log.v("HttpLoggingInterceptor", message);
            }
        };
        final HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor(logger);
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        return interceptor;
    }

    /**
     * Allow a caching period of 24 hours
     * @param httpClientBuilder
     * @param cacheWindowInSeconds
     */
    private static void addCachingInterceptor(
            final OkHttpClient.Builder httpClientBuilder,
            final long cacheWindowInSeconds) {

        // Creates an interceptor that adds a Cache duration
        httpClientBuilder.networkInterceptors().add(chain -> {
            final Response originalResponse = chain.proceed(chain.request());

            final String cacheHeaderValue =
                    String.format("max-age=%d, only-if-cached, max-stale=%d", cacheWindowInSeconds, 0);
          /*
              The problem was that cache wasn't written to flash storage because the server returned
              Pragma:no-cache which prevents OkHttp from storing the response. Offline cache didn't work
              even after modifying request header values. After some trial-and-error
              I got the cache to work without modifying the backend side by removing pragma from reponse
              instead of the request - response.newBuilder().removeHeader("Pragma");
           */
            return originalResponse.newBuilder()
                    .removeHeader("Pragma")
                    .removeHeader("Cache-Control")
                    .header("Cache-Control", cacheHeaderValue).build();
        });
    }

    /**
     * Here, we are configuring Retrofit which depends on:
     * 1) A configured OkHttpClient object.
     * 2) A configured Gson object.
     * @param okHttpClient
     * @param gson
     * @return
     */
    public static Retrofit provideRetrofit(OkHttpClient okHttpClient, Gson gson) {
        return new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .baseUrl(MarvelApi.BASE_URL)
                .client(okHttpClient)
                .build();
    }

    /**
     * Provides a configured Gson object.
     * @return
     */
    public static Gson gson() {
        GsonBuilder gsonBuilder = new GsonBuilder()
                .registerTypeAdapter(DataEntity.class,
                        new ComicsDeserializer<>(ResultComicEntity.class, "results"));
        return gsonBuilder.create();
    }

    public static NetworkInterceptor provideNetworkInterceptor() {
        return new NetworkInterceptor();
    }

    public static Retrofit getConfiguredRetrofit(final Context context) {
        final Cache cache = provideHttpCache(context);
        final HttpLoggingInterceptor  httpLoggingInterceptor = provideHttpLoggingInterceptor();
        final NetworkInterceptor networkInterceptor = provideNetworkInterceptor();
        final OkHttpClient okHttpClient = provideOkhttpClient(cache, httpLoggingInterceptor, networkInterceptor);
        final Gson gson = gson();
        return provideRetrofit(okHttpClient, gson);
    }
}
