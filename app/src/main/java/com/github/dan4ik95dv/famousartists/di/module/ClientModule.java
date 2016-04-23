package com.github.dan4ik95dv.famousartists.di.module;

import com.github.dan4ik95dv.famousartists.io.client.RestContest;
import com.github.dan4ik95dv.famousartists.io.client.RestMusic;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by Daniil Celikin on 09.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
@Module
public class ClientModule {

    public ClientModule() {
    }

    @Singleton
    @Provides
    public RestContest providesRestContest(Retrofit retrofit) {
        return retrofit.create(RestContest.class);
    }

    @Singleton
    @Provides
    public RestMusic providesRestMusicApi(Retrofit retrofit) {
        return retrofit.create(RestMusic.class);
    }

}