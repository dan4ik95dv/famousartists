package com.github.dan4ik95dv.famousartists.di.component.activity;


import com.github.dan4ik95dv.famousartists.di.module.activity.MoreModule;
import com.github.dan4ik95dv.famousartists.di.scope.activity.MoreScope;
import com.github.dan4ik95dv.famousartists.ui.activity.MoreActivity;
import com.github.dan4ik95dv.famousartists.ui.presenter.MorePresenter;

import dagger.Component;

/**
 * Created by Daniil Celikin on 12.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
@MoreScope
@Component(modules = MoreModule.class)
public interface MoreComponent {

    void inject(MoreActivity activity);

}
