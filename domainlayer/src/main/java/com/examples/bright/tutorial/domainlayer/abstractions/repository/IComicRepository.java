package com.examples.bright.tutorial.domainlayer.abstractions.repository;

import com.examples.bright.tutorial.domainlayer.model.Comic;

import java.util.List;

import rx.Observable;

public interface IComicRepository {

    Observable<List<Comic>> getComics(final int limit);
}
