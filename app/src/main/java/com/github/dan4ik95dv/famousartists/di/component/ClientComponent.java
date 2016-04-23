package com.github.dan4ik95dv.famousartists.di.component;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.github.dan4ik95dv.famousartists.di.module.ApplicationModule;
import com.github.dan4ik95dv.famousartists.di.module.ClientModule;
import com.github.dan4ik95dv.famousartists.di.module.NetModule;
import com.github.dan4ik95dv.famousartists.di.module.StorageModule;
import com.github.dan4ik95dv.famousartists.io.client.RestContest;
import com.github.dan4ik95dv.famousartists.ui.presenter.ArtistsPresenter;
import com.github.dan4ik95dv.famousartists.ui.presenter.MainPresenter;
import com.github.dan4ik95dv.famousartists.ui.presenter.SettingsPresenter;

import javax.inject.Singleton;

import dagger.Component;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Created by Daniil Celikin on 10.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
@Singleton
@Component(modules = {ClientModule.class, ApplicationModule.class, NetModule.class,
        StorageModule.class})
public interface ClientComponent {

    SharedPreferences getSharedPreferences();

    Application getApplication();

    Context getApplicationContext();

    RestContest getRest();

    Cache getCache();

    OkHttpClient OkHttpClient();

    Retrofit getRetrofit();


    void inject(MainPresenter presenter);

    void inject(ArtistsPresenter presenter);

    void inject(SettingsPresenter presenter);
}