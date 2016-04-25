package com.github.dan4ik95dv.famousartists.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.devspark.robototextview.widget.RobotoTextView;
import com.github.dan4ik95dv.famousartists.R;
import com.github.dan4ik95dv.famousartists.constant.Client;
import com.github.dan4ik95dv.famousartists.model.yandex.Album;
import com.github.dan4ik95dv.famousartists.model.yandex.Track;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

import static android.text.TextUtils.isEmpty;


public class TracksAdapter extends RecyclerView.Adapter<TracksAdapter.ViewHolder> {
    private Context mContext;
    private List<Track> mTrackList = new ArrayList<>();

    public TracksAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public List<Track> getTrackList() {
        return mTrackList;
    }

    public void setTrackList(List<Track> trackList) {
        this.mTrackList = trackList;
        notifyDataSetChanged();
    }

    public Track getItem(int position) {
        return mTrackList.size() > position ? mTrackList.get(position) : null;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return new ViewHolder(inflater.inflate(R.layout.view_track_item, parent, false), mContext);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Track track = getItem(position);
        if (track != null)
            holder.bind(track);

    }

    @Override
    public int getItemCount() {
        return mTrackList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.nameTrackTextView)
        RobotoTextView mNameTrackTextView;
        @Bind(R.id.coverImageView)
        ImageView mCoverImageView;
        @Bind(R.id.albumTrackTextView)
        RobotoTextView mAlbumTrackTextView;

        Context mContext;

        public ViewHolder(View itemView, Context context) {
            super(itemView);
            this.mContext = context;
            ButterKnife.bind(this, itemView);
        }

        public void bind(Track track) {
            if (track.getTitle() != null)
                mNameTrackTextView.setText(track.getTitle());
            if (track.getAlbums() != null && track.getAlbums().size() > 0) {
                Album album = track.getAlbums().get(0);
                if (album.getTitle() != null)
                    mAlbumTrackTextView.setText(track.getAlbums().get(0).getTitle());
                if (album.getCoverUri() != null) {
                    String imageUrl = !isEmpty(album.getCoverUri()) ? album.getCoverUri().replaceFirst("%%", Client.SMALL_IMG) : null;
                    Glide.with(mContext).load(imageUrl).fitCenter().diskCacheStrategy(DiskCacheStrategy.ALL).into(mCoverImageView);
                }
            }


        }
    }

}

