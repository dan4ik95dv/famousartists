package com.github.dan4ik95dv.famousartists.di.module;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Daniil Celikin on 09.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
@Module(includes = ApplicationModule.class)
public class StorageModule {

    @Provides
    @Singleton
    SharedPreferences providesSharedPreferences(Context applicationContext) {
        return PreferenceManager.getDefaultSharedPreferences(applicationContext);
    }
}
