package com.github.dan4ik95dv.famousartists.model.realm;

import org.parceler.Parcel;

import io.realm.RealmIntegerRealmProxy;
import io.realm.RealmObject;

/**
 * Created by Daniil Celikin on 13.11.2015.
 */
@Parcel(implementations = {RealmIntegerRealmProxy.class}, value = Parcel.Serialization.BEAN, analyze = RealmInteger.class)
public class RealmInteger extends RealmObject {
    private Integer value;

    public RealmInteger() {
    }

    public RealmInteger(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }


}