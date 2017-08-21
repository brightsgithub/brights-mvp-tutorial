package com.examples.bright.tutorial.di.modules;

import com.examples.bright.tutorial.di.components.ServiceAPIComponent;
import com.examples.bright.tutorial.domainlayer.abstractions.repository.IComicRepository;
import com.examples.bright.tutorial.domainlayer.interactors.comics.IGetComicsUseCase;
import com.examples.bright.tutorial.presenter.ComicsPresenter;
import com.examples.bright.tutorial.utils.ISchedulerUtils;

import dagger.Module;
import dagger.Provides;

/**
 * This module is the dependency setup for the ComicsActivity.
 * @ActivityScope is used since the component is also @ActivityScope.
 * Two reasons for this:
 * 1) We only want these dependencies around for as long as the Activity lives
 * 2) In Dagger, two dependent components cannot share the same scope i.e
 * our @{@link ServiceAPIComponent}
 * and @{@link com.examples.bright.tutorial.di.components.ComicsScreenComponent}
 * cannot share the scope of @Singlton. So we create a custom  scope
 * called @ActivityScope to be used by our ComicsScreenComponent and ComicsScreenModule
 * Created by bright on 17/07/2017.
 */

@Module(includes = {SchedulersModule.class})
public class ComicsScreenModule {

    /**
     * Provides a Presenter
     * @param IGetComicsUseCase
     * @return
     */
    @Provides
    @ActivityScope
    public ComicsPresenter providesComicsPresenter(
            final IGetComicsUseCase IGetComicsUseCase,
            final ISchedulerUtils iSchedulerUtils) {
        return new ComicsPresenter(IGetComicsUseCase, iSchedulerUtils);
    }
}
