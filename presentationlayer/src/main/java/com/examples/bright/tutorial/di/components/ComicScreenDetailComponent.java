package com.examples.bright.tutorial.di.components;

import com.examples.bright.tutorial.di.modules.ActivityScope;
import com.examples.bright.tutorial.di.modules.ComicDetailScreenModule;
import com.examples.bright.tutorial.di.modules.InteractorsModule;
import com.examples.bright.tutorial.di.modules.SchedulersModule;
import com.examples.bright.tutorial.view.comics.ComicDetailActivity;

import dagger.Component;

/**
 * Dagger will implement this interface. The Dagger implementation will be the gateway to accessing
 * the dependencies that the clients will use.
 *
 * Because we are dealing different lifecycles i.e. the Application component vs the Activity
 * component, we provide our own scope here, that this component should live as long as the activity.
 *
 * Created by bright on 17/07/2017.
 */

@ActivityScope
@Component(modules = {ComicDetailScreenModule.class, InteractorsModule.class} )
public interface ComicScreenDetailComponent {

    /**
     * Must be called by the client 'ComicDetailActivity' for injection to occur
     * @param activity
     */
    void inject(ComicDetailActivity activity);
}
