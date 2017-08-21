package com.examples.bright.tutorial.view.comics;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.examples.bright.tutorial.R;
import com.examples.bright.tutorial.domainlayer.model.Comic;
import com.examples.bright.tutorial.models.UIComic;
import com.examples.bright.tutorial.view.OnItemClickListener;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by bright on 18/07/2017.
 */

public class ComicsAdaptor extends RecyclerView.Adapter<ComicsAdaptor.ComicViewHolder> {

    private OnItemClickListener<UIComic> itemClickListener;
    private List<UIComic> items;

    public ComicsAdaptor(final List<UIComic> items) {
        this.items = items;
    }

    @Override
    public ComicViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final Context context = parent.getContext();
        final View view = LayoutInflater.from(context).inflate(R.layout.row_comic
                , parent, false);
        return new ComicViewHolder(view);
    }

    public void setOnItemClickListener(
            final OnItemClickListener<UIComic> onItemClickListener) {
        this.itemClickListener = onItemClickListener;
    }

    @Override
    public void onBindViewHolder(ComicViewHolder viewHolder, int position) {
        final UIComic item = items.get(position);
        populateRow(viewHolder, item, position);
        initOnClickListener(viewHolder, item);
    }

    private void populateRow(ComicViewHolder viewHolder, UIComic item, int position) {
        viewHolder.title.setText(item.getTitle());
        viewHolder.rowNumber.setText(String.valueOf((position+1)));
        final Context context = viewHolder.thumbnail.getContext();
        Picasso.with(context).load(item.getThumbnail()).into(viewHolder.thumbnail);
    }

    private void initOnClickListener(final ComicViewHolder viewHolder, final UIComic comic) {
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

}
