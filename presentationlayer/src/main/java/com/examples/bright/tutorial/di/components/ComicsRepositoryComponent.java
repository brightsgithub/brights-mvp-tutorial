package com.examples.bright.tutorial.di.components;

import com.examples.bright.tutorial.datalayer.comics.ComicRepository;
import com.examples.bright.tutorial.di.modules.ComicDatabaseHelperModule;
import com.examples.bright.tutorial.di.modules.ComicsRepositoryModule;
import com.examples.bright.tutorial.di.modules.ServiceAPIModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by bright on 19/08/2017.
 */

@Singleton
@Component(modules = {ComicsRepositoryModule.class, ServiceAPIModule.class, ComicDatabaseHelperModule.class})
public interface ComicsRepositoryComponent {
    ComicRepository getComicRepository();
}
