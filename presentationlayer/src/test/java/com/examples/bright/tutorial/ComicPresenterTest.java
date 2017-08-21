package com.examples.bright.tutorial;

import com.examples.bright.tutorial.domainlayer.interactors.comics.IGetComicsUseCase;
import com.examples.bright.tutorial.domainlayer.model.Comic;
import com.examples.bright.tutorial.presenter.ComicsPresenter;
import com.examples.bright.tutorial.utils.ISchedulerUtils;
import com.examples.bright.tutorial.utils.SchedulerUtils;
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
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


/**
 * Created by bright on 17/07/2017.
 */

@RunWith(MockitoJUnitRunner.class)
public class ComicPresenterTest extends BaseComicTest {

    @Mock private ComicsView mockComicsView;
    @Mock private IGetComicsUseCase mockIGetComicsUseCase;
    private ISchedulerUtils iSchedulerUtils;
    Observable.Transformer<Observable<Comic>, Observable<Comic>> t;
    private ComicsPresenter comicsPresenter;
    private final static int LIMIT = 10;

    @Before
    public void initialise() {
        iSchedulerUtils = new FakeScheduler();
        comicsPresenter = new ComicsPresenter(mockIGetComicsUseCase, iSchedulerUtils);
        comicsPresenter.setView(mockComicsView);
    }

    @After
    public void cleanUp() {

    }

    @Test
    public void should_load_comics() {
        mockIGetComicsUseCase.setLimit(LIMIT);
        List<Comic> comicList = createComics(LIMIT);
        when(mockIGetComicsUseCase.execute()).thenReturn(Observable.just(comicList));
        comicsPresenter.loadComics(LIMIT);
        InOrder inOrder = inOrder(mockComicsView, mockIGetComicsUseCase);
        inOrder.verify(mockComicsView).hideComicsList();
        inOrder.verify(mockComicsView).hideErrorView();
        inOrder.verify(mockComicsView).showLoadingState();
        inOrder.verify(mockIGetComicsUseCase).setLimit(LIMIT);
        inOrder.verify(mockIGetComicsUseCase).execute();
        inOrder.verify(mockComicsView).onComicsLoaded(any(List.class));
        inOrder.verify(mockComicsView).hideLoadingState();
        inOrder.verify(mockComicsView).showComicsList();
    }

    @Test
    public void should_show_error_view() {
        mockIGetComicsUseCase.setLimit(LIMIT);
        when(mockIGetComicsUseCase.execute()).thenReturn(Observable.error(new RuntimeException()));
        comicsPresenter.loadComics(LIMIT);
        InOrder inOrder = inOrder(mockComicsView, mockIGetComicsUseCase);
        inOrder.verify(mockComicsView).hideComicsList();
        inOrder.verify(mockComicsView).hideErrorView();
        inOrder.verify(mockComicsView).showLoadingState();
        inOrder.verify(mockIGetComicsUseCase).execute();
        inOrder.verify(mockComicsView).hideComicsList();
        inOrder.verify(mockComicsView).hideLoadingState();
        inOrder.verify(mockComicsView).showErrorView(any());
    }
}
