package com.examples.bright.tutorial;

import com.examples.bright.tutorial.domainlayer.interactors.comics.GetComicDetailInteractor;
import com.examples.bright.tutorial.domainlayer.model.Authour;
import com.examples.bright.tutorial.domainlayer.model.Comic;
import com.examples.bright.tutorial.domainlayer.model.Price;
import com.examples.bright.tutorial.models.UIAuthour;
import com.examples.bright.tutorial.models.UIComic;
import com.examples.bright.tutorial.models.UIPrice;
import com.examples.bright.tutorial.presenter.ComicDetailPresenter;
import com.examples.bright.tutorial.utils.ISchedulerUtils;
import com.examples.bright.tutorial.utils.SchedulerUtils;
import com.examples.bright.tutorial.view.comics.ComicDetailView;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import rx.Observable;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by bright on 19/07/2017.
 */

@RunWith(MockitoJUnitRunner.class)
public class ComicDetailPresenterTest extends BaseComicTest{

    @Mock private ComicDetailView mockComicDetailView;
    @Mock private GetComicDetailInteractor mockGetComicDetailInteractor;
    private ISchedulerUtils iSchedulerUtils;
    private ComicDetailPresenter comicsPresenter;

    @Before
    public void initialise() {
        comicsPresenter = new ComicDetailPresenter(mockGetComicDetailInteractor, new SchedulerUtils());
        comicsPresenter.setView(mockComicDetailView);
    }

    @After
    public void cleanUp() {

    }

    @Test
    public void should_load_comic_detail() {
        final Comic comic  = createComic();
        mockGetComicDetailInteractor.setComic(comic);
        when(mockGetComicDetailInteractor.execute()).thenReturn(Observable.just(comic));
        comicsPresenter.loadComicDetail(createUIComic());
        InOrder inOrder = inOrder(mockComicDetailView, mockGetComicDetailInteractor);
        inOrder.verify(mockComicDetailView).hideDetailView();
        inOrder.verify(mockComicDetailView).hideErrorView();
        inOrder.verify(mockComicDetailView).showLoadingState();
        inOrder.verify(mockGetComicDetailInteractor).execute();
        inOrder.verify(mockComicDetailView).onComicDetailLoaded(any(Comic.class));
        inOrder.verify(mockComicDetailView).populatePrices(any(String.class));
        inOrder.verify(mockComicDetailView).populateAuthors(any(String.class));
        inOrder.verify(mockComicDetailView).hideLoadingState();
        inOrder.verify(mockComicDetailView).showDetailView();
    }

    @Test
    public void should_show_error_view() {
        final Comic comic  = null;
        mockGetComicDetailInteractor.setComic(comic);
        when(mockGetComicDetailInteractor.execute()).thenReturn(Observable.error(new IllegalStateException()));
        comicsPresenter.loadComicDetail(createUIComic());
        InOrder inOrder = inOrder(mockComicDetailView, mockGetComicDetailInteractor);
        inOrder.verify(mockComicDetailView).hideDetailView();
        inOrder.verify(mockComicDetailView).hideErrorView();
        inOrder.verify(mockComicDetailView).showLoadingState();
        inOrder.verify(mockGetComicDetailInteractor).execute();
        inOrder.verify(mockComicDetailView).hideLoadingState();
        inOrder.verify(mockComicDetailView).showErrorView(any());
        inOrder.verify(mockComicDetailView).hideDetailView();
    }




}
