package com.github.dan4ik95dv.famousartists.di.module.activity;

import android.content.Context;

import com.github.dan4ik95dv.famousartists.di.scope.activity.MainScope;
import com.github.dan4ik95dv.famousartists.ui.presenter.MainPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Daniil Celikin on 12.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
@MainScope
@Module
public class MainModule {
    public Context context;

    public MainModule(Context context) {
        this.context = context;
    }

    @Provides
    public MainPresenter provideMainPresenter() {
        return new MainPresenter(context);
    }
}
