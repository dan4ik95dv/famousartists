package com.github.dan4ik95dv.famousartists.di.module.fragment;

import android.content.Context;

import com.github.dan4ik95dv.famousartists.di.scope.fragment.ArtistsAlbumsScope;
import com.github.dan4ik95dv.famousartists.di.scope.fragment.ArtistsScope;
import com.github.dan4ik95dv.famousartists.ui.presenter.ArtistAlbumsPresenter;
import com.github.dan4ik95dv.famousartists.ui.presenter.ArtistsPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Daniil Celikin on 21.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
@ArtistsAlbumsScope
@Module
public class ArtistsAlbumsModule {
    public Context context;

    public ArtistsAlbumsModule(Context context) {
        this.context = context;
    }

    @Provides
    ArtistAlbumsPresenter provideArtistAlbumsPresenter() {
        return new ArtistAlbumsPresenter(context);
    }
}
