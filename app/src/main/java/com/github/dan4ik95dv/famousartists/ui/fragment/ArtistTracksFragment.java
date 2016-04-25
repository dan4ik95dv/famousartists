package com.github.dan4ik95dv.famousartists.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import com.devspark.robototextview.widget.RobotoTextView;
import com.github.dan4ik95dv.famousartists.R;
import com.github.dan4ik95dv.famousartists.di.component.fragment.DaggerArtistTracksComponent;
import com.github.dan4ik95dv.famousartists.di.module.fragment.ArtistsTracksModule;
import com.github.dan4ik95dv.famousartists.model.yandex.artist.response.ArtistResponse;
import com.github.dan4ik95dv.famousartists.ui.presenter.ArtistTracksPresenter;
import com.github.dan4ik95dv.famousartists.ui.view.ArtistTracksMvpView;
import com.github.dan4ik95dv.famousartists.ui.widget.DividerItemDecoration;
import com.github.dan4ik95dv.famousartists.ui.widget.EmptyRecyclerView;
import com.github.dan4ik95dv.famousartists.ui.widget.ItemClickSupport;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import jp.wasabeef.recyclerview.adapters.AlphaInAnimationAdapter;
import rx.Observer;

public class ArtistTracksFragment extends BaseFragment implements ArtistTracksMvpView, Observer<ArtistResponse> {
    private static final String TAG = "PromotionAddressesFragment";

    @Inject
    ArtistTracksPresenter presenter;


    LinearLayoutManager mLinearLayoutManager;
    @Bind(R.id.listTracks)
    EmptyRecyclerView mListTracks;
    @Bind(R.id.swipeRefreshDiscounts)
    SwipeRefreshLayout mSwipeRefreshDiscounts;
    @Bind(R.id.textNoTracksMain)
    RobotoTextView mTextNoTracksMain;
    @Bind(R.id.textNoTracksSecond)
    RobotoTextView mTextNoTracksSecond;
    @Bind(R.id.layoutNoTracks)
    RelativeLayout mLayoutNoTracks;
    @Bind(R.id.progressView)
    FrameLayout mProgressView;
    @Bind(R.id.coordinatorLayout)
    CoordinatorLayout mCoordinatorLayout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DaggerArtistTracksComponent.builder().artistsTracksModule(new ArtistsTracksModule(getContext())).build().inject(this);
        presenter.attachView(this);
        presenter.init();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        mListTracks.setAdapter(new AlphaInAnimationAdapter(presenter.getAdapter()));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_artist_tracks, container, false);
        ButterKnife.bind(this, view);
        initRecyclerView(inflater, container);
        presenter.init();
        return view;
    }

    private void initRecyclerView(LayoutInflater inflater, @Nullable ViewGroup container) {
        mLinearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);

        mListTracks.setEmptyView(inflater.inflate(R.layout.view_empty_tracks, container, false));
        mListTracks.setHasFixedSize(true);
        mListTracks.setLayoutManager(mLinearLayoutManager);
        mListTracks.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL_LIST));
        ItemClickSupport.addTo(mListTracks)
                .setOnItemClickListener(presenter.getOnItemClickListener())
                .setOnItemLongClickListener(presenter.getOnItemLongClickListener());
        mSwipeRefreshDiscounts.setOnRefreshListener(presenter.getRefreshListener());
        mSwipeRefreshDiscounts.setColorSchemeResources(
                R.color.colorPrimary,
                R.color.colorPrimary,
                R.color.colorPrimary);
    }

    @Override
    public void hideProgress() {
        mProgressView.setVisibility(View.GONE);
    }

    @Override
    public void noTracks() {

    }

    @Override
    public ArtistTracksFragment getFragment() {
        return this;
    }


    @Override
    public void onCompleted() {

    }

    @Override
    public void onError(Throwable e) {
        if (mSwipeRefreshDiscounts.isRefreshing())
            mSwipeRefreshDiscounts.setRefreshing(false);
    }

    @Override
    public void onNext(ArtistResponse artistResponse) {
        presenter.fillView(artistResponse);
        mListTracks.setVisibility(View.VISIBLE);
        mLayoutNoTracks.setVisibility(View.GONE);

        if (mSwipeRefreshDiscounts.isRefreshing())
            mSwipeRefreshDiscounts.setRefreshing(false);
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
