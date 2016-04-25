package com.github.dan4ik95dv.famousartists.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.widget.NestedScrollView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.devspark.robototextview.widget.RobotoTextView;
import com.github.dan4ik95dv.famousartists.R;
import com.github.dan4ik95dv.famousartists.di.component.fragment.DaggerArtistDescriptionComponent;
import com.github.dan4ik95dv.famousartists.di.module.fragment.ArtistsDescriptionModule;
import com.github.dan4ik95dv.famousartists.model.contest.ArtistContest;
import com.github.dan4ik95dv.famousartists.model.yandex.artist.response.ArtistResponse;
import com.github.dan4ik95dv.famousartists.ui.presenter.ArtistDescriptionPresenter;
import com.github.dan4ik95dv.famousartists.ui.view.ArtistDescriptionMvpView;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import rx.Observer;

import static com.github.dan4ik95dv.famousartists.constant.Constant.getGenreName;

public class ArtistDescriptionFragment extends BaseFragment implements ArtistDescriptionMvpView, Observer<ArtistResponse> {
    private static final String TAG = "PromotionAddressesFragment";

    @Inject
    ArtistDescriptionPresenter presenter;

    @Bind(R.id.progressView)
    FrameLayout mProgressFragment;
    @Bind(R.id.contentLayout)
    RelativeLayout mContentLayout;

    @Bind(R.id.coordinatorLayout)
    CoordinatorLayout mCoordinatorLayout;
    @Bind(R.id.genresNameTextView)
    RobotoTextView mGenresNameTextView;
    @Bind(R.id.infoArtistTextView)
    RobotoTextView mInfoArtistTextView;
    @Bind(R.id.descriptionTextView)
    RobotoTextView mDescriptionTextView;
    @Bind(R.id.descriptionArtistLayout)
    LinearLayout mDescriptionArtistLayout;
    @Bind(R.id.descriptionInfoLayout)
    LinearLayout mDescriptionInfoLayout;
    @Bind(R.id.nestedScrollView)
    NestedScrollView nestedScrollView;

    ArtistContest artist;

    public void setArtist(ArtistContest artist) {
        this.artist = artist;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DaggerArtistDescriptionComponent.builder().artistsDescriptionModule(new ArtistsDescriptionModule(getContext())).build().inject(this);
        presenter.attachView(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_artist_description, container, false);
        ButterKnife.bind(this, view);

        if (artist != null) {
            bindView(artist);
        }
        return view;
    }


    @Override
    public void hideProgress() {
        mProgressFragment.setVisibility(View.GONE);
    }

    @Override
    public ArtistDescriptionFragment getFragment() {
        return this;
    }

    @Override
    public void bindView(ArtistContest artist) {
        if (artist != null) {

            hideProgress();
            StringBuilder stringBuilderInfo = new StringBuilder();
            if (artist.getTracks() != null)
                stringBuilderInfo.append(getContext().getResources().getQuantityString(R.plurals.song, artist.getTracks(), artist.getTracks()));
            if (artist.getAlbums() != null && artist.getTracks() != null)
                stringBuilderInfo.append(", ");
            if (artist.getAlbums() != null)
                stringBuilderInfo.append(getContext().getResources().getQuantityString(R.plurals.album, artist.getAlbums(), artist.getAlbums()));

            mInfoArtistTextView.setText(stringBuilderInfo.toString());

            if ((artist.getGenres() != null && artist.getGenres().size() > 0)) {
                StringBuilder stringBuilderGenres = new StringBuilder();
                for (int i = 0; i < artist.getGenres().size(); i++) {

                    stringBuilderGenres.append(getGenreName(artist.getGenres().get(i).getValue()));
                    if ((i != artist.getGenres().size() - 1))
                        stringBuilderGenres.append(", ");
                }
                mGenresNameTextView.setText(stringBuilderGenres.toString());
            }
            if (artist.getDescription() != null) {
                mDescriptionTextView.setText(artist.getDescription());
                mDescriptionArtistLayout.setVisibility(View.VISIBLE);
            }

            mDescriptionInfoLayout.setVisibility(View.VISIBLE);
        }
    }


    @Override
    public void onCompleted() {

    }

    @Override
    public void onError(Throwable e) {

    }

    @Override
    public void onNext(ArtistResponse artistResponse) {
        presenter.fillView(artistResponse);
    }

    @Override
    public void updateFragment() {

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
