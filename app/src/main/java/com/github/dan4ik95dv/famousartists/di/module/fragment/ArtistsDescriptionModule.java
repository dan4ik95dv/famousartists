package com.github.dan4ik95dv.famousartists.di.module.fragment;

import android.content.Context;

import com.github.dan4ik95dv.famousartists.di.scope.fragment.ArtistsDescriptionScope;
import com.github.dan4ik95dv.famousartists.ui.presenter.ArtistDescriptionPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Daniil Celikin on 21.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
@ArtistsDescriptionScope
@Module
public class ArtistsDescriptionModule {
    public Context context;

    public ArtistsDescriptionModule(Context context) {
        this.context = context;
    }

    @Provides
    ArtistDescriptionPresenter provideArtistDescriptionPresenter() {
        return new ArtistDescriptionPresenter(context);
    }
}
