package com.examples.bright.tutorial;

import android.support.test.espresso.IdlingResource;

/**
 * /**
 * The centerpiece of Espresso is its ability to seamlessly synchronize all test operations
 * with the application being tested. By default, Espresso waits for UI events in the current
 * message queue to be handled and for default instances of AsyncTask to complete before it
 * moves on to the next test operation.

 However, there are instances where applications perform background operations, such as
 communicating with web services, using non-standard means, such as direct creation
 and management of threads.

 In such cases, you have to use idling resources to inform Espresso of the app’s
 long-running operations.


 * Created by bright on 24/07/2017.
 */

public class ElapsedTimeIdlingResource implements IdlingResource {
    private final long startTime;
    private final long waitingTime;
    private ResourceCallback resourceCallback;

    public ElapsedTimeIdlingResource(long waitingTime) {
        this.startTime = System.currentTimeMillis();
        this.waitingTime = waitingTime;
    }

    @Override
    public String getName() {
        return ElapsedTimeIdlingResource.class.getName() + ":" + waitingTime;
    }

    @Override
    public boolean isIdleNow() {
        long elapsed = System.currentTimeMillis() - startTime;
        boolean idle = (elapsed >= waitingTime);
        if (idle) {
            resourceCallback.onTransitionToIdle();
        }
        return idle;
    }

    @Override
    public void registerIdleTransitionCallback(
            ResourceCallback resourceCallback) {
        this.resourceCallback = resourceCallback;
    }
}
