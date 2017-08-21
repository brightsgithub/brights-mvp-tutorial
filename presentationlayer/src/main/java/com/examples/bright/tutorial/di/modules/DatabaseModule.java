package com.examples.bright.tutorial.di.modules;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;


import com.examples.bright.tutorial.datalayer.DatabaseUtil;
import com.examples.bright.tutorial.datalayer.models.comic.DaoMaster;
import com.examples.bright.tutorial.datalayer.models.comic.DaoSession;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by bright on 19/08/2017.
 */

@Module(includes = AppModule.class) // This module depends on the AppModule for use of MyApplication
public class DatabaseModule {

    @Provides
    @Singleton
    public DaoMaster.DevOpenHelper providesDevOpenHelper(Context context) {
        return DatabaseUtil.providesDevOpenHelper(context);
    }

    @Provides
    @Singleton
    public SQLiteDatabase providesSQLiteDatabase(DaoMaster.DevOpenHelper helper) {
        return DatabaseUtil.providesSQLiteDatabase(helper);
    }

    @Provides
    @Singleton
    public DaoMaster providesDaoMaster(SQLiteDatabase sqLiteDatabase) {
        return DatabaseUtil.providesDaoMaster(sqLiteDatabase);
    }

    @Provides
    @Singleton
    public DaoSession providesDaoSession(DaoMaster daoMaster) {
        return DatabaseUtil.providesDaoSession(daoMaster);
    }
}
