package com.examples.bright.tutorial.view.comics;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.examples.bright.tutorial.R;
import com.examples.bright.tutorial.domainlayer.model.Comic;
import com.examples.bright.tutorial.view.listeners.OnItemClickListener;
import com.examples.bright.tutorial.view.listeners.OnLoadMoreListener;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by bright on 18/07/2017.
 */

public class ComicsAdaptor extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private OnItemClickListener<Comic> itemClickListener;
    private List<Comic> items;
    private final int VIEW_ITEM = 1;
    private final int VIEW_PROG = 0;

    // The minimum amount of items to have below your current scroll position
    // before loading more.
    private int visibleThreshold = 5;
    private int lastVisibleItem, totalItemCount;
    private boolean loading;
    private OnLoadMoreListener onLoadMoreListener;

    public ComicsAdaptor(final List<Comic> items, RecyclerView recyclerView) {

        if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {

            final LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView
                    .getLayoutManager();
            recyclerView
                    .addOnScrollListener(new RecyclerView.OnScrollListener() {
                        @Override
                        public void onScrolled(RecyclerView recyclerView,
                                               int dx, int dy) {
                            super.onScrolled(recyclerView, dx, dy);

                            totalItemCount = linearLayoutManager.getItemCount();
                            lastVisibleItem = linearLayoutManager
                                    .findLastVisibleItemPosition();
                            if (!loading
                                    && totalItemCount <= (lastVisibleItem + visibleThreshold)) {
                                // End has been reached
                                // Do something
                                if (onLoadMoreListener != null) {
                                    onLoadMoreListener.onLoadMore();
                                }
                                loading = true;
                            }
                        }
                    });
        }

        this.items = items;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final Context context = parent.getContext();

        RecyclerView.ViewHolder vh;

        if (viewType == VIEW_ITEM) {
            final View view = LayoutInflater.from(context).inflate(R.layout.row_comic
                    , parent, false);

            vh = new ComicViewHolder(view);
        } else {
            View v = LayoutInflater.from(parent.getContext()).inflate(
                    R.layout.progressbar, parent, false);

            vh = new ProgressViewHolder(v);
        }
        return vh;

    }

    public void setOnItemClickListener(
            final OnItemClickListener<Comic> onItemClickListener) {
        this.itemClickListener = onItemClickListener;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {

        if (viewHolder instanceof ComicViewHolder) {
            final Comic item = items.get(position);
            populateRow((ComicViewHolder)viewHolder, item, position);
            initOnClickListener((ComicViewHolder)viewHolder, item);
        } else {
            ((ProgressViewHolder) viewHolder).progressBar.setIndeterminate(true);
        }

    }

    public void setLoaded() {
        loading = false;
    }

    public void setOnLoadMoreListener(OnLoadMoreListener onLoadMoreListener) {
        this.onLoadMoreListener = onLoadMoreListener;
    }

    private void populateRow(ComicViewHolder viewHolder, Comic item, int position) {
        viewHolder.title.setText(item.getTitle());
        viewHolder.rowNumber.setText(String.valueOf((position+1)));
        final Context context = viewHolder.thumbnail.getContext();
        Picasso.with(context).load(item.getThumbnail()).into(viewHolder.thumbnail);
    }

    private void initOnClickListener(final ComicViewHolder viewHolder, final Comic comic) {
        if (itemClickListener != null) {
            viewHolder.itemView.setOnClickListener(v -> itemClickListener.onItemClick(comic));
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class ComicViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.thumbnail)
        ImageView thumbnail;

        @BindView(R.id.title)
        TextView title;

        @BindView(R.id.row_number)
        TextView rowNumber;

        public ComicViewHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);
        }
    }

    public static class ProgressViewHolder extends RecyclerView.ViewHolder {
        public ProgressBar progressBar;

        public ProgressViewHolder(View v) {
            super(v);
            progressBar = (ProgressBar) v.findViewById(R.id.progressBar1);
        }
    }

    @Override
    public int getItemViewType(int position) {
        return items.get(position) != null ? VIEW_ITEM : VIEW_PROG;
    }

}
