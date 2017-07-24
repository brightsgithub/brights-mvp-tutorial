package com.examples.bright.tutorial.comics;

import android.content.Context;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;

import com.examples.bright.tutorial.R;
import com.examples.bright.tutorial.datalayer.NetworkUtil;
import com.examples.bright.tutorial.datalayer.comics.ComicsService;
import com.examples.bright.tutorial.domainlayer.interactors.comics.GetComicsInteractor;
import com.examples.bright.tutorial.domainlayer.interactors.comics.GetComicsUseCase;
import com.examples.bright.tutorial.domainlayer.model.Comic;
import com.examples.bright.tutorial.testutils.FakeServer;
import com.examples.bright.tutorial.testutils.MyTestRule;
import com.examples.bright.tutorial.view.comics.ComicDetailActivity;
import com.examples.bright.tutorial.view.comics.ComicsActivity;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;

import rx.observers.TestSubscriber;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.Matchers.not;

/**
 * Created by bright on 24/07/2017.
 */

public class ComicDetailActivityEspressoTest extends FakeServer {

    // We will start this activity when we are ready
    @Rule
    public MyTestRule<ComicDetailActivity> mActivityRule =
            new MyTestRule<>(ComicDetailActivity.class, false, false);

    private Context testContext;
    private ComicsService comicsService;

    @Before
    public void init() {
        testContext = InstrumentationRegistry.getTargetContext();
        // We are doing a UI test, not against the real data, as any network issue can occur
        // but what we will do instead is use our fake server.
        useFakeServer();
        comicsService = NetworkUtil.getConfiguredRetrofit(testContext).create(ComicsService.class);
    }

    @After
    public void cleanUp() {
        performCleanUp();
    }

    @Test
    public void show_comic_detail_view() throws Exception {
        ComicsActivity.LIMIT_OF_COMICS_RECORDS_TO_REQUEST = 10;
        final Comic comic = getComic();
        final String title = comic.getTitle();
        final Intent i = new Intent(testContext, ComicDetailActivity.class);
        i.putExtra(ComicDetailActivity.EXTRA_COMIC, comic);
        mActivityRule.launchActivity(i);

        onView(withId(R.id.title)).check(matches(withText(title)));
    }


    @Test
    public void show_empty_error_comic_detail_view() throws Exception {
        ComicsActivity.LIMIT_OF_COMICS_RECORDS_TO_REQUEST = 10;
        final Comic comic = null;
        final Intent i = new Intent(testContext, ComicDetailActivity.class);
        i.putExtra(ComicDetailActivity.EXTRA_COMIC, comic);
        mActivityRule.launchActivity(i);

        onView(withId(R.id.main_container)).check(matches(not(isDisplayed())));
    }

    /**
     * Get a real comic (from fake server) object so we can really test against.
     * @return
     */
    private Comic getComic() {

        GetComicsInteractor getComicsInteractor = new GetComicsUseCase(comicsService);
        final int recordsRequested = 10;
        final TestSubscriber<List<Comic>> testSubscriber = TestSubscriber.create();
        getComicsInteractor.getComics(recordsRequested).subscribe(testSubscriber);

        testSubscriber.awaitTerminalEvent();

        final List<List<Comic>> onNextEvents = testSubscriber.getOnNextEvents();

        final List<Comic> comics = onNextEvents.get(0);
        return comics.get(2);
    }
}
