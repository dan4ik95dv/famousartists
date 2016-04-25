package com.github.dan4ik95dv.famousartists.ui.presenter;

import android.content.Context;

import com.github.dan4ik95dv.famousartists.app.App;
import com.github.dan4ik95dv.famousartists.io.bus.RxBus;
import com.github.dan4ik95dv.famousartists.io.bus.event.ArtistContestEvent;
import com.github.dan4ik95dv.famousartists.model.contest.ArtistContest;
import com.github.dan4ik95dv.famousartists.model.yandex.artist.response.ArtistResponse;
import com.github.dan4ik95dv.famousartists.ui.view.ArtistDescriptionMvpView;

import javax.inject.Inject;

import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by Daniil Celikin on 25.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
public class ArtistDescriptionPresenter implements Presenter<ArtistDescriptionMvpView> {
    private static final String TAG = "PromotionAddressesPres";

    @Inject
    RxBus rxBus;

    private ArtistDescriptionMvpView artistDescriptionMvpView;

    private Context context;

    public ArtistDescriptionPresenter(Context context) {
        this.context = context;
        App.getInstance().getClientComponent().inject(this);
    }


    @Override
    public void attachView(ArtistDescriptionMvpView view) {
        this.artistDescriptionMvpView = view;
        subscribeOnEvents();
    }

    @Override
    public void detachView() {
        this.artistDescriptionMvpView = null;
    }


    void subscribeOnEvents() {
        artistDescriptionMvpView.getFragment().watch(rxBus.toObservable()
                .compose(artistDescriptionMvpView.getFragment().bindToLifecycle())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.newThread())
                .unsubscribeOn(Schedulers.io())
                .subscribe(new Action1<Object>() {
                    @Override
                    public void call(Object event) {
                        if (event instanceof ArtistContestEvent) {
                            artistDescriptionMvpView.bindView((ArtistContest) event);
                        }
                    }
                }));
    }

    public void fillView(ArtistResponse artistResponse) {

    }
}
