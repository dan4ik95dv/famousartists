package com.github.dan4ik95dv.famousartists.app;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import com.facebook.stetho.Stetho;
import com.github.dan4ik95dv.famousartists.BuildConfig;
import com.github.dan4ik95dv.famousartists.di.component.ApplicationComponent;
import com.github.dan4ik95dv.famousartists.di.component.ClientComponent;
import com.github.dan4ik95dv.famousartists.di.component.DaggerApplicationComponent;
import com.github.dan4ik95dv.famousartists.di.component.DaggerClientComponent;
import com.github.dan4ik95dv.famousartists.di.module.ApplicationModule;
import com.github.dan4ik95dv.famousartists.di.module.ClientModule;
import com.github.dan4ik95dv.famousartists.di.module.NetModule;

import io.realm.RealmConfiguration;


/**
 * Created by Daniil Celikin on 09.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
public class App extends Application {
    private static App self;
    private ApplicationComponent mApplicationComponent;
    private ClientComponent mClientComponent;
    private RealmConfiguration realmConfiguration;

    public static App getInstance() {
        return self;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        self = this;

        if (BuildConfig.DEBUG) Stetho.initializeWithDefaults(this);

        mClientComponent = DaggerClientComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .netModule(new NetModule())
                .clientModule(new ClientModule())
                .build();

        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();

    }


    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    public RealmConfiguration getRealmConfiguration() {
        return realmConfiguration;
    }

    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }

    public ClientComponent getClientComponent() {
        return mClientComponent;
    }
}
