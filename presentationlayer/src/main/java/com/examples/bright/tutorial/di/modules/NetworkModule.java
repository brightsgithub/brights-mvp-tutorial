package com.examples.bright.tutorial.di.modules;

import android.content.Context;

import com.examples.bright.tutorial.datalayer.NetworkInterceptor;
import com.examples.bright.tutorial.datalayer.NetworkUtil;
import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;

/**
 * All things network related. We only need one instance of each of the below setup for our app.
 * Hence why these are all Singletons.
 *
 * Created by bright on 17/07/2017.
 */

@Module(includes = AppModule.class) // This module depends on the AppModule for use of MyApplication
public class NetworkModule {

    @Provides
    @Singleton
    public Cache provideHttpCache(Context myApplication) {
        return NetworkUtil.provideHttpCache(myApplication);
    }

    @Provides
    @Singleton
    public OkHttpClient provideOkhttpClient(
            Cache cache,
            HttpLoggingInterceptor httpLoggingInterceptor,
            NetworkInterceptor networkInterceptor) {
        return NetworkUtil.provideOkhttpClient(cache, httpLoggingInterceptor, networkInterceptor);
    }

    @Provides
    @Singleton
    public HttpLoggingInterceptor provideHttpLoggingInterceptor() {
        return NetworkUtil.provideHttpLoggingInterceptor();
    }

    @Provides
    @Singleton
    public Retrofit provideRetrofit(OkHttpClient okHttpClient, Gson gson) {
        return NetworkUtil.provideRetrofit(okHttpClient, gson);
    }

    @Provides
    @Singleton
    public Gson gson() {
        return NetworkUtil.gson();
    }

    @Provides
    @Singleton
    public NetworkInterceptor provideNetworkInterceptor() {
        return NetworkUtil.provideNetworkInterceptor();
    }
}
