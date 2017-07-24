package com.examples.bright.tutorial.testutils;

import android.app.Activity;
import android.support.test.rule.ActivityTestRule;

/**
 * Created by bright on 24/07/2017.
 */

public class MyTestRule <T extends Activity> extends ActivityTestRule {
    public MyTestRule(Class activityClass) {
        super(activityClass);
    }

    public MyTestRule(Class activityClass, boolean initialTouchMode) {
        super(activityClass, initialTouchMode);
    }

    public MyTestRule(Class activityClass, boolean initialTouchMode, boolean launchActivity) {
        super(activityClass, initialTouchMode, launchActivity);
    }
}
