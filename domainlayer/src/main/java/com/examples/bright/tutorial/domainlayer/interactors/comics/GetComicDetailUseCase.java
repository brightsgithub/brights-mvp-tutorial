package com.examples.bright.tutorial.domainlayer.interactors.comics;

import com.examples.bright.tutorial.domainlayer.model.Comic;


import rx.Observable;

/**
 * Created by bright on 19/07/2017.
 */

public class GetComicDetailUseCase implements GetComicDetailInteractor {

    private Comic comic;
    @Override
    public void setComic(Comic comic) {
        this.comic = comic;
    }

    @Override
    public Observable<Comic> execute() {
        return Observable.just(comic)
                .map(comic1 -> checkOurLimitMatchesOurReturnedResults(comic1));
    }


    private static Comic checkOurLimitMatchesOurReturnedResults(Comic comic) {

        if(comic == null) {
            throw new IllegalStateException("Comic cannot be null");
        }
        return comic;
    }
}
