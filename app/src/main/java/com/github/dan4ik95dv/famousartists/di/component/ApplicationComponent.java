package com.github.dan4ik95dv.famousartists.di.component;

import com.github.dan4ik95dv.famousartists.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Daniil Celikin on 09.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
@Component(modules = {ApplicationModule.class})
@Singleton
public interface ApplicationComponent {
}
