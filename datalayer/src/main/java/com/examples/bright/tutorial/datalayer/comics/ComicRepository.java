package com.examples.bright.tutorial.datalayer.comics;

import android.util.Log;

import com.examples.bright.tutorial.models.common.MarvelWrapper;

import rx.Observable;

/**
 * This class is responsible for deciding which implementation to use, to obtain data for Comics
 * Created by bright on 19/08/2017.
 */

public class ComicRepository {

    private final static String TAG = "ComicRepository";

    private ComicsService comicsService;
    private ComicDatabaseHelper comicDatabaseHelper;

    public ComicRepository(ComicsService comicsService, ComicDatabaseHelper comicDatabaseHelper) {
        this.comicsService = comicsService;
        this.comicDatabaseHelper = comicDatabaseHelper;
    }

    public Observable<MarvelWrapper> getComics(final int limit) {
        if(comicDatabaseHelper.isComicsInDB()) {
            return getComicsfromDB(limit);
        } else {
            return getComicsfromServerAndStoreInDB(limit);
        }
    }

    protected Observable<MarvelWrapper> getComicsfromDB(final int limit) {
        Log.v(TAG, "Getting MarvelWrapper from LOCAL STORAGE!");
        return Observable.just(comicDatabaseHelper.getMarvelWrapperfromDB());
    }

    protected Observable<MarvelWrapper> getComicsfromServerAndStoreInDB(final int limit) {
        Log.v(TAG, "Getting MarvelWrapper from WEBSERVICE!");
        return comicsService.getComics(limit)
                .doOnNext(marvelWrapper -> comicDatabaseHelper.saveComicsIntoDB(marvelWrapper));
    }
}
