package com.examples.bright.tutorial.di.modules;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Create an AppModule that will provide context to other modules.
 *
 * Now because Retrofit and OkHttp will be used through the application we will created an AppModule
 * that will be instantiated when the Application starts so that the app context
 * is provided to Retrofit and OkHttp library.
 *
 * Created by bright on 17/07/2017.
 */

@Module
public class AppModule {

    public Context myApplication;

    public AppModule(Context myApplication) {
        this.myApplication = myApplication;
    }

    @Provides
    @Singleton
    public Context providesApplication() {
        return myApplication;
    }
}
