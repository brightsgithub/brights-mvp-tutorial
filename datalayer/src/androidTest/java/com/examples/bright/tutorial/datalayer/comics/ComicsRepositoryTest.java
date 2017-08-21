package com.examples.bright.tutorial.datalayer.comics;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.examples.bright.tutorial.datalayer.DatabaseUtil;
import com.examples.bright.tutorial.datalayer.NetworkUtil;
import com.examples.bright.tutorial.models.comic.DaoSession;
import com.examples.bright.tutorial.models.common.MarvelWrapper;
import com.examples.bright.tutorial.testutils.FakeServer;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import rx.Subscriber;
import rx.observers.TestSubscriber;

import static org.junit.Assert.assertTrue;

/**
 * Created by bright on 20/08/2017.
 */
@RunWith(AndroidJUnit4.class)
public class ComicsRepositoryTest extends FakeServer {

    private Context testContext;
    private ComicsService comicsService;
    private ComicDatabaseHelper comicDatabaseHelper;
    private DaoSession daoSession;
    private ComicRepository comicRepository;

    @Before
    public void init() {
        testContext = InstrumentationRegistry.getTargetContext();
        useFakeServer();
        comicsService = NetworkUtil.getConfiguredRetrofit(testContext).create(ComicsService.class);
        daoSession = DatabaseUtil.getConfiguredDatabaseSession(testContext);
        comicDatabaseHelper = new ComicDatabaseHelper(daoSession);
        comicRepository = new ComicRepository(comicsService, comicDatabaseHelper);

        comicDatabaseHelper.clearDB();
    }

    @After
    public void cleanUp(){
        performCleanUp();
        comicDatabaseHelper.clearDB();
    }

    @Test
    public void should_get_comic_entities_from_server() {

        final TestSubscriber<MarvelWrapper> testSubscriber = TestSubscriber.create();
        comicRepository.getComicsfromServerAndStoreInDB(10).subscribe(testSubscriber);

        testSubscriber.awaitTerminalEvent();

        final List<MarvelWrapper> onNextEvents = testSubscriber.getOnNextEvents();

        // Make sure onNext was called
        testSubscriber.assertNoErrors();
        testSubscriber.assertReceivedOnNext(onNextEvents);

        final MarvelWrapper marvelWrapper = onNextEvents.get(0);

        // make sure we really have parsed 10 records
        assertTrue(marvelWrapper.getDataEntity().getResults().size() == 10);
    }

    @Test
    public void should_get_comic_entities_from_local_db() {

        // Get from the server first and confirm
        final TestSubscriber<MarvelWrapper> testSubscriber = TestSubscriber.create();
        comicRepository.getComicsfromServerAndStoreInDB(10).subscribe(testSubscriber);

        testSubscriber.awaitTerminalEvent();

        final List<MarvelWrapper> onNextEvents = testSubscriber.getOnNextEvents();

        // Make sure onNext was called
        testSubscriber.assertNoErrors();
        testSubscriber.assertReceivedOnNext(onNextEvents);

        final MarvelWrapper marvelWrapper = onNextEvents.get(0);

        assertTrue(marvelWrapper.getDataEntity().getResults().size() == 10);




        // now get from the DB
        final TestSubscriber<MarvelWrapper> testSubscriber2 = TestSubscriber.create();

        comicRepository.getComicsfromDB(10).subscribe(new Subscriber<MarvelWrapper>() {
            @Override
            public void onCompleted() {
                Log.v("ComicsRepositoryTest", "onCompleted()");
            }

            @Override
            public void onError(Throwable e) {
                Assert.fail(e.getMessage());
            }

            @Override
            public void onNext(MarvelWrapper marvelWrapper) {
                Log.v("ComicsRepositoryTest", "onNext()");
                assertTrue(marvelWrapper.getDataEntity().getResults().size() == 10);
            }
        });
    }
}
