package com.examples.bright.tutorial.domainlayer.interactors.comics;

import com.examples.bright.tutorial.domainlayer.abstractions.repository.IComicRepository;
import com.examples.bright.tutorial.domainlayer.model.Comic;

import java.util.List;

import rx.Observable;

/**
 * Created by bright on 17/07/2017.
 */

public class GetComicsUseCase implements IGetComicsUseCase {

    private final static int NO_VAL = -100;
    private int limit = NO_VAL;
    private final IComicRepository comicRepository;


    public GetComicsUseCase(
            final IComicRepository comicRepository) {
        this.comicRepository = comicRepository;
    }

    @Override
    public void setLimit(int limit) {
        this.limit = limit;
    }

    private static List<Comic> checkOurLimitMatchesOurReturnedResults(
            final int limit, final List<Comic> comics) {

        final int size = comics.size();
        if(limit != comics.size()) {
            throw new IllegalStateException("You requested a limit of " + limit + " " +
                    "records but, the actual returned records was " + size);
        }
        return comics;
    }

    @Override
    public Observable<List<Comic>> execute() {
        if(limit == NO_VAL) {
            throw new IllegalStateException("limit needs to be set");
        }

        return comicRepository.getComics(limit)
                .map(comics -> checkOurLimitMatchesOurReturnedResults(limit, comics));
    }
}
