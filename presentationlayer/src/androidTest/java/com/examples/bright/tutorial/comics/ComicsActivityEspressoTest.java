package com.examples.bright.tutorial.comics;

import android.content.Context;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.NoMatchingViewException;
import android.support.test.espresso.ViewAssertion;
import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.runner.AndroidJUnit4;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.examples.bright.tutorial.IdlingSupport;
import com.examples.bright.tutorial.R;
import com.examples.bright.tutorial.testutils.FakeServer;
import com.examples.bright.tutorial.testutils.MyTestRule;
import com.examples.bright.tutorial.view.comics.ComicDetailActivity;
import com.examples.bright.tutorial.view.comics.ComicsActivity;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;

/**
 * Created by bright on 24/07/2017.
 */

@RunWith(AndroidJUnit4.class)
public class ComicsActivityEspressoTest extends FakeServer {

    // We will start this activity when we are ready
    @Rule
    public MyTestRule<ComicsActivity> mActivityRule =
            new MyTestRule<>(ComicsActivity.class, false, false);

    private Context testContext;

    @Before
    public void init() {
        testContext = InstrumentationRegistry.getTargetContext();
        // We are doing a UI test, not against the real data, as any network issue can occur
        // but what we will do instead is use our fake server.
        useFakeServer();
    }

    @After
    public void cleanUp() {
        performCleanUp();
    }

    @Test
    public void make_sure_comics_list_is_displayed() throws Exception {
        ComicsActivity.LIMIT_OF_COMICS_RECORDS_TO_REQUEST = 10;
        startActivity();

        // Wait until the view is rendered
        IdlingSupport.setIdlingPoliciesDefault();
        IdlingSupport.waitDefaultTime();

        // Check that we can see the view
        ViewInteraction recyclerView = onView(
                allOf(ViewMatchers.withId(R.id.comics_list), isDisplayed()));

        // make sure we have 10 records
        recyclerView.check(new RecyclerViewItemCountAssertion(ComicsActivity.LIMIT_OF_COMICS_RECORDS_TO_REQUEST));
        IdlingSupport.unregister();

    }

    @Test
    public void click_a_comic_row() throws Exception {
        ComicsActivity.LIMIT_OF_COMICS_RECORDS_TO_REQUEST = 10;
        startActivity();

        // Wait until the view is rendered
        IdlingSupport.setIdlingPoliciesDefault();
        IdlingSupport.waitDefaultTime();

        // Check that we can see the view
        ViewInteraction recyclerView = onView(
                allOf(ViewMatchers.withId(R.id.comics_list), isDisplayed()));

        recyclerView.perform(actionOnItemAtPosition(1, click()));

        pressBack();
    }

    @Test
    public void make_sure_comics_list_is_not_displayed() throws Exception {
        ComicsActivity.LIMIT_OF_COMICS_RECORDS_TO_REQUEST = 1;
        final Intent i = new Intent(testContext, ComicDetailActivity.class);
        mActivityRule.launchActivity(i);

        // Wait until the view is rendered
        IdlingSupport.setIdlingPoliciesDefault();
        IdlingSupport.waitDefaultTime();

        IdlingSupport.unregister();

        onView(withId(R.id.comics_list)).check(matches(not(isDisplayed())));
    }

    public class RecyclerViewItemCountAssertion implements ViewAssertion {
        private final int expectedCount;

        public RecyclerViewItemCountAssertion(int expectedCount) {
            this.expectedCount = expectedCount;
        }

        @Override
        public void check(View view, NoMatchingViewException noViewFoundException) {
            if (noViewFoundException != null) {
                throw noViewFoundException;
            }

            RecyclerView recyclerView = (RecyclerView) view;
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            adapter.getItemCount();
            assertThat(adapter.getItemCount(), is(expectedCount));
        }
    }

    private void startActivity() {
        final Intent i = new Intent(testContext, ComicsActivity.class);
        mActivityRule.launchActivity(i);
    }
}
