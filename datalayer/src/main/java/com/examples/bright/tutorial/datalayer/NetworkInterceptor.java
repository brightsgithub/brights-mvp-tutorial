package com.examples.bright.tutorial.datalayer;

import com.examples.bright.tutorial.datalayer.utils.DigestUtils;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by bright on 17/07/2017.
 */

public class NetworkInterceptor implements Interceptor {

    // Should be encrypted i.e. 256 AES encryption or Come from server i.e. config start up object
    private final static String TIME_STAMP = "4";
    private final static String PRIVATE_KEY = "ca6d009a6e6a8e933c62596d10c5b993d7883131";
    private final static String PUBLIC_KEY = "e5de1b003e4d44302fe74b8d91d4e07b";

    private final static String STRING_TO_BE_HASHED = TIME_STAMP+PRIVATE_KEY+PUBLIC_KEY;

    @Override
    public Response intercept(Chain chain) throws IOException {
        final Request originalRequest = chain.request();
        final HttpUrl httpUrl = appendSecurityQueryStrings(originalRequest);
        final Request.Builder requestBuilder = originalRequest.newBuilder().url(httpUrl);
        final Request request = requestBuilder.build();
        return chain.proceed(request);
    }

    private HttpUrl appendSecurityQueryStrings(final Request originalRequest) {
        final HttpUrl originalHttpUrl = originalRequest.url();
        final HttpUrl url = originalHttpUrl.newBuilder()
                .addQueryParameter("ts", TIME_STAMP)
                .addQueryParameter("apikey", PUBLIC_KEY)
                .addQueryParameter("hash", DigestUtils.getInstance().createHash(STRING_TO_BE_HASHED))
                .build();

        return url;
    }

}
