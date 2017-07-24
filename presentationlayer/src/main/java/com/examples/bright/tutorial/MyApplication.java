package com.examples.bright.tutorial;

import android.app.Application;

import com.examples.bright.tutorial.di.components.DaggerServiceAPIComponent;
import com.examples.bright.tutorial.di.components.ServiceAPIComponent;
import com.examples.bright.tutorial.di.modules.AppModule;


/**
 * Created by bright on 17/07/2017.
 */

public class MyApplication extends Application {

    private ServiceAPIComponent serviceAPIComponent;
    private static MyApplication SINGLETON;

    @Override
    public void onCreate() {
        super.onCreate();
        SINGLETON = this;
        serviceAPIComponent = DaggerServiceAPIComponent
                .builder()
                .appModule(new AppModule(this))
                .build();

    }

    public ServiceAPIComponent getServiceAPIComponent() {
        return serviceAPIComponent;
    }

    public static MyApplication get() {
        return SINGLETON;
    }
}
