package com.examples.bright.tutorial.domainlayer.interactors;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by bright on 17/07/2017.
 */

public interface UseCase<T> {
    Observable<T> execute();
}
