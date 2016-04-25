package com.github.dan4ik95dv.famousartists.model.realm;

import org.parceler.Parcel;

import io.realm.RealmObject;
import io.realm.RealmStringRealmProxy;

/**
 * Created by Daniil Celikin on 13.11.2015.
 */
@Parcel(implementations = {RealmStringRealmProxy.class}, value = Parcel.Serialization.BEAN, analyze = RealmString.class)
public class RealmString extends RealmObject {
    private String value;

    public RealmString() {
    }

    public RealmString(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
