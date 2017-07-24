package com.examples.bright.tutorial.domainlayer.interactors.comics;

import com.examples.bright.tutorial.domainlayer.interactors.UseCase;
import com.examples.bright.tutorial.domainlayer.model.Comic;


import rx.Observable;

/**
 * Created by bright on 19/07/2017.
 */

public class GetComicDetailUseCase extends UseCase implements GetComicDetailInteractor {

    @Override
    public Observable<Comic> getComicDetail(final Comic comic) {
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
