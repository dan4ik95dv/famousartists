package com.github.dan4ik95dv.famousartists.di.component.fragment;

import com.github.dan4ik95dv.famousartists.di.module.fragment.ArtistsAlbumsModule;
import com.github.dan4ik95dv.famousartists.di.scope.fragment.ArtistsAlbumsScope;
import com.github.dan4ik95dv.famousartists.ui.fragment.ArtistAlbumsFragment;

import dagger.Component;

/**
 * Created by Daniil Celikin on 23.03.2016.
 */
@ArtistsAlbumsScope
@Component(modules = ArtistsAlbumsModule.class)
public interface ArtistAlbumsComponent {

    void inject(ArtistAlbumsFragment fragment);

}
