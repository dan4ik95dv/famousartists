package com.github.dan4ik95dv.famousartists.ui.presenter;

import android.content.Context;

import com.github.dan4ik95dv.famousartists.app.App;
import com.github.dan4ik95dv.famousartists.constant.Intent;
import com.github.dan4ik95dv.famousartists.io.adapter.MoreArtistViewPagerAdapter;
import com.github.dan4ik95dv.famousartists.io.bus.RxBus;
import com.github.dan4ik95dv.famousartists.io.client.RestMusic;
import com.github.dan4ik95dv.famousartists.model.contest.ArtistContest;
import com.github.dan4ik95dv.famousartists.model.yandex.artist.response.ArtistResponse;
import com.github.dan4ik95dv.famousartists.ui.activity.MoreActivity;
import com.github.dan4ik95dv.famousartists.ui.fragment.ArtistDescriptionFragment;
import com.github.dan4ik95dv.famousartists.ui.view.MoreMvpView;

import org.parceler.Parcels;

import javax.inject.Inject;

import io.realm.Realm;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by Daniil Celikin on 12.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
public class MorePresenter implements Presenter<MoreMvpView> {
    private static final String TAG = "MainPresenter";

    @Inject
    Realm realm;
    @Inject
    RxBus rxBus;
    @Inject
    RestMusic restMusic;

    ArtistResponse artistResponse;


    private MoreMvpView moreMvpView;
    private MoreArtistViewPagerAdapter mMoreArtistViewPagerAdapter;

    MoreActivity activity;
    private Context context;
    private int artistId;
    private ArtistContest artistContest;

    public MorePresenter(Context context) {
        this.activity = (MoreActivity) context;
        this.context = context;

        App.getInstance().getClientComponent().inject(this);
        attachView((MoreMvpView) context);
    }

    public void init() {
        if (activity.getIntent() != null) {
            artistId = activity.getIntent().getIntExtra(Intent.ARTIST_ID, -1);
            artistContest = Parcels.unwrap(activity.getIntent().getParcelableExtra(Intent.ARTIST_CONTEST));
            mMoreArtistViewPagerAdapter = new MoreArtistViewPagerAdapter(activity.getSupportFragmentManager(), context);
            if (artistContest != null) {
                ArtistDescriptionFragment artistDescriptionFragment = (ArtistDescriptionFragment) mMoreArtistViewPagerAdapter.getFragmentList().get(MoreArtistViewPagerAdapter.DESCRIPTION_ARTIST_FRAGMENT);
                artistDescriptionFragment.setArtist(artistContest);
                moreMvpView.bindView(artistContest);
            }
            loadArtist(artistId);
            subscribeOnEvents();
        }
    }

    void loadArtist(final int artistId) {
        if (artistId != -1) {

//            Observable observable = restMusic.getArtist(artistId, Client.RU_LANG, Client.Artist.Type.ALL)
//                    .compose(activity.bindToLifecycle())
//                    .subscribeOn(Schedulers.newThread())
//                    .observeOn(AndroidSchedulers.mainThread())
//                    .unsubscribeOn(Schedulers.io());
//
//            for (Fragment fragment : mMoreArtistViewPagerAdapter.getFragmentList())
//                activity.watch(observable.subscribe((Observer<ArtistResponse>) fragment));
//
//            activity.watch(observable.subscribe(new Observer<ArtistResponse>() {
//                @Override
//                public void onCompleted() {
//
//                }
//
//                @Override
//                public void onError(Throwable e) {
//
//                }
//
//                @Override
//                public void onNext(ArtistResponse artistResponse) {
//                    MorePresenter.this.artistResponse = artistResponse;
//                    if (artistContest == null)
//                        moreMvpView.bindView(artistResponse.getArtist());
//
//                }
//
//            }));
        }
    }

    public void showPoster() {
        if (artistContest != null) {
            activity.showPoster(artistContest.getCoverContest().getBig());
        }
//        if (artistResponse != null && artistResponse.getArtist() != null && artistResponse.getArtist().getCover() != null) {
//            String imageUrl = !isEmpty(artistResponse.getArtist().getCover().getUri()) ? artistResponse.getArtist().getCover().getUri().replaceFirst("%%", Client.BIG_IMG) : null;
//            activity.showPoster(imageUrl);
//        }
    }

    void subscribeOnEvents() {
        activity.watch(rxBus.toObservable()
                .compose(activity.bindToLifecycle())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.newThread())
                .unsubscribeOn(Schedulers.io())
                .subscribe(new Action1<Object>() {
                    @Override
                    public void call(Object o) {
                        // TODO: 25.04.2016
                    }
                }));
    }

    public MoreArtistViewPagerAdapter getAdapter() {
        return mMoreArtistViewPagerAdapter;
    }

    @Override
    public void attachView(MoreMvpView view) {
        this.moreMvpView = view;
    }


    @Override
    public void detachView() {
        this.moreMvpView = null;
    }
}
