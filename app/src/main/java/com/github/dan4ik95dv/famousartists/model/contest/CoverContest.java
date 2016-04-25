package com.github.dan4ik95dv.famousartists.model.contest;

import com.github.dan4ik95dv.famousartists.model.realm.RealmString;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

import io.realm.CoverContestRealmProxy;
import io.realm.RealmObject;

/**
 * Created by Daniil Celikin on 09.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */

@Parcel(implementations = {CoverContestRealmProxy.class}, value = Parcel.Serialization.BEAN, analyze = CoverContest.class)
public class CoverContest extends RealmObject{

    @SerializedName("small")
    @Expose
    private RealmString small;
    @SerializedName("big")
    @Expose
    private RealmString big;

    /**
     * @return The small
     */
    public String getSmall() {
        return small.getValue();
    }

    /**
     * @param small The small
     */
    public void setSmall(String small) {
        this.small = new RealmString(small);
    }

    /**
     * @return The big
     */
    public String getBig() {
        return big.getValue();
    }

    /**
     * @param big The big
     */
    public void setBig(String big) {
        this.big = new RealmString(big);
    }

}