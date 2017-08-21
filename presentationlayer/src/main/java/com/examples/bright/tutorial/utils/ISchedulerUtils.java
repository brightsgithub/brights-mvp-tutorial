package com.examples.bright.tutorial.utils;

import rx.Observable;

public interface ISchedulerUtils {

    <T> Observable.Transformer<T, T> applySchedulers();
}
