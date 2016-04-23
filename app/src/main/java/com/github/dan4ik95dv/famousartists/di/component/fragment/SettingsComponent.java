package com.github.dan4ik95dv.famousartists.di.component.fragment;

import com.github.dan4ik95dv.famousartists.di.module.fragment.SettingsModule;
import com.github.dan4ik95dv.famousartists.di.scope.fragment.SettingsScope;
import com.github.dan4ik95dv.famousartists.ui.fragment.SettingsFragment;

import dagger.Component;

/**
 * Created by Daniil Celikin on 21.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
@SettingsScope
@Component(modules = SettingsModule.class)
public interface SettingsComponent {
    void inject(SettingsFragment fragment);
}
