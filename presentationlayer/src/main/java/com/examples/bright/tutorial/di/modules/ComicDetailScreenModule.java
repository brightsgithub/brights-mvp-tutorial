package com.examples.bright.tutorial.di.modules;

import com.examples.bright.tutorial.domainlayer.interactors.comics.GetComicDetailInteractor;
import com.examples.bright.tutorial.presenter.ComicDetailPresenter;


import dagger.Module;
import dagger.Provides;

/**
 * This module is the dependency setup for the ComicsActivity.
 * @ActivityScope is used since the component is also @ActivityScope and
 * We only want these dependencies around for as long as the Activity lives
 *
 * Created by bright on 17/07/2017.
 */
@Module
public class ComicDetailScreenModule {

    /**
     * Provides a ComicDetailPresenter
     * @param getComicDetailInteractor
     * @return
     */
    @Provides
    @ActivityScope
    public ComicDetailPresenter providesComicDetailPresenter(
            GetComicDetailInteractor getComicDetailInteractor) {
        return new ComicDetailPresenter(getComicDetailInteractor);
    }
}
