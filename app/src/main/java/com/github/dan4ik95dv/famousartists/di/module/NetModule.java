package com.github.dan4ik95dv.famousartists.di.module;

import android.app.Application;

import com.facebook.stetho.okhttp3.StethoInterceptor;
import com.github.dan4ik95dv.famousartists.BuildConfig;
import com.github.dan4ik95dv.famousartists.constant.Client;
import com.github.dan4ik95dv.famousartists.io.adapter.RealmPrimitiveTypeAdapterFactory;
import com.github.dan4ik95dv.famousartists.io.client.UserAgentInterceptor;
import com.github.dan4ik95dv.famousartists.model.realm.RealmBoolean;
import com.github.dan4ik95dv.famousartists.model.realm.RealmDouble;
import com.github.dan4ik95dv.famousartists.model.realm.RealmFloat;
import com.github.dan4ik95dv.famousartists.model.realm.RealmInteger;
import com.github.dan4ik95dv.famousartists.model.realm.RealmString;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.lang.reflect.Type;
import java.security.cert.CertificateException;
import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import dagger.Module;
import dagger.Provides;
import io.realm.RealmList;
import io.realm.RealmObject;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

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
    Gson provideGson() {
        Type tokenInteger = new TypeToken<RealmList<RealmInteger>>() {
        }.getType();
        Type tokenString = new TypeToken<RealmList<RealmString>>() {
        }.getType();
        Type tokenDouble = new TypeToken<RealmList<RealmDouble>>() {
        }.getType();
        Type tokenFloat = new TypeToken<RealmList<RealmFloat>>() {
        }.getType();
        Type tokenBoolean = new TypeToken<RealmList<RealmBoolean>>() {
        }.getType();

        return new GsonBuilder()
                .setExclusionStrategies(new ExclusionStrategy() {
                    @Override
                    public boolean shouldSkipField(FieldAttributes f) {
                        return f.getDeclaringClass().equals(RealmObject.class);
                    }

                    @Override
                    public boolean shouldSkipClass(Class<?> clazz) {
                        return false;
                    }
                })

                .registerTypeAdapter(tokenInteger, new TypeAdapter<RealmList<RealmInteger>>() {
                    @Override
                    public void write(JsonWriter out, RealmList<RealmInteger> value) throws IOException {
                        // Ignore
                    }

                    @Override
                    public RealmList<RealmInteger> read(JsonReader in) throws IOException {
                        RealmList<RealmInteger> list = new RealmList<>();
                        in.beginArray();
                        while (in.hasNext()) {
                            list.add(new RealmInteger(in.nextInt()));
                        }
                        in.endArray();
                        return list;
                    }
                })
                .registerTypeAdapter(tokenString, new TypeAdapter<RealmList<RealmString>>() {
                    @Override
                    public void write(JsonWriter out, RealmList<RealmString> value) throws IOException {
                        // Ignore
                    }

                    @Override
                    public RealmList<RealmString> read(JsonReader in) throws IOException {
                        RealmList<RealmString> list = new RealmList<>();
                        in.beginArray();
                        while (in.hasNext()) {
                            list.add(new RealmString(in.nextString()));
                        }
                        in.endArray();
                        return list;
                    }
                })
                .registerTypeAdapter(tokenBoolean, new TypeAdapter<RealmList<RealmBoolean>>() {
                    @Override
                    public void write(JsonWriter out, RealmList<RealmBoolean> value) throws IOException {
                        // Ignore
                    }

                    @Override
                    public RealmList<RealmBoolean> read(JsonReader in) throws IOException {
                        RealmList<RealmBoolean> list = new RealmList<>();
                        in.beginArray();
                        while (in.hasNext()) {
                            list.add(new RealmBoolean(in.nextBoolean()));
                        }
                        in.endArray();
                        return list;
                    }
                })
                .registerTypeAdapter(tokenDouble, new TypeAdapter<RealmList<RealmDouble>>() {
                    @Override
                    public void write(JsonWriter out, RealmList<RealmDouble> value) throws IOException {
                        // Ignore
                    }

                    @Override
                    public RealmList<RealmDouble> read(JsonReader in) throws IOException {
                        RealmList<RealmDouble> list = new RealmList<>();
                        in.beginArray();
                        while (in.hasNext()) {
                            list.add(new RealmDouble(in.nextDouble()));
                        }
                        in.endArray();
                        return list;
                    }
                })
                .registerTypeAdapter(tokenFloat, new TypeAdapter<RealmList<RealmFloat>>() {
                    @Override
                    public void write(JsonWriter out, RealmList<RealmFloat> value) throws IOException {
                        // Ignore
                    }

                    @Override
                    public RealmList<RealmFloat> read(JsonReader in) throws IOException {
                        RealmList<RealmFloat> list = new RealmList<>();
                        in.beginArray();
                        while (in.hasNext()) {
                            list.add(new RealmFloat((float) in.nextDouble()));
                        }
                        in.endArray();
                        return list;
                    }
                })
                .registerTypeAdapterFactory(new RealmPrimitiveTypeAdapterFactory())
                .create();
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
        try {
            // Create a trust manager that does not validate certificate chains
            final TrustManager[] trustAllCerts = new TrustManager[]{
                    new X509TrustManager() {
                        @Override
                        public void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType) throws CertificateException {
                        }

                        @Override
                        public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType) throws CertificateException {
                        }

                        @Override
                        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                            return new java.security.cert.X509Certificate[]{};
                        }
                    }
            };

            // Install the all-trusting trust manager
            final SSLContext sslContext = SSLContext.getInstance("SSL");
            sslContext.init(null, trustAllCerts, new java.security.SecureRandom());
            // Create an ssl socket factory with our all-trusting manager
            final SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();

            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.sslSocketFactory(sslSocketFactory);
            builder.cache(cache);
            builder.addInterceptor(new UserAgentInterceptor("Famous Artists v.1"));
            builder.addNetworkInterceptor(new StethoInterceptor());
            builder.connectTimeout(Client.Timeout.CONNECT_TIMEOUT, TimeUnit.SECONDS);
            builder.readTimeout(Client.Timeout.READ_TIMEOUT, TimeUnit.SECONDS);
            builder.writeTimeout(Client.Timeout.WRITE_TIMEOUT, TimeUnit.SECONDS);
            builder.hostnameVerifier(new HostnameVerifier() {
                @Override
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            });

            return  builder.build();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
