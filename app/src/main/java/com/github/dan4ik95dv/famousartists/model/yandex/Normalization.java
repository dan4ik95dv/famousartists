package com.github.dan4ik95dv.famousartists.model.yandex;

import com.github.dan4ik95dv.famousartists.model.realm.RealmDouble;
import com.github.dan4ik95dv.famousartists.model.realm.RealmInteger;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;


public class Normalization extends RealmObject {

    @SerializedName("gain")
    @Expose
    private RealmDouble gain;
    @SerializedName("peak")
    @Expose
    private RealmInteger peak;

    /**
     * @return The gain
     */
    public Double getGain() {
        return gain.getValue();
    }

    /**
     * @param gain The gain
     */
    public void setGain(Double gain) {
        this.gain = new RealmDouble(gain);
    }

    /**
     * @return The peak
     */
    public Integer getPeak() {
        return peak.getValue();
    }

    /**
     * @param peak The peak
     */
    public void setPeak(Integer peak) {
        this.peak = new RealmInteger(peak);
    }

}
