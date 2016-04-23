package com.github.dan4ik95dv.famousartists.di.module.fragment;

import android.content.Context;

import com.github.dan4ik95dv.famousartists.di.scope.fragment.ArtistsScope;
import com.github.dan4ik95dv.famousartists.ui.presenter.ArtistsPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Daniil Celikin on 21.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
@ArtistsScope
@Module
public class ArtistsModule {
    public Context context;

    public ArtistsModule(Context context) {
        this.context = context;
    }

    @Provides
    ArtistsPresenter provideArtistsPresenter() {
        return new ArtistsPresenter(context);
    }
}
