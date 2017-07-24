package com.examples.bright.tutorial.datalayer.comics;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import com.examples.bright.tutorial.datalayer.NetworkUtil;
import com.examples.bright.tutorial.models.common.MarvelWrapper;
import com.examples.bright.tutorial.testutils.FakeServer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import rx.observers.TestSubscriber;

import static org.junit.Assert.assertTrue;

/**
 * I would like to test this layer in complete isolation. That is, I want to test that my data access
 * calls work alone, without caring about any business logic performed on this obtained model.
 * Important to test this layer alone as, I might move this module into another app. At least I
 * can be sure it works alone as a self contained unit.
 *
 * The main server can be hit, but the point is, to test the request and response, so its better to
 * test against a mock response. The mock response is just a copy and paste of the REAL json response
 * I would get back from the server.
 *
 * Created by bright on 23/07/2017.
 */
@RunWith(AndroidJUnit4.class)
public class ComicsServiceTest extends FakeServer {

    private Context testContext;
    private ComicsService comicsService;

    @Before
    public void init() {
        testContext = InstrumentationRegistry.getTargetContext();
        useFakeServer();
        comicsService = NetworkUtil.getConfiguredRetrofit(testContext).create(ComicsService.class);
    }

    @After
    public void cleanUp(){
        performCleanUp();
    }

    @Test
    public void should_get_comic_entities() {

        final TestSubscriber<MarvelWrapper> testSubscriber = TestSubscriber.create();
        comicsService.getComics(10).subscribe(testSubscriber);

        testSubscriber.awaitTerminalEvent();

        final List<MarvelWrapper> onNextEvents = testSubscriber.getOnNextEvents();

        // Make sure onNext was called
        testSubscriber.assertNoErrors();
        testSubscriber.assertReceivedOnNext(onNextEvents);

        final MarvelWrapper marvelWrapper = onNextEvents.get(0);

        // make sure we really have parsed 10 records
        assertTrue(marvelWrapper.getDataEntity().getResults().size() == 10);
    }

}
