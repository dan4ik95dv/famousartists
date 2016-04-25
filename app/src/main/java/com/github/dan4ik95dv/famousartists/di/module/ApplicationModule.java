package com.github.dan4ik95dv.famousartists.di.module;

import android.app.Application;
import android.content.Context;

import com.github.dan4ik95dv.famousartists.app.App;
import com.github.dan4ik95dv.famousartists.io.bus.RxBus;
import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Daniil Celikin on 09.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */

@Module
public class ApplicationModule {
    private Application mApp;

    public ApplicationModule(Application app) {
        mApp = app;
    }

    @Provides
    @Singleton
    Application providesApplication() {
        return mApp;
    }

    @Provides
    RxBus provideRxBus() {
        return RxBus.getDefault();
    }

    @Provides
    Context provideApplicationContext() {
        return App.getInstance();
    }

    @Provides
    @Singleton
    RefWatcher provideRefWatcher() {
        return LeakCanary.install(mApp);
    }

}
