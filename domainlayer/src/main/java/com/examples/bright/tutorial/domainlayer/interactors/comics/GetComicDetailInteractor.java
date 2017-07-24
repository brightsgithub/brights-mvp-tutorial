package com.examples.bright.tutorial.domainlayer.interactors.comics;

import com.examples.bright.tutorial.domainlayer.model.Comic;

import rx.Observable;

/**
 * Created by bright on 19/07/2017.
 */

public interface GetComicDetailInteractor {

    Observable<Comic> getComicDetail(final Comic comic);

}
