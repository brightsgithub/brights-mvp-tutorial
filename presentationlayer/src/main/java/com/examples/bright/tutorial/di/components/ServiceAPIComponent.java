package com.examples.bright.tutorial.di.components;

import com.examples.bright.tutorial.datalayer.comics.ComicsService;
import com.examples.bright.tutorial.di.modules.ServiceAPIModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by bright on 22/07/2017.
 */
@Singleton
@Component(modules = {ServiceAPIModule.class})
public interface ServiceAPIComponent {
    ComicsService getComicsService();
}
