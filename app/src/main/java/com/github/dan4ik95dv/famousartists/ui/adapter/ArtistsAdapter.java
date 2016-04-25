package com.github.dan4ik95dv.famousartists.ui.adapter;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.devspark.robototextview.widget.RobotoTextView;
import com.github.dan4ik95dv.famousartists.R;
import com.github.dan4ik95dv.famousartists.constant.Client;
import com.github.dan4ik95dv.famousartists.model.contest.ArtistContest;
import com.github.dan4ik95dv.famousartists.model.yandex.Artist;

import butterknife.Bind;
import butterknife.ButterKnife;

import static android.text.TextUtils.isEmpty;
import static com.github.dan4ik95dv.famousartists.constant.Constant.getGenreName;

/**
 * Created by Daniil Celikin on 21.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
public class ArtistsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    private Context context;
    private Object[] artistList;

    public ArtistsAdapter(Context context) {
        this.context = context;
    }

    public Object[] getArtistList() {
        return artistList;
    }

    public void setArtistList(Object[] artistList) {
        this.artistList = artistList;
        notifyDataSetChanged();
    }

    public Object getItem(int position) {
        return artistList.length > position ? artistList[position] : null;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return new ArtistViewHolder(inflater.inflate(R.layout.view_artist_item, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Object obj = getItem(position);
        if (obj != null) {
            if ((obj instanceof Artist))
                ((ArtistViewHolder) holder).bind((Artist) obj);
            if ((obj instanceof ArtistContest))
                ((ArtistViewHolder) holder).bindContest((ArtistContest) obj);
        }
    }


    @Override
    public int getItemCount() {
        return artistList != null ? artistList.length : 0;
    }

    class ArtistViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.posterImageView)
        ImageView posterImageView;
        @Bind(R.id.artistNameTextView)
        RobotoTextView artistNameTextView;
        @Bind(R.id.genresNameTextView)
        RobotoTextView genresNameTextView;
        @Bind(R.id.infoArtistTextView)
        RobotoTextView infoArtistTextView;

        public ArtistViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void bindContest(ArtistContest artist) {
            if (artist != null) {
                if (!isEmpty(artist.getName()))
                    artistNameTextView.setText(artist.getName());
                if (artist.getCoverContest() != null)
                    Glide.with(context).load(artist.getCoverContest().getSmall()).error(ContextCompat.getDrawable(context, R.drawable.album)).into(posterImageView);
                StringBuilder stringBuilderInfo = new StringBuilder();
                if (artist.getTracks() != null)
                    stringBuilderInfo.append(context.getResources().getQuantityString(R.plurals.song, artist.getTracks(), artist.getTracks()));
                if (artist.getAlbums() != null && artist.getTracks() != null)
                    stringBuilderInfo.append(", ");
                if (artist.getAlbums() != null)
                    stringBuilderInfo.append(context.getResources().getQuantityString(R.plurals.album, artist.getAlbums(), artist.getAlbums()));

                infoArtistTextView.setText(stringBuilderInfo.toString());

                if ((artist.getGenres() != null && artist.getGenres().size() > 0)) {
                    StringBuilder stringBuilderGenres = new StringBuilder();
                    for (int i = 0; i < artist.getGenres().size(); i++) {

                        stringBuilderGenres.append(getGenreName(artist.getGenres().get(i).getValue()));
                        if ((i != artist.getGenres().size() - 1))
                            stringBuilderGenres.append(", ");
                    }
                    genresNameTextView.setText(stringBuilderGenres.toString());
                }

            }
        }

        public void bind(Artist artist) {
            if (artist != null) {
                if (!isEmpty(artist.getName()))
                    artistNameTextView.setText(artist.getName());
                if (artist.getCover() != null) {
                    String imageUrl = !isEmpty(artist.getCover().getUri()) ? artist.getCover().getUri().replaceFirst("%%", Client.SMALL_IMG) : null;
                    Glide.with(context).load(imageUrl).into(posterImageView);
                }
            }
        }
    }
}
