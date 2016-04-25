package com.github.dan4ik95dv.famousartists.di.module.fragment;

import android.content.Context;

import com.github.dan4ik95dv.famousartists.di.scope.fragment.ArtistsTracksScope;
import com.github.dan4ik95dv.famousartists.ui.presenter.ArtistTracksPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Daniil Celikin on 21.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
@ArtistsTracksScope
@Module
public class ArtistsTracksModule {
    public Context context;

    public ArtistsTracksModule(Context context) {
        this.context = context;
    }

    @Provides
    ArtistTracksPresenter provideArtistTracksPresenter() {
        return new ArtistTracksPresenter(context);
    }
}
