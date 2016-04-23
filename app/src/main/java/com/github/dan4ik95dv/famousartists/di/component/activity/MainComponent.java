package com.github.dan4ik95dv.famousartists.di.component.activity;


import com.github.dan4ik95dv.famousartists.di.module.activity.MainModule;
import com.github.dan4ik95dv.famousartists.di.scope.activity.MainScope;
import com.github.dan4ik95dv.famousartists.ui.activity.MainActivity;

import dagger.Component;

/**
 * Created by Daniil Celikin on 12.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
@MainScope
@Component(modules = MainModule.class)
public interface MainComponent {

    void inject(MainActivity activity);

}
