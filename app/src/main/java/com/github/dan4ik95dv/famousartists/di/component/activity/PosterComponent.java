package com.github.dan4ik95dv.famousartists.di.component.activity;

import com.github.dan4ik95dv.famousartists.di.module.activity.PosterModule;
import com.github.dan4ik95dv.famousartists.di.scope.activity.PosterScope;
import com.github.dan4ik95dv.famousartists.ui.activity.PosterActivity;

import dagger.Component;

@PosterScope
@Component(modules = PosterModule.class)
public interface PosterComponent {

    void inject(PosterActivity activity);

}
