package com.github.dan4ik95dv.famousartists.model.realm;

import android.os.Parcel;

import org.parceler.Parcels;

/**
 * Created by Daniil Celikin on 25.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
public class RealmStringListParcelConverter extends RealmListParcelConverter<RealmString> {

    @Override
    public void itemToParcel(RealmString input, Parcel parcel) {
        parcel.writeParcelable(Parcels.wrap(input), 0);
    }

    @Override
    public RealmString itemFromParcel(Parcel parcel) {
        return Parcels.unwrap(parcel.readParcelable(RealmString.class.getClassLoader()));
    }


}