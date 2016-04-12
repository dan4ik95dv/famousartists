package com.github.dan4ik95dv.famousartists.ui.presenter;

import com.github.dan4ik95dv.famousartists.ui.view.MainMvpView;

/**
 * Created by Daniil Celikin on 12.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
public class MainPresenter implements Presenter<MainMvpView> {
    private MainMvpView mainMvpView;

    @Override
    public void attachView(MainMvpView view) {
        this.mainMvpView = view;
    }


    @Override
    public void detachView() {
        this.mainMvpView = null;
    }
}