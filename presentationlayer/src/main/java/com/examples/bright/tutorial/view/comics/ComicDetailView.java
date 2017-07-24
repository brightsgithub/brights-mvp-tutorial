package com.examples.bright.tutorial.view.comics;

import com.examples.bright.tutorial.domainlayer.model.Comic;
import com.examples.bright.tutorial.view.View;

/**
 * Created by bright on 19/07/2017.
 */

public interface ComicDetailView extends View {

    void onComicDetailLoaded(final Comic comic);
    void showDetailView();
    void hideDetailView();
    void populatePrices(final String prices);
    void populateAuthors(final String authors);
}
