package com.github.dan4ik95dv.famousartists.model.realm;

import org.parceler.Parcel;

import io.realm.RealmDoubleRealmProxy;
import io.realm.RealmLongRealmProxy;
import io.realm.RealmObject;

/**
 * Created by Daniil Celikin on 13.11.2015.
 */
@Parcel(implementations = {RealmLongRealmProxy.class}, value = Parcel.Serialization.BEAN, analyze = RealmLong.class)
public class RealmLong extends RealmObject {
    private Long value;

    public RealmLong() {
    }

    public RealmLong(Long value) {
        this.value = value;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }


}