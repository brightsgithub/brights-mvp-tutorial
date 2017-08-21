package com.examples.bright.tutorial;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import com.examples.bright.tutorial.di.components.ComicsRepositoryComponent;
import com.examples.bright.tutorial.di.components.DaggerComicsRepositoryComponent;
import com.examples.bright.tutorial.di.components.DaggerServiceAPIComponent;
import com.examples.bright.tutorial.di.components.ServiceAPIComponent;
import com.examples.bright.tutorial.di.modules.AppModule;
import com.facebook.stetho.Stetho;


/**
 * Created by bright on 17/07/2017.
 */

public class MyApplication extends Application {

    private ServiceAPIComponent serviceAPIComponent;
    private ComicsRepositoryComponent comicsRepositoryComponent;
    private static MyApplication SINGLETON;

    @Override
    public void onCreate() {
        super.onCreate();
        SINGLETON = this;
        Stetho.initializeWithDefaults(this);
        comicsRepositoryComponent = DaggerComicsRepositoryComponent
                .builder()
                .appModule(new AppModule(this))
                .build();
    }

    public ServiceAPIComponent getServiceAPIComponent() {
        return serviceAPIComponent;
    }

    public ComicsRepositoryComponent getComicsRepositoryComponent() {
        return comicsRepositoryComponent;
    }

    public static MyApplication get() {
        return SINGLETON;
    }
}
