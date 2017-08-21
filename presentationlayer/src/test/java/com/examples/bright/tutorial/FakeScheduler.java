package com.examples.bright.tutorial;

import com.examples.bright.tutorial.utils.ISchedulerUtils;

import rx.Observable;

public class FakeScheduler implements ISchedulerUtils{
    @Override
    public <T> Observable.Transformer<T, T> applySchedulers() {
        return new Observable.Transformer<T, T>() {
            @Override
            public Observable<T> call(Observable<T> observable) {
                return observable;
            }
        };
    }
}
