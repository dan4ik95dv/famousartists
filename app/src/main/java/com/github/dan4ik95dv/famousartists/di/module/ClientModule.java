package com.github.dan4ik95dv.famousartists.di.module;

import com.github.dan4ik95dv.famousartists.constant.Client;
import com.github.dan4ik95dv.famousartists.io.client.RestContest;
import com.github.dan4ik95dv.famousartists.io.client.RestMusic;
import com.github.dan4ik95dv.famousartists.io.client.RestMusicSuggest;
import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

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
    public RestContest providesRestContest(Gson gson, OkHttpClient okHttpClient) {
        return new Retrofit.Builder()
                .baseUrl(Client.BASE_CONTEST_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(okHttpClient)
                .build().create(RestContest.class);
    }

    @Singleton
    @Provides
    public RestMusic providesRestMusic(Gson gson, OkHttpClient okHttpClient) {
        return new Retrofit.Builder()
                .baseUrl(Client.API_MUSIC_YANDEX)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(okHttpClient)
                .build().create(RestMusic.class);
    }


    @Singleton
    @Provides
    public RestMusicSuggest providesRestMusicSuggest(Gson gson, OkHttpClient okHttpClient) {
        return new Retrofit.Builder()
                .baseUrl(Client.BASE_SUGGEST_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(okHttpClient)
                .build().create(RestMusicSuggest.class);
    }
}