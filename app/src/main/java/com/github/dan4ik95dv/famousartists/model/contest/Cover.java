package com.github.dan4ik95dv.famousartists.model.contest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Daniil Celikin on 09.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */


public class Cover {

    @SerializedName("small")
    @Expose
    private String small;
    @SerializedName("big")
    @Expose
    private String big;

    /**
     * @return The small
     */
    public String getSmall() {
        return small;
    }

    /**
     * @param small The small
     */
    public void setSmall(String small) {
        this.small = small;
    }

    /**
     * @return The big
     */
    public String getBig() {
        return big;
    }

    /**
     * @param big The big
     */
    public void setBig(String big) {
        this.big = big;
    }

}