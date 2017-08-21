package com.examples.bright.tutorial.datalayer.comics;

import android.util.Log;

import com.examples.bright.tutorial.datalayer.models.common.MarvelWrapper;
import com.examples.bright.tutorial.domainlayer.abstractions.repository.IComicRepository;
import com.examples.bright.tutorial.domainlayer.model.Comic;

import com.examples.bright.tutorial.datalayer.mappers.ComicMapper;

import java.util.List;

import rx.Observable;

/**
 * This class is responsible for deciding which implementation to use, to obtain data for Comics
 * Created by bright on 19/08/2017.
 */

public class ComicRepository implements IComicRepository{

    private final static String TAG = "ComicRepository";

    private ComicsService comicsService;
    private ComicDatabaseHelper comicDatabaseHelper;

    public ComicRepository(ComicsService comicsService, ComicDatabaseHelper comicDatabaseHelper) {
        this.comicsService = comicsService;
        this.comicDatabaseHelper = comicDatabaseHelper;
    }

    public Observable<List<Comic>> getComics(final int limit) {
        if(comicDatabaseHelper.isComicsInDB()) {
            return getComicsfromDB(limit).map(ComicMapper::transformComics);
        } else {
            return getComicsfromServerAndStoreInDB(limit).map(ComicMapper::transformComics);
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
