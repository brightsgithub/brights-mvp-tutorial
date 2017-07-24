package com.examples.bright.tutorial;

import com.examples.bright.tutorial.domainlayer.interactors.comics.GetComicsInteractor;
import com.examples.bright.tutorial.presenter.ComicsPresenter;
import com.examples.bright.tutorial.view.comics.ComicsView;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.when;

import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import rx.Observable;


/**
 * Created by bright on 17/07/2017.
 */

@RunWith(MockitoJUnitRunner.class)
public class ComicPresenterTest {

    @Mock private ComicsView mockComicsView;
    @Mock private GetComicsInteractor mockGetComicsInteractor;

    private ComicsPresenter comicsPresenter;
    private final static int LIMIT = 10;

    @Before
    public void initialise() {
        comicsPresenter = new ComicsPresenter(mockGetComicsInteractor);
        comicsPresenter.setView(mockComicsView);
    }

    @After
    public void cleanUp() {

    }

    @Test
    public void should_load_comics() {
        when(mockGetComicsInteractor.getComics(LIMIT)).thenReturn(Observable.just(new ArrayList<>()));
        comicsPresenter.loadComics(LIMIT);
        InOrder inOrder = inOrder(mockComicsView, mockGetComicsInteractor);
        inOrder.verify(mockComicsView).hideComicsList();
        inOrder.verify(mockComicsView).hideErrorView();
        inOrder.verify(mockComicsView).showLoadingState();
        inOrder.verify(mockGetComicsInteractor).getComics(LIMIT);
        inOrder.verify(mockComicsView).onComicsLoaded(any(List.class));
        inOrder.verify(mockComicsView).hideLoadingState();
        inOrder.verify(mockComicsView).showComicsList();
    }

    @Test
    public void should_show_error_view() {
        when(mockGetComicsInteractor.getComics(LIMIT)).thenReturn(Observable.error(new RuntimeException()));
        comicsPresenter.loadComics(LIMIT);
        InOrder inOrder = inOrder(mockComicsView, mockGetComicsInteractor);
        inOrder.verify(mockComicsView).hideComicsList();
        inOrder.verify(mockComicsView).hideErrorView();
        inOrder.verify(mockComicsView).showLoadingState();
        inOrder.verify(mockGetComicsInteractor).getComics(LIMIT);
        inOrder.verify(mockComicsView).hideComicsList();
        inOrder.verify(mockComicsView).hideLoadingState();
        inOrder.verify(mockComicsView).showErrorView(any());
    }
}
