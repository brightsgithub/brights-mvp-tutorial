package com.examples.bright.tutorial.di.modules;

import com.examples.bright.tutorial.datalayer.comics.ComicsService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Provides the Retrofit Implementation of our interfaces.
 * Define all Retrofit API implementation of our interfaces here, since they only need to be setup
 * just the once, and can be reused.
 *
 * Created by bright on 22/07/2017.
 */

@Module(includes = NetworkModule.class)
public class ServiceAPIModule {

    /**
     * A Retrofit implementation of our ComicsServiceAPI.
     * We don't need to keep recreating this instance, so only one is required.
     * @param retrofit
     * @return
     */
    @Provides
    @Singleton
    public ComicsService providesComicsService(Retrofit retrofit) {
        return retrofit.create(ComicsService.class);
    }
}
