package com.github.dan4ik95dv.famousartists.di.module;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.github.dan4ik95dv.famousartists.constant.Storage;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by Daniil Celikin on 09.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
@Module(includes = ApplicationModule.class)
public class StorageModule {

    @Provides
    @Singleton
    RealmConfiguration provideRealmConfiguration(Context applicationContext) {
        return new RealmConfiguration.Builder(applicationContext).name(Storage.NAME_SCHEME)
                                                                 .schemaVersion(Storage.SCHEMA_VERSION)
                                                                 .build();
    }

    @Provides
    Realm provideDefaultRealm(RealmConfiguration config) {
        return Realm.getInstance(config);
    }

    @Provides
    @Singleton
    SharedPreferences providesSharedPreferences(Context applicationContext) {
        return PreferenceManager.getDefaultSharedPreferences(applicationContext);
    }
}
