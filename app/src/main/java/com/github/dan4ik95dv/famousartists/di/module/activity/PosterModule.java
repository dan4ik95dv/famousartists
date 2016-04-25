package com.github.dan4ik95dv.famousartists.di.module.activity;

import android.content.Context;

import com.github.dan4ik95dv.famousartists.di.scope.activity.PosterScope;
import com.github.dan4ik95dv.famousartists.ui.presenter.PosterPresenter;

import dagger.Module;
import dagger.Provides;
@PosterScope
@Module
public class PosterModule {
    public Context context;

    public PosterModule(Context context) {
        this.context = context;
    }

    @Provides
    public PosterPresenter providePosterPresenter() {
        return new PosterPresenter(context);
    }
}
