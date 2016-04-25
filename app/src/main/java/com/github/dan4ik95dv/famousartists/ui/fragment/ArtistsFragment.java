package com.github.dan4ik95dv.famousartists.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import com.github.dan4ik95dv.famousartists.R;
import com.github.dan4ik95dv.famousartists.di.component.fragment.DaggerArtistsComponent;
import com.github.dan4ik95dv.famousartists.di.module.fragment.ArtistsModule;
import com.github.dan4ik95dv.famousartists.ui.presenter.ArtistsPresenter;
import com.github.dan4ik95dv.famousartists.ui.view.ArtistsMvpView;
import com.github.dan4ik95dv.famousartists.ui.widget.DividerItemDecoration;
import com.github.dan4ik95dv.famousartists.ui.widget.EmptyRecyclerView;
import com.github.dan4ik95dv.famousartists.ui.widget.ItemClickSupport;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import jp.wasabeef.recyclerview.adapters.AlphaInAnimationAdapter;

/**
 * Created by Daniil Celikin on 16.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
public class ArtistsFragment extends BaseFragment implements ArtistsMvpView {

    @Inject
    ArtistsPresenter presenter;


    @Bind(R.id.artistsRecycleView)
    EmptyRecyclerView mArtistRecyclerView;
    @Bind(R.id.listRefresh)
    SwipeRefreshLayout mListRefresh;
    @Bind(R.id.emptyView)
    RelativeLayout mEmptyView;
    @Bind(R.id.progressView)
    FrameLayout mProgressView;
    @Bind(R.id.main_content)
    CoordinatorLayout mMainContent;


    public static ArtistsFragment newInstance() {
        return new ArtistsFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DaggerArtistsComponent.builder()
                .artistsModule(new ArtistsModule(getContext())).build().inject(this);
        presenter.attachView(this);
        presenter.init();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_artists, container, false);
        ButterKnife.bind(this, view);
        initEventView();
        return view;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        mArtistRecyclerView.setAdapter(new AlphaInAnimationAdapter(presenter.getArtistsAdapter()));
        presenter.getContestArtists();
    }


    private void initEventView() {
        mListRefresh.setColorSchemeResources(
                R.color.colorPrimary,
                R.color.colorAccent,
                R.color.colorPrimaryDark);
        mListRefresh.setOnRefreshListener(presenter.getOnRefreshArtistsListener());

        mArtistRecyclerView.setEmptyView(mEmptyView);
        mArtistRecyclerView.setHasFixedSize(true);
        mArtistRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mArtistRecyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL_LIST));
        ItemClickSupport.addTo(mArtistRecyclerView)
                .setOnItemClickListener(presenter.getArtistsItemListClickListener())
                .setOnItemLongClickListener(presenter.getArtistsItemListLongClickListener());
    }


    @Override
    public ArtistsFragment getFragment() {
        return this;
    }


    @Override
    public void updateFragment() {

    }

    @Override
    public void hideProgress() {
        mProgressView.setVisibility(View.GONE);
    }

    @Override
    public void empty() {
        mArtistRecyclerView.setVisibility(View.GONE);
        mEmptyView.setVisibility(View.VISIBLE);
    }

    @Override
    public void success() {
        mArtistRecyclerView.setVisibility(View.VISIBLE);
        mEmptyView.setVisibility(View.GONE);

        if (mListRefresh.isRefreshing())
            mListRefresh.setRefreshing(false);
    }

    @Override
    public void error() {

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
        presenter.detachView();
    }
}
