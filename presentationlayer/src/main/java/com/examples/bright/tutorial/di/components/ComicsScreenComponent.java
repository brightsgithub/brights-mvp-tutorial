package com.examples.bright.tutorial.di.components;

import com.examples.bright.tutorial.di.modules.ActivityScope;
import com.examples.bright.tutorial.di.modules.ComicsScreenModule;
import com.examples.bright.tutorial.di.modules.InteractorsModule;
import com.examples.bright.tutorial.view.comics.ComicsActivity;

import dagger.Component;

/**
 * Dagger will implement this interface. The Dagger implementation will be the gateway to accessing
 * the dependencies that the clients will use.
 *
 * Because we are dealing different lifecycles i.e. the Application component vs the Activity
 * component, we provide our own scope here, that this component should live as long as the activity.
 *
 * Apart from depending on other modules, this class depends on the Component 'ServiceAPIComponent'
 * that has a different scope of singleton. These Singletons will be reused within our included
 * Modules.
 *
 * Created by bright on 17/07/2017.
 */
@ActivityScope
@Component(
        dependencies = ComicsRepositoryComponent.class,
        modules = {ComicsScreenModule.class, InteractorsModule.class}
        )

public interface ComicsScreenComponent {
    /**
     * Must be called by the client 'ComicsActivity' for injection to occur
     * @param activity
     */
    void inject(ComicsActivity activity);
}
