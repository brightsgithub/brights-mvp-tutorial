package com.examples.bright.tutorial.domainlayer.interactors.comics;

import com.examples.bright.tutorial.domainlayer.model.Comic;


import java.util.List;

import rx.Observable;

/**
 * Created by bright on 17/07/2017.
 */

public interface GetComicsInteractor {

    Observable<List<Comic>> getComics(final int limit);

}
