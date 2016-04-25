package com.github.dan4ik95dv.famousartists.di.component.fragment;

import com.github.dan4ik95dv.famousartists.di.module.fragment.ArtistsTracksModule;
import com.github.dan4ik95dv.famousartists.di.scope.fragment.ArtistsTracksScope;
import com.github.dan4ik95dv.famousartists.ui.fragment.ArtistTracksFragment;

import dagger.Component;

/**
 * Created by Daniil Celikin on 23.03.2016.
 */
@ArtistsTracksScope
@Component(modules = ArtistsTracksModule.class)
public interface ArtistTracksComponent {

    void inject(ArtistTracksFragment fragment);

}
