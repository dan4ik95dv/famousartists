package com.github.dan4ik95dv.famousartists.model.realm;

//import org.parceler.Parcel;

//import io.realm.RealmDoubleRealmProxy;

import io.realm.RealmObject;

/**
 * Created by Daniil Celikin on 10.02.2016.
 */
//@Parcel(implementations = {RealmDoubleRealmProxy.class}, value = Parcel.Serialization.BEAN, analyze = RealmDouble.class)
public class RealmFloat extends RealmObject {
    private Float value;

    public RealmFloat() {
    }

    public RealmFloat(Float value) {
        this.value = value;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }


}