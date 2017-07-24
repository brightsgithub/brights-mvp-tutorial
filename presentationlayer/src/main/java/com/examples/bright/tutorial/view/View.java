package com.examples.bright.tutorial.view;

/**
 * Created by bright on 17/07/2017.
 */

public interface View {

    void showLoadingState();
    void hideLoadingState();
    void showErrorView(final String errorMessage);
    void hideErrorView();

}
