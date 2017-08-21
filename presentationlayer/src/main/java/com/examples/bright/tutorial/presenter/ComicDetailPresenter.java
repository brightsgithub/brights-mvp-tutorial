package com.examples.bright.tutorial.presenter;

import com.examples.bright.tutorial.domainlayer.interactors.comics.GetComicDetailInteractor;
import com.examples.bright.tutorial.domainlayer.model.Authour;
import com.examples.bright.tutorial.domainlayer.model.Comic;
import com.examples.bright.tutorial.domainlayer.model.Price;
import com.examples.bright.tutorial.mappers.MapUIComicToDomain;
import com.examples.bright.tutorial.models.UIComic;
import com.examples.bright.tutorial.utils.ISchedulerUtils;
import com.examples.bright.tutorial.view.comics.ComicDetailView;

import java.util.List;

import rx.Observable;
import rx.Subscriber;

/**
 * Created by bright on 19/07/2017.
 */

public class ComicDetailPresenter {

    private ComicDetailView view;
    private GetComicDetailInteractor getComicDetailInteractor;

    public ComicDetailPresenter(
            final GetComicDetailInteractor getComicDetailInteractor,
            final ISchedulerUtils iSchedulerUtils) {
        this.getComicDetailInteractor = getComicDetailInteractor;
    }

    public void setView(final ComicDetailView view) {
        this.view = view;
    }

    public void loadComicDetail(final UIComic comic) {
        view.hideDetailView();
        view.hideErrorView();
        view.showLoadingState();
        getComicDetailInteractor.setComic(MapUIComicToDomain.transform(comic));
        getComicDetailInteractor.execute().subscribe(new Subscriber<Comic>() {

            @Override
            public void onNext(final Comic comic) {
                view.onComicDetailLoaded(comic);
                populatePrices(comic.getPrices());
                populateAuthors(comic.getAuthours());
            }

            @Override
            public void onCompleted() {
                view.hideLoadingState();
                view.showDetailView();
            }

            @Override
            public void onError(Throwable e) {
                view.hideLoadingState();
                view.showErrorView("some user friendly error message");
                view.hideDetailView();
            }

            private void populatePrices(final List<Price> prices) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Prices:\n");
                for(Price price: prices) {
                    sb.append("£"+price.getPrice()+"\n");
                }
                view.populatePrices(sb.toString());
            }

            private void populateAuthors(final List<Authour> authors) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Authors:\n");
                for(Authour authour: authors) {
                    sb.append("Name: "+authour.getName()+". Role: "+authour.getRole()+"\n");
                }
                view.populateAuthors(sb.toString());
            }
        });
    }
}
