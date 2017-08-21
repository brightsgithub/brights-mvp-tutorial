package com.examples.bright.tutorial.view.comics;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;


import com.examples.bright.tutorial.MyApplication;
import com.examples.bright.tutorial.R;
import com.examples.bright.tutorial.di.components.DaggerComicsScreenComponent;
import com.examples.bright.tutorial.di.modules.ComicsScreenModule;
import com.examples.bright.tutorial.domainlayer.model.Comic;
import com.examples.bright.tutorial.presenter.ComicsPresenter;
import com.examples.bright.tutorial.view.BaseActivity;
import com.examples.bright.tutorial.view.OnItemClickListener;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;

/**
 * Created by bright on 17/07/2017.
 */

public class ComicsActivity extends BaseActivity implements ComicsView {

    @BindView(R.id.comics_list)
    RecyclerView recyclerView;
    @BindView(R.id.progress_bar)
    View progressBar;

    private ComicsPresenter comicsPresenter;
    public static int LIMIT_OF_COMICS_RECORDS_TO_REQUEST = 100;

    @Inject
    public void setComicsPresenter(ComicsPresenter comicsPresenter) {
        this.comicsPresenter = comicsPresenter;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadComics(LIMIT_OF_COMICS_RECORDS_TO_REQUEST);
    }

    private void loadComics(final int limit) {
        comicsPresenter.loadComics(limit);
    }

    @Override
    public void showLoadingState() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoadingState() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void showComicsList() {
        recyclerView.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideComicsList() {
        recyclerView.setVisibility(View.GONE);
    }

    @Override
    public void showErrorView(String errorMessage) {
        // TODO
    }

    @Override
    public void hideErrorView() {
        // TODO
    }

    @Override
    public void initView() {
        setContentView(R.layout.comics_layout);
    }

    @Override
    public void initDependencies() {
        DaggerComicsScreenComponent.builder()
                .comicsRepositoryComponent(MyApplication.get().getComicsRepositoryComponent())
                .comicsScreenModule(new ComicsScreenModule())
                .build().inject(this);
    }

    @Override
    public void bindViewWithPresenter() {
        comicsPresenter.setView(this);
    }

    protected final OnItemClickListener<Comic> itemClickListener = comic -> {
        comicsPresenter.onComicClicked(comic);
    };

    @Override
    public void onComicsLoaded(final List<Comic> comics) {
        final LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        final ComicsAdaptor adapter = new ComicsAdaptor(comics);

        if (itemClickListener != null) {
            adapter.setOnItemClickListener(itemClickListener);
        }

        recyclerView.setAdapter(adapter);
    }

    @Override
    public void showComicDetailView(Comic comic) {
        // Should use a navigator
        ComicDetailActivity.create(this,comic);
    }


}
