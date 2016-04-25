package com.github.dan4ik95dv.famousartists.ui.presenter;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.github.dan4ik95dv.famousartists.app.App;
import com.github.dan4ik95dv.famousartists.io.client.RestContest;
import com.github.dan4ik95dv.famousartists.io.client.RestMusic;
import com.github.dan4ik95dv.famousartists.model.contest.ArtistContest;
import com.github.dan4ik95dv.famousartists.ui.adapter.ArtistsAdapter;
import com.github.dan4ik95dv.famousartists.ui.view.ArtistsMvpView;
import com.github.dan4ik95dv.famousartists.ui.widget.ItemClickSupport;

import java.util.ArrayList;

import javax.inject.Inject;

import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by Daniil Celikin on 21.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
public class ArtistsPresenter implements Presenter<ArtistsMvpView> {
    private static final String TAG = "ArtistsPresenter";
    //    @Inject
//    Realm realm;
    @Inject
    SharedPreferences sharedPreferences;
    @Inject
    RestContest restContest;
    @Inject
    RestMusic restMusic;

    ArtistsAdapter artistsAdapter;
    ArtistsMvpView artistsMvpView;
    Context context;

    RecyclerView.AdapterDataObserver mAdapterDataObserver = new RecyclerView.AdapterDataObserver() {
        @Override
        public void onChanged() {
            super.onChanged();
            artistsMvpView.hideProgress();
        }
    };


    public ArtistsPresenter(Context context) {
        this.context = context;
        App.getInstance().getClientComponent().inject(this);
    }

    public void init() {
        artistsAdapter = new ArtistsAdapter(context);
        artistsAdapter.registerAdapterDataObserver(mAdapterDataObserver);
    }

    public void getContestArtists() {
        artistsMvpView.getFragment().watch(
                restContest.getArtists()
                        .compose(artistsMvpView.getFragment().<ArrayList<ArtistContest>>bindToLifecycle())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribeOn(Schedulers.newThread())
                        .unsubscribeOn(Schedulers.io())
                        .subscribe(new Action1<ArrayList<ArtistContest>>() {
                            @Override
                            public void call(ArrayList<ArtistContest> artists) {
                                if (artists != null && artists.size() > 0) {
                                    artistsAdapter.setArtistList(artists.toArray());
                                    artistsMvpView.success();
                                } else {
                                    artistsMvpView.empty();
                                }
                            }
                        }, new Action1<Throwable>() {
                            @Override
                            public void call(Throwable throwable) {

                            }
                        }));
    }


    @Override
    public void attachView(ArtistsMvpView view) {
        this.artistsMvpView = view;
    }

    @Override
    public void detachView() {
        this.artistsMvpView = null;
    }


    ItemClickSupport.OnItemClickListener artistsItemListClickListener = new ItemClickSupport.OnItemClickListener() {
        @Override
        public void onItemClicked(RecyclerView recyclerView, int position, View v) {
            if (artistsAdapter.getItem(position) instanceof ArtistContest) {
                ArtistContest artistContest = (ArtistContest) artistsAdapter.getItem(position);
                artistsMvpView.getFragment().getArtist(artistContest.getId(),artistContest);
            }

        }
    };

    ItemClickSupport.OnItemLongClickListener artistsItemListLongClickListener = new ItemClickSupport.OnItemLongClickListener() {
        @Override
        public boolean onItemLongClicked(RecyclerView recyclerView, int position, View v) {
            return false;
        }
    };

    SwipeRefreshLayout.OnRefreshListener onRefreshArtistsListener = new SwipeRefreshLayout.OnRefreshListener() {
        @Override
        public void onRefresh() {
            getContestArtists();
        }
    };

    public ArtistsAdapter getArtistsAdapter() {
        return artistsAdapter;
    }


    public ItemClickSupport.OnItemClickListener getArtistsItemListClickListener() {
        return artistsItemListClickListener;
    }

    public ItemClickSupport.OnItemLongClickListener getArtistsItemListLongClickListener() {
        return artistsItemListLongClickListener;
    }

    public SwipeRefreshLayout.OnRefreshListener getOnRefreshArtistsListener() {
        return onRefreshArtistsListener;
    }


}
