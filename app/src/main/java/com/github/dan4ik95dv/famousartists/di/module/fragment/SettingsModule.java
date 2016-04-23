package com.github.dan4ik95dv.famousartists.di.module.fragment;

import android.content.Context;

import com.github.dan4ik95dv.famousartists.di.scope.fragment.SettingsScope;
import com.github.dan4ik95dv.famousartists.ui.presenter.SettingsPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Daniil Celikin on 21.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
@SettingsScope
@Module
public class SettingsModule {
    public Context context;

    public SettingsModule(Context context) {
        this.context = context;
    }

    @Provides
    SettingsPresenter provideSettingsPresenter() {
        return new SettingsPresenter(context);
    }
}
