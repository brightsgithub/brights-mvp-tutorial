package com.examples.bright.tutorial.di.modules;

import com.examples.bright.tutorial.datalayer.comics.ComicDatabaseHelper;
import com.examples.bright.tutorial.datalayer.models.comic.DaoSession;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by bright on 19/08/2017.
 */

@Module(includes = DatabaseModule.class)
public class ComicDatabaseHelperModule {

    @Provides
    @Singleton
    public ComicDatabaseHelper providesComicDatabaseHelper(DaoSession daoSession) {
        return new ComicDatabaseHelper(daoSession);
    }
}
