package com.github.dan4ik95dv.famousartists.di.component.fragment;

import com.github.dan4ik95dv.famousartists.di.module.fragment.ArtistsDescriptionModule;
import com.github.dan4ik95dv.famousartists.di.scope.fragment.ArtistsDescriptionScope;
import com.github.dan4ik95dv.famousartists.ui.fragment.ArtistDescriptionFragment;

import dagger.Component;

/**
 * Created by Daniil Celikin on 23.03.2016.
 */
@ArtistsDescriptionScope
@Component(modules = ArtistsDescriptionModule.class)
public interface ArtistDescriptionComponent {

    void inject(ArtistDescriptionFragment fragment);

}
