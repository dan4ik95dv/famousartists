package com.github.dan4ik95dv.famousartists.model.realm;

import org.parceler.Parcel;

import io.realm.RealmBooleanRealmProxy;
import io.realm.RealmObject;

/**
 * Created by Daniil Celikin on 13.11.2015.
 */
@Parcel(implementations = {RealmBooleanRealmProxy.class}, value = Parcel.Serialization.BEAN, analyze = RealmBoolean.class)
public class RealmBoolean extends RealmObject {
    private Boolean value;

    public RealmBoolean() {
    }

    public RealmBoolean(Boolean value) {
        this.value = value;
    }

    public Boolean getValue() {
        return value;
    }

    public void setValue(Boolean value) {
        this.value = value;
    }


}