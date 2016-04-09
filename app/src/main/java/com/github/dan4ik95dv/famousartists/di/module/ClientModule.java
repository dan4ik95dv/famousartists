package com.github.dan4ik95dv.famousartists.di.module;

import com.github.dan4ik95dv.famousartists.io.client.Rest;

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
    public Rest providesRest(Retrofit retrofit) {
        return retrofit.create(Rest.class);
    }

}