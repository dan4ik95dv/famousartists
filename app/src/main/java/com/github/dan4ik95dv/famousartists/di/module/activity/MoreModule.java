package com.github.dan4ik95dv.famousartists.di.module.activity;

import android.content.Context;

import com.github.dan4ik95dv.famousartists.di.scope.activity.MainScope;
import com.github.dan4ik95dv.famousartists.di.scope.activity.MoreScope;
import com.github.dan4ik95dv.famousartists.ui.presenter.MainPresenter;
import com.github.dan4ik95dv.famousartists.ui.presenter.MorePresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Daniil Celikin on 12.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
@MoreScope
@Module
public class MoreModule {
    public Context context;

    public MoreModule(Context context) {
        this.context = context;
    }

    @Provides
    public MorePresenter provideMorePresenter() {
        return new MorePresenter(context);
    }
}
