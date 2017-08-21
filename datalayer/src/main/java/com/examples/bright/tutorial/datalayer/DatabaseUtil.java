package com.examples.bright.tutorial.datalayer;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.examples.bright.tutorial.models.comic.DaoMaster;
import com.examples.bright.tutorial.models.comic.DaoSession;

/**
 * Created by bright on 20/08/2017.
 */

public class DatabaseUtil {

    public static DaoMaster.DevOpenHelper providesDevOpenHelper(Context context) {
        return new DaoMaster.DevOpenHelper(context, "brights-mvp-db", null);
    }

    public static SQLiteDatabase providesSQLiteDatabase(DaoMaster.DevOpenHelper helper) {
        return helper.getWritableDatabase();
    }

    public static DaoMaster providesDaoMaster(SQLiteDatabase sqLiteDatabase) {
        return new DaoMaster(sqLiteDatabase);
    }

    public static DaoSession providesDaoSession(DaoMaster daoMaster) {
        return daoMaster.newSession();
    }

    /**
     * Useful for when needed for testing
     * @param context
     * @return
     */
    public static DaoSession getConfiguredDatabaseSession(final Context context) {
        final DaoMaster.DevOpenHelper devOpenHelper = providesDevOpenHelper(context);
        final SQLiteDatabase sqLiteDatabase = providesSQLiteDatabase(devOpenHelper);
        final DaoMaster daoMaster = providesDaoMaster(sqLiteDatabase);
        final DaoSession daoSession = providesDaoSession(daoMaster);
        return daoSession;
    }

}
