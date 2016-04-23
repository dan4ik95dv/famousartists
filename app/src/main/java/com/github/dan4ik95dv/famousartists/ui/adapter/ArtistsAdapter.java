package com.github.dan4ik95dv.famousartists.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.dan4ik95dv.famousartists.R;
import com.github.dan4ik95dv.famousartists.model.contest.Artist;

import java.util.ArrayList;

import butterknife.ButterKnife;

/**
 * Created by Daniil Celikin on 21.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
public class ArtistsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int VIEW_TYPE_ITEM = 0;

    private Context context;
    private ArrayList<Artist> artistList = new ArrayList<>();

    public ArtistsAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Artist> getArtistList() {
        return artistList;
    }

    public void setArtistList(ArrayList<Artist> artistList) {
        this.artistList = artistList;
        notifyDataSetChanged();
    }

    public Artist getItem(int position) {
        return artistList.size() > position ? artistList.get(position) : null;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        switch (viewType) {
            case VIEW_TYPE_ITEM:
                return new ArtistViewHolder(inflater.inflate(R.layout.view_artist_item, parent, false));
            default:
                return null;
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Artist artist = getItem(position);
        if (artist != null) {
            switch (holder.getItemViewType()) {
                case VIEW_TYPE_ITEM:
                    ((ArtistViewHolder) holder).bind(artist);
            }
        }
    }

    @Override
    public int getItemViewType(int position) {
        Artist artist = getItem(position);
        //TODO add more different item
        return VIEW_TYPE_ITEM;
    }


    @Override
    public int getItemCount() {
        return artistList.size();
    }

    class ArtistViewHolder extends RecyclerView.ViewHolder {

        public ArtistViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void bind(Artist artist) {

        }
    }
}
