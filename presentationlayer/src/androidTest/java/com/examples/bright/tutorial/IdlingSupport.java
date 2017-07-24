package com.examples.bright.tutorial;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.IdlingPolicies;
import android.support.test.espresso.IdlingResource;

import java.util.concurrent.TimeUnit;

/**
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

public class IdlingSupport {

    private static final long DEFAULT_IDLING_TIME_IN_MILLISECONDS = 5000; // 5 seconds

    private static IdlingResource idlingResource;

    public static void setIdlingPolicies(long waitingTime) {

        IdlingPolicies.setMasterPolicyTimeout(
                waitingTime * 2, TimeUnit.MILLISECONDS);
        IdlingPolicies.setIdlingResourceTimeout(
                waitingTime * 2, TimeUnit.MILLISECONDS);
    }

    public static void setIdlingPoliciesDefault() {

        setIdlingPolicies(DEFAULT_IDLING_TIME_IN_MILLISECONDS);
    }

    public static void waitDefaultTime(){
        idlingResource = new ElapsedTimeIdlingResource(DEFAULT_IDLING_TIME_IN_MILLISECONDS);
        Espresso.registerIdlingResources(idlingResource);
    }

    public static void unregister(){
        Espresso.unregisterIdlingResources(idlingResource);
    }

}
