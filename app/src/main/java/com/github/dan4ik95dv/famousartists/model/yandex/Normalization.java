package com.github.dan4ik95dv.famousartists.model.yandex;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Normalization {

    @SerializedName("gain")
    @Expose
    private Double gain;
    @SerializedName("peak")
    @Expose
    private Integer peak;

    /**
     * @return The gain
     */
    public Double getGain() {
        return gain;
    }

    /**
     * @param gain The gain
     */
    public void setGain(Double gain) {
        this.gain = gain;
    }

    /**
     * @return The peak
     */
    public Integer getPeak() {
        return peak;
    }

    /**
     * @param peak The peak
     */
    public void setPeak(Integer peak) {
        this.peak = peak;
    }

}
