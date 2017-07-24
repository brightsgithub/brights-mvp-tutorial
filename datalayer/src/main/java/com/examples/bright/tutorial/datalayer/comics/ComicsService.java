package com.examples.bright.tutorial.datalayer.comics;

import com.examples.bright.tutorial.models.common.MarvelWrapper;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by bright on 17/07/2017.
 */
public interface ComicsService {
    @GET("v1/public/comics")
    Observable<MarvelWrapper> getComics(
            @Query("limit") int limit);

}
