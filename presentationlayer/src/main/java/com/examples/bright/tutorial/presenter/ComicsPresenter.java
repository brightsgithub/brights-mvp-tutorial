package com.examples.bright.tutorial.presenter;

import com.examples.bright.tutorial.domainlayer.interactors.comics.IGetComicsUseCase;
import com.examples.bright.tutorial.domainlayer.model.Comic;
import com.examples.bright.tutorial.mappers.MapDomainComicToUI;
import com.examples.bright.tutorial.models.UIComic;
import com.examples.bright.tutorial.utils.ISchedulerUtils;
import com.examples.bright.tutorial.view.comics.ComicsView;

import java.util.List;

import rx.Subscriber;

/**
 * This Presenter is responsible for handling user requests from the UI.
 * No Framework i.e. Android related framework will be in here, so that we can unit test easily.
 * Created by bright on 17/07/2017.
 */

public class ComicsPresenter implements IComicPresenter {

    private ComicsView view;
    private IGetComicsUseCase getComicsUseCase;
    private static final String TAG = "ComicsPresenter";
    private final ISchedulerUtils schedulerUtils;

    public ComicsPresenter(
            final IGetComicsUseCase IGetComicsUseCase,
            final ISchedulerUtils schedulerUtils) {
        this.getComicsUseCase = IGetComicsUseCase;
        this.schedulerUtils = schedulerUtils;
    }

    public void setView(final ComicsView view) {
        this.view = view;
    }

    /**
     * The purpose of this method is to load comics bassed on the given limit of records.
     * @param limit limit of records that can be returned.
     */
    @Override
    public void loadComics(final int limit) {
        view.hideComicsList();
        view.hideErrorView();
        view.showLoadingState();
        getComicsUseCase.setLimit(limit);
        getComicsUseCase
                .execute()
                .compose(schedulerUtils.applySchedulers())
        .subscribe(new Subscriber<List<Comic>>() {

            @Override
            public void onNext(final List<Comic> comics) {
                final List<UIComic> uiComics = MapDomainComicToUI.transform(comics);
                view.onComicsLoaded(uiComics);
            }

            @Override
            public void onCompleted() {
                view.hideLoadingState();
                view.showComicsList();
            }

            @Override
            public void onError(Throwable e) {
                e.printStackTrace();
                view.hideComicsList();
                view.hideLoadingState();
                view.showErrorView("some user friendly error message");
            }
        });
    }

    public void onComicClicked(final UIComic comic) {
        view.showComicDetailView(comic);
    }
}
