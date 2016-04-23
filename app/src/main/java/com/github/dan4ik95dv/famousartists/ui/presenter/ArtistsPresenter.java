package com.github.dan4ik95dv.famousartists.ui.presenter;

import android.content.Context;

import com.github.dan4ik95dv.famousartists.app.App;
import com.github.dan4ik95dv.famousartists.ui.view.ArtistsMvpView;

/**
 * Created by Daniil Celikin on 21.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
public class ArtistsPresenter implements Presenter<ArtistsMvpView> {
    ArtistsMvpView artistsMvpView;
    Context context;

    public ArtistsPresenter(Context context) {
        this.context = context;
        App.getInstance().getClientComponent().inject(this);
    }

    @Override
    public void attachView(ArtistsMvpView view) {
        this.artistsMvpView = view;
    }

    @Override
    public void detachView() {
        this.artistsMvpView = null;
    }
}
