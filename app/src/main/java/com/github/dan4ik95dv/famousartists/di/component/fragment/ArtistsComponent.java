package com.github.dan4ik95dv.famousartists.di.component.fragment;

import com.github.dan4ik95dv.famousartists.di.module.fragment.ArtistsModule;
import com.github.dan4ik95dv.famousartists.di.scope.fragment.ArtistsScope;
import com.github.dan4ik95dv.famousartists.ui.fragment.ArtistsFragment;

import dagger.Component;

/**
 * Created by Daniil Celikin on 21.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
@ArtistsScope
@Component(modules = ArtistsModule.class)
public interface ArtistsComponent {
    void inject(ArtistsFragment fragment);
}
