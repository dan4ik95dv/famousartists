package com.github.dan4ik95dv.famousartists.di.module;

import android.app.Application;

import com.github.dan4ik95dv.famousartists.constant.Client;
import com.google.gson.Gson;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Daniil Celikin on 09.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */

@Module
public class NetModule {

    public NetModule() {
    }


    @Provides
    @Singleton
    Cache provideCache(Application application) {
        int cacheSize = 10 * 1024 * 1024;
        return new Cache(application.getCacheDir(), cacheSize);
    }

    @Provides
    @Singleton
    OkHttpClient provideOkHttpClient(Cache cache) {
        OkHttpClient.Builder httpClientBuilder = new OkHttpClient.Builder()
                .cache(cache)
                .connectTimeout(Client.Timeout.CONNECT_TIMEOUT, TimeUnit.SECONDS)
                .readTimeout(Client.Timeout.READ_TIMEOUT, TimeUnit.SECONDS)
                .writeTimeout(Client.Timeout.WRITE_TIMEOUT, TimeUnit.SECONDS);
//        if (BuildConfig.DEBUG)
//            httpClientBuilder.addNetworkInterceptor(new StethoInterceptor());

        return httpClientBuilder.build();
    }


    @Provides
    @Singleton
    Retrofit provideRetrofit(OkHttpClient okHttpClient) {
        return new Retrofit.Builder()
                .baseUrl(Client.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(okHttpClient)
                .build();
    }

}
