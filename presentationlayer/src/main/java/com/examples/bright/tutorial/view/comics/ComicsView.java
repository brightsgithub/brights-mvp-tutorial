package com.examples.bright.tutorial.view.comics;


import com.examples.bright.tutorial.domainlayer.model.Comic;
import com.examples.bright.tutorial.view.View;

import java.util.List;

/**
 * Created by bright on 17/07/2017.
 */

public interface ComicsView extends View {

    void onComicsLoaded(final List<Comic> comics);
    void showComicDetailView(final Comic comic);
    void showComicsList();
    void hideComicsList();
}
