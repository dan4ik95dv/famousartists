package com.github.dan4ik95dv.famousartists.di.component;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.github.dan4ik95dv.famousartists.di.module.ApplicationModule;
import com.github.dan4ik95dv.famousartists.di.module.ClientModule;
import com.github.dan4ik95dv.famousartists.di.module.NetModule;
import com.github.dan4ik95dv.famousartists.di.module.StorageModule;
import com.github.dan4ik95dv.famousartists.io.bus.RxBus;
import com.github.dan4ik95dv.famousartists.io.client.RestContest;
import com.github.dan4ik95dv.famousartists.io.client.RestMusic;
import com.github.dan4ik95dv.famousartists.io.client.RestMusicSuggest;
import com.github.dan4ik95dv.famousartists.ui.presenter.ArtistAlbumsPresenter;
import com.github.dan4ik95dv.famousartists.ui.presenter.ArtistDescriptionPresenter;
import com.github.dan4ik95dv.famousartists.ui.presenter.ArtistTracksPresenter;
import com.github.dan4ik95dv.famousartists.ui.presenter.ArtistsPresenter;
import com.github.dan4ik95dv.famousartists.ui.presenter.MainPresenter;
import com.github.dan4ik95dv.famousartists.ui.presenter.MorePresenter;
import com.github.dan4ik95dv.famousartists.ui.presenter.SettingsPresenter;
import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Component;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

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

    RestContest getRestContest();

    RestMusic getRestMusic();

    RestMusicSuggest getRestMusicSuggest();

    RealmConfiguration getRealmConfiguration();

    Realm getDefaultRealm();

    Gson getGson();

    Cache getCache();

    OkHttpClient getOkHttpClient();

    RxBus getRxBus();


    void inject(ArtistTracksPresenter presenter);

    void inject(ArtistDescriptionPresenter presenter);

    void inject(ArtistAlbumsPresenter presenter);

    void inject(MainPresenter presenter);

    void inject(MorePresenter presenter);

    void inject(ArtistsPresenter presenter);

    void inject(SettingsPresenter presenter);
}