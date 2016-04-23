package com.github.dan4ik95dv.famousartists.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.github.dan4ik95dv.famousartists.R;
import com.github.dan4ik95dv.famousartists.di.component.fragment.DaggerArtistsComponent;
import com.github.dan4ik95dv.famousartists.di.module.fragment.ArtistsModule;
import com.github.dan4ik95dv.famousartists.ui.presenter.ArtistsPresenter;
import com.github.dan4ik95dv.famousartists.ui.view.ArtistsMvpView;
import com.github.dan4ik95dv.famousartists.ui.widget.EmptyRecyclerView;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Daniil Celikin on 16.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
public class ArtistsFragment extends BaseFragment implements ArtistsMvpView {

    @Inject
    ArtistsPresenter presenter;

    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.appBarLayout)
    AppBarLayout appBarLayout;
    @Bind(R.id.coordinatorLayout)
    CoordinatorLayout coordinatorLayout;
    @Bind(R.id.listArtists)
    EmptyRecyclerView listArtists;
    @Bind(R.id.swipeRefreshArtists)
    SwipeRefreshLayout swipeRefreshArtists;
    @Bind(R.id.progressView)
    FrameLayout progressView;

    public static ArtistsFragment newInstance() {
        return new ArtistsFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DaggerArtistsComponent.builder()
                .artistsModule(new ArtistsModule(getContext())).build().inject(this);
        setRetainInstance(true);
        presenter.attachView(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_artists, container, false);
        ButterKnife.bind(this, view);
        toolbar.setTitle(R.string.artists_nav);
        return view;

    }


    @Override
    public ArtistsFragment getFragment() {
        return this;
    }

    @Override
    public void updateFragment() {

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
        presenter.detachView();
    }
}
