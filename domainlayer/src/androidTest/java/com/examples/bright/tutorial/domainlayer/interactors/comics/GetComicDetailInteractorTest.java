package com.examples.bright.tutorial.domainlayer.interactors.comics;

import android.support.test.runner.AndroidJUnit4;

import com.examples.bright.tutorial.domainlayer.model.Comic;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import rx.observers.TestSubscriber;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by bright on 24/07/2017.
 */

@RunWith(AndroidJUnit4.class)
public class GetComicDetailInteractorTest {

    private GetComicDetailInteractor getComicDetailInteractor;

    @Before
    public void init() {
        getComicDetailInteractor = new GetComicDetailUseCase();
    }

    @After
    public void cleanUp(){
    }

    @Test
    public void should_return_comic_detail() {
        final Comic comic = new Comic();
        final TestSubscriber<Comic> testSubscriber = TestSubscriber.create();

        getComicDetailInteractor.getComicDetail(comic).subscribe(testSubscriber);

        testSubscriber.awaitTerminalEvent();

        testSubscriber.assertNoErrors();

        final List<Comic> onNextEvents = testSubscriber.getOnNextEvents();
        final Comic returnedComic = onNextEvents.get(0);

        assertNotNull(returnedComic);
        assertEquals(comic, returnedComic);
    }

    @Test
    public void should_return_error_when_null_comic_supplied() {
        final TestSubscriber<Comic> testSubscriber = TestSubscriber.create();

        getComicDetailInteractor.getComicDetail(null).subscribe(testSubscriber);

        testSubscriber.awaitTerminalEvent();

        // Make sure an IllegalStateException was thrown.
        testSubscriber.assertError(IllegalStateException.class);
    }
}
