package com.examples.bright.tutorial;

import com.examples.bright.tutorial.domainlayer.interactors.comics.GetComicDetailInteractor;
import com.examples.bright.tutorial.domainlayer.model.Comic;
import com.examples.bright.tutorial.presenter.ComicDetailPresenter;
import com.examples.bright.tutorial.view.comics.ComicDetailView;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import rx.Observable;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by bright on 19/07/2017.
 */

@RunWith(MockitoJUnitRunner.class)
public class ComicDetailPresenterTest {

    @Mock private ComicDetailView mockComicDetailView;
    @Mock private GetComicDetailInteractor mockGetComicDetailInteractor;

    private ComicDetailPresenter comicsPresenter;

    @Before
    public void initialise() {
        comicsPresenter = new ComicDetailPresenter(mockGetComicDetailInteractor);
        comicsPresenter.setView(mockComicDetailView);
    }

    @After
    public void cleanUp() {

    }

    @Test
    public void should_load_comic_detail() {
        final Comic comic  = new Comic();
        Comic mockComic = mock(Comic.class);
        when(mockGetComicDetailInteractor.getComicDetail(comic)).thenReturn(Observable.just(mockComic));
        comicsPresenter.loadComicDetail(comic);
        InOrder inOrder = inOrder(mockComicDetailView, mockGetComicDetailInteractor);
        inOrder.verify(mockComicDetailView).hideDetailView();
        inOrder.verify(mockComicDetailView).hideErrorView();
        inOrder.verify(mockComicDetailView).showLoadingState();
        inOrder.verify(mockGetComicDetailInteractor).getComicDetail(comic);
        inOrder.verify(mockComicDetailView).onComicDetailLoaded(any(Comic.class));
        inOrder.verify(mockComicDetailView).populatePrices(any(String.class));
        inOrder.verify(mockComicDetailView).populateAuthors(any(String.class));
        inOrder.verify(mockComicDetailView).hideLoadingState();
        inOrder.verify(mockComicDetailView).showDetailView();
    }

    @Test
    public void should_show_error_view() {
        final Comic comic  = null;
        when(mockGetComicDetailInteractor.getComicDetail(comic)).thenReturn(Observable.error(new IllegalStateException()));
        comicsPresenter.loadComicDetail(comic);
        InOrder inOrder = inOrder(mockComicDetailView, mockGetComicDetailInteractor);
        inOrder.verify(mockComicDetailView).hideDetailView();
        inOrder.verify(mockComicDetailView).hideErrorView();
        inOrder.verify(mockComicDetailView).showLoadingState();
        inOrder.verify(mockGetComicDetailInteractor).getComicDetail(comic);
        inOrder.verify(mockComicDetailView).hideLoadingState();
        inOrder.verify(mockComicDetailView).showErrorView(any());
        inOrder.verify(mockComicDetailView).hideDetailView();
    }

}
