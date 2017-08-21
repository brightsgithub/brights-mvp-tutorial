package com.examples.bright.tutorial.domainlayer;

import com.examples.bright.tutorial.domainlayer.abstractions.repository.IComicRepository;
import com.examples.bright.tutorial.domainlayer.interactors.comics.GetComicsUseCase;
import com.examples.bright.tutorial.domainlayer.interactors.comics.IGetComicsUseCase;
import com.examples.bright.tutorial.domainlayer.model.Comic;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import rx.Observable;
import rx.observers.TestSubscriber;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

/**
 * Created by bright on 24/07/2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class GetComicsInteractorTest {


    private IGetComicsUseCase getComicsUseCase;

    @Mock
    private IComicRepository iComicRepository;


    @Before
    public void init() {
        getComicsUseCase = new GetComicsUseCase(iComicRepository);
    }

    @After
    public void cleanUp() {

    }

    @Test
    public void should_get_comics() {
        final int recordsRequested = 10;
        final TestSubscriber<List<Comic>> testSubscriber = TestSubscriber.create();
        List<Comic> comicsFromRepo = getFakeComics(recordsRequested);
        when(iComicRepository.getComics(recordsRequested)).thenReturn(Observable.just(comicsFromRepo));

        getComicsUseCase.setLimit(recordsRequested);
        getComicsUseCase.execute().subscribe(testSubscriber);

        testSubscriber.awaitTerminalEvent();

        final List<List<Comic>> onNextEvents = testSubscriber.getOnNextEvents();

        // Make sure onNext was called
        testSubscriber.assertNoErrors();
        testSubscriber.assertReceivedOnNext(onNextEvents);

        final List<Comic> comics = onNextEvents.get(0);

        // make sure we really have parsed 10 records
        assertTrue(comics.size() == recordsRequested);
    }

    @Test
    public void should_show_error_when_incorrect_number_of_comic_records_returned() {
        final int recordsRequested = 10; // we know the fake data only has 10 records
        final TestSubscriber<List<Comic>> testSubscriber = TestSubscriber.create();
        List<Comic> comicsFromRepo = getFakeComics(recordsRequested);
        when(iComicRepository.getComics(100)).thenReturn(Observable.just(comicsFromRepo));

        getComicsUseCase.setLimit(100);
        getComicsUseCase.execute().subscribe(testSubscriber);

        testSubscriber.awaitTerminalEvent();

        // Make sure an IllegalStateException was thrown.
        testSubscriber.assertError(IllegalStateException.class);
    }

    private List<Comic> getFakeComics(int amount) {
        List<Comic> comicsFromRepo = new ArrayList<>();
        for(int i = 0; i <amount; i++) {
            comicsFromRepo.add(new Comic());
        }
        return comicsFromRepo;
    }
}
