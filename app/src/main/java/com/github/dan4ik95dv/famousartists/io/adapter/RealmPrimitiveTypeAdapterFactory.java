package com.github.dan4ik95dv.famousartists.io.adapter;

/**
 * Created by Daniil Celikin on 25.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */

import com.github.dan4ik95dv.famousartists.model.realm.RealmBoolean;
import com.github.dan4ik95dv.famousartists.model.realm.RealmDouble;
import com.github.dan4ik95dv.famousartists.model.realm.RealmInteger;
import com.github.dan4ik95dv.famousartists.model.realm.RealmLong;
import com.github.dan4ik95dv.famousartists.model.realm.RealmString;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

/**
 * Implementation of {@link TypeAdapterFactory} to support realm primitive wrappers
 *
 * @author milan
 */
public class RealmPrimitiveTypeAdapterFactory implements TypeAdapterFactory {

    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        final Class<? super T> rawType = typeToken.getRawType();

        if (rawType == RealmBoolean.class)
            return (TypeAdapter<T>) new AbstractRealmPrimitiveTypeAdapter.RealmBooleanTypeAdapter();
        else if (rawType == RealmDouble.class)
            return (TypeAdapter<T>) new AbstractRealmPrimitiveTypeAdapter.RealmDoubleTypeAdapter();
        else if (rawType == RealmInteger.class)
            return (TypeAdapter<T>) new AbstractRealmPrimitiveTypeAdapter.RealmIntegerTypeAdapter();
        else if (rawType == RealmLong.class)
            return (TypeAdapter<T>) new AbstractRealmPrimitiveTypeAdapter.RealmLongTypeAdapter();
        else if (rawType == RealmString.class)
            return (TypeAdapter<T>) new AbstractRealmPrimitiveTypeAdapter.RealmStringTypeAdapter();
        else
            return null;
    }
}