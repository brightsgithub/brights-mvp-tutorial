package com.examples.bright.tutorial.view.comics;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.examples.bright.tutorial.R;
import com.examples.bright.tutorial.di.components.DaggerComicScreenDetailComponent;
import com.examples.bright.tutorial.di.modules.ComicDetailScreenModule;
import com.examples.bright.tutorial.domainlayer.model.Comic;
import com.examples.bright.tutorial.presenter.ComicDetailPresenter;
import com.examples.bright.tutorial.view.BaseActivity;

import javax.inject.Inject;

import butterknife.BindView;

/**
 * Created by bright on 19/07/2017.
 */

public class ComicDetailActivity extends BaseActivity implements ComicDetailView {

    public static final String EXTRA_COMIC = "com.examples.bright.tutorial.view.comics.EXTRA_COMIC";
    private ComicDetailPresenter comicDetailPresenter;

    @BindView(R.id.progress_bar)
    View progressBar;

    @BindView(R.id.main_container)
    View container;

    @BindView(R.id.title)
    TextView title;

    @BindView(R.id.description)
    TextView description;

    @BindView(R.id.page_count)
    TextView pageCount;

    @BindView(R.id.price)
    TextView price;

    @BindView(R.id.authors)
    TextView authour;


    public static void create(final Context context, final Comic comic) {
        final Intent i = new Intent(context, ComicDetailActivity.class);
        i.putExtra(EXTRA_COMIC, comic);
        context.startActivity(i);
    }

    @Inject
    public void setComicDetailPresenter(ComicDetailPresenter comicDetailPresenter) {
        this.comicDetailPresenter = comicDetailPresenter;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadComicDetail();
    }

    private void loadComicDetail() {
        final Comic comic = getIntent().getParcelableExtra(EXTRA_COMIC);
        comicDetailPresenter.loadComicDetail(comic);
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
    public void showDetailView() {
        container.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideDetailView() {
        container.setVisibility(View.GONE);
    }

    @Override
    public void showErrorView(String errorMessage) {

    }

    @Override
    public void hideErrorView() {

    }

    @Override
    public void initView() {
        setContentView(R.layout.comic_detail_layout);
    }

    @Override
    public void initDependencies() {

        DaggerComicScreenDetailComponent.builder()
                .comicDetailScreenModule(new ComicDetailScreenModule())
                .build()
                .inject(this);
    }

    @Override
    public void bindViewWithPresenter() {
        comicDetailPresenter.setView(this);
    }

    @Override
    public void onComicDetailLoaded(Comic comic) {
        title.setText(comic.getTitle());
        description.setText(comic.getDescription());
        pageCount.setText("Page Count: "+ comic.getPageCount());
    }

    @Override
    public void populatePrices(final String prices) {
        price.setText(prices);
    }

    @Override
    public void populateAuthors(final String authors) {
        authour.setText(authors);
    }
}
