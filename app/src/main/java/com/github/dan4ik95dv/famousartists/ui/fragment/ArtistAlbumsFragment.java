package com.github.dan4ik95dv.famousartists.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import com.devspark.robototextview.widget.RobotoTextView;
import com.github.dan4ik95dv.famousartists.R;
import com.github.dan4ik95dv.famousartists.di.component.fragment.DaggerArtistAlbumsComponent;
import com.github.dan4ik95dv.famousartists.di.module.fragment.ArtistsAlbumsModule;
import com.github.dan4ik95dv.famousartists.model.yandex.artist.response.ArtistResponse;
import com.github.dan4ik95dv.famousartists.ui.presenter.ArtistAlbumsPresenter;
import com.github.dan4ik95dv.famousartists.ui.view.ArtistAlbumsMvpView;
import com.github.dan4ik95dv.famousartists.ui.widget.DividerItemDecoration;
import com.github.dan4ik95dv.famousartists.ui.widget.EmptyRecyclerView;
import com.github.dan4ik95dv.famousartists.ui.widget.ItemClickSupport;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import jp.wasabeef.recyclerview.adapters.AlphaInAnimationAdapter;
import rx.Observer;

public class ArtistAlbumsFragment extends BaseFragment implements ArtistAlbumsMvpView, Observer<ArtistResponse> {
    private static final String TAG = "PromotionAddressesFragment";
    public static final int COLUMN_COUNT = 3;

    @Inject
    ArtistAlbumsPresenter presenter;

    @Bind(R.id.listAlbums)
    EmptyRecyclerView mListAlbums;
    @Bind(R.id.swipeRefreshDiscounts)
    SwipeRefreshLayout mSwipeRefreshDiscounts;
    @Bind(R.id.textNoAlbumsMain)
    RobotoTextView mTextNoAlbumsMain;
    @Bind(R.id.textNoAlbumsSecond)
    RobotoTextView mTextNoAlbumsSecond;
    @Bind(R.id.layoutNoAlbums)
    RelativeLayout mLayoutNoAlbums;
    @Bind(R.id.progressView)
    FrameLayout mProgressView;
    @Bind(R.id.coordinatorLayout)
    CoordinatorLayout mCoordinatorLayout;


    StaggeredGridLayoutManager mLinearLayoutManager;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DaggerArtistAlbumsComponent.builder().artistsAlbumsModule(new ArtistsAlbumsModule(getContext())).build().inject(this);
        presenter.attachView(this);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_artist_albums, container, false);
        ButterKnife.bind(this, view);
        initRecyclerView(inflater, container);
        presenter.init();
        return view;
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        mListAlbums.setAdapter(new AlphaInAnimationAdapter(presenter.getAdapter()));
    }
    private void initRecyclerView(LayoutInflater inflater, @Nullable ViewGroup container) {
        mLinearLayoutManager = new StaggeredGridLayoutManager(COLUMN_COUNT, StaggeredGridLayoutManager.VERTICAL);
        mLinearLayoutManager.setGapStrategy(StaggeredGridLayoutManager.GAP_HANDLING_NONE);
        mListAlbums.setEmptyView(inflater.inflate(R.layout.view_empty_albums, container, false));
        mListAlbums.setHasFixedSize(true);
        mListAlbums.setLayoutManager(mLinearLayoutManager);
        mListAlbums.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL_LIST));
        ItemClickSupport.addTo(mListAlbums)
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
    public void noAlbums() {

    }

    @Override
    public ArtistAlbumsFragment getFragment() {
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
        mListAlbums.setVisibility(View.VISIBLE);
        mLayoutNoAlbums.setVisibility(View.GONE);
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
