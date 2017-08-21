package com.examples.bright.tutorial.di.modules;


import com.examples.bright.tutorial.utils.ISchedulerUtils;
import com.examples.bright.tutorial.utils.SchedulerUtils;

import dagger.Module;
import dagger.Provides;

@Module
public class SchedulersModule {

    @Provides
    public ISchedulerUtils providesSchedulerUtils() {
        return new SchedulerUtils();
    }
}
