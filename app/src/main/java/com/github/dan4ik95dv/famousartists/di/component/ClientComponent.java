package com.github.dan4ik95dv.famousartists.di.component;

import com.github.dan4ik95dv.famousartists.di.module.ApplicationModule;
import com.github.dan4ik95dv.famousartists.di.module.ClientModule;
import com.github.dan4ik95dv.famousartists.di.module.NetModule;
import com.github.dan4ik95dv.famousartists.di.module.StorageModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Daniil Celikin on 10.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
@Singleton
@Component(modules = {ClientModule.class, ApplicationModule.class, NetModule.class,
        StorageModule.class})
public interface ClientComponent {

}