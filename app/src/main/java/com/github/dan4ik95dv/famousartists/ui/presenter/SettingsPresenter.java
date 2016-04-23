package com.github.dan4ik95dv.famousartists.ui.presenter;

import android.content.Context;

import com.github.dan4ik95dv.famousartists.app.App;
import com.github.dan4ik95dv.famousartists.ui.view.SettingsMvpView;

/**
 * Created by Daniil Celikin on 21.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
public class SettingsPresenter implements Presenter<SettingsMvpView> {
    SettingsMvpView settingsMvpView;
    Context context;

    public SettingsPresenter(Context context) {
        this.context = context;
        App.getInstance().getClientComponent().inject(this);
    }

    @Override
    public void attachView(SettingsMvpView view) {
        this.settingsMvpView = view;
    }

    @Override
    public void detachView() {
        this.settingsMvpView = null;
    }
}
