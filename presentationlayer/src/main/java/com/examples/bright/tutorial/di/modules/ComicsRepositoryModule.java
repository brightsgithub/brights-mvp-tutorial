package com.examples.bright.tutorial.di.modules;

import com.examples.bright.tutorial.datalayer.comics.ComicDatabaseHelper;
import com.examples.bright.tutorial.datalayer.comics.ComicRepository;
import com.examples.bright.tutorial.datalayer.comics.ComicsService;
import com.examples.bright.tutorial.domainlayer.abstractions.repository.IComicRepository;


import dagger.Module;
import dagger.Provides;

/**
 * Created by bright on 19/08/2017.
 */

@Module(includes = {DatabaseModule.class, NetworkModule.class}) // This module depends on the AppModule for use of MyApplication
public class ComicsRepositoryModule {

    @Provides
    public IComicRepository providesComicRepository(
            ComicsService comicsService,
            ComicDatabaseHelper comicDatabaseHelper) {

        return new ComicRepository(comicsService,  comicDatabaseHelper);
    }

}
