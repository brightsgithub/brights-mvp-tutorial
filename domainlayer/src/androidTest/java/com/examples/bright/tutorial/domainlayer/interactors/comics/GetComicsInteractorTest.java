package com.examples.bright.tutorial.domainlayer.interactors.comics;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import com.examples.bright.tutorial.datalayer.DatabaseUtil;
import com.examples.bright.tutorial.datalayer.NetworkUtil;
import com.examples.bright.tutorial.datalayer.comics.ComicDatabaseHelper;
import com.examples.bright.tutorial.datalayer.comics.ComicRepository;
import com.examples.bright.tutorial.datalayer.comics.ComicsService;
import com.examples.bright.tutorial.domainlayer.model.Comic;
import com.examples.bright.tutorial.models.comic.DaoSession;
import com.examples.bright.tutorial.testutils.FakeServer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import rx.observers.TestSubscriber;

import static org.junit.Assert.assertTrue;

/**
 * Created by bright on 24/07/2017.
 */
@RunWith(AndroidJUnit4.class)
public class GetComicsInteractorTest extends FakeServer {

    private GetComicsInteractor getComicsInteractor;
    private ComicsService comicsService;
    private Context testContext;
    private ComicDatabaseHelper comicDatabaseHelper;

    @Before
    public void init() {
        testContext = InstrumentationRegistry.getTargetContext();
        useFakeServer();
        comicsService = NetworkUtil.getConfiguredRetrofit(testContext).create(ComicsService.class);
        DaoSession daoSession = DatabaseUtil.getConfiguredDatabaseSession(testContext);
        comicDatabaseHelper = new ComicDatabaseHelper(daoSession);
        ComicRepository comicRepository = new ComicRepository(comicsService, comicDatabaseHelper);
        getComicsInteractor = new GetComicsUseCase(comicRepository);
    }

    @After
    public void cleanUp() {
        comicDatabaseHelper.clearDB();
        performCleanUp();
    }

    @Test
    public void should_get_comics() {
        final int recordsRequested = 10;
        final TestSubscriber<List<Comic>> testSubscriber = TestSubscriber.create();
        getComicsInteractor.getComics(recordsRequested).subscribe(testSubscriber);

        testSubscriber.awaitTerminalEvent();

        final List<List<Comic>> onNextEvents = testSubscriber.getOnNextEvents();

        // Make sure onNext was called
        testSubscriber.assertNoErrors();
        testSubscriber.assertReceivedOnNext(onNextEvents);

        final List<Comic> comics = onNextEvents.get(0);

        // make sure we really have parsed 10 records
        assertTrue(comics.size() == recordsRequested);
    }

    @Test
    public void should_show_error_when_incorrect_number_of_comic_records_returned() {
        final int recordsRequested = 100; // we know the fake data only has 10 records
        final TestSubscriber<List<Comic>> testSubscriber = TestSubscriber.create();
        getComicsInteractor.getComics(recordsRequested).subscribe(testSubscriber);

        testSubscriber.awaitTerminalEvent();

        // Make sure an IllegalStateException was thrown.
        testSubscriber.assertError(IllegalStateException.class);
    }
}
