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
import com.github.dan4ik95dv.famousartists.model.yandex.Artist;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

import static android.text.TextUtils.isEmpty;


public class AlbumsAdapter extends RecyclerView.Adapter<AlbumsAdapter.ViewHolder> {
    private Context mContext;
    private List<Album> mAlbumList = new ArrayList<>();

    public AlbumsAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public List<Album> getAlbumList() {
        return mAlbumList;
    }

    public void setAlbumList(List<Album> trackList) {
        this.mAlbumList = trackList;
        notifyDataSetChanged();
    }

    public Album getItem(int position) {
        return mAlbumList.size() > position ? mAlbumList.get(position) : null;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return new ViewHolder(inflater.inflate(R.layout.view_album_item, parent, false), mContext);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Album album = getItem(position);
        if (album != null)
            holder.bind(album);

    }

    @Override
    public int getItemCount() {
        return mAlbumList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.nameAlbumTextView)
        RobotoTextView mNameAlbumTextView;
        @Bind(R.id.coverImageView)
        ImageView mCoverImageView;
        @Bind(R.id.artistAlbumTextView)
        RobotoTextView mArtistAlbumTextView;

        Context mContext;

        public ViewHolder(View itemView, Context context) {
            super(itemView);
            this.mContext = context;
            ButterKnife.bind(this, itemView);
        }

        public void bind(Album album) {
            if (album.getTitle() != null)
                mNameAlbumTextView.setText(album.getTitle());
            if (album.getArtists() != null && album.getArtists().size() > 0) {
                Artist artist = album.getArtists().get(0);
                if (artist.getName() != null)
                    mArtistAlbumTextView.setText(artist.getName());
                if (album.getCoverUri() != null) {
                    String imageUrl = !isEmpty(album.getCoverUri()) ? album.getCoverUri().replaceFirst("%%", Client.SMALL_IMG) : null;
                    Glide.with(mContext).load(imageUrl).fitCenter().diskCacheStrategy(DiskCacheStrategy.ALL).into(mCoverImageView);
                }
            }


        }
    }

}

