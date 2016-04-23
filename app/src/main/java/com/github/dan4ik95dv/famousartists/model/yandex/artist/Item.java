package com.github.dan4ik95dv.famousartists.model.yandex.artist;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Item {

    @SerializedName("thumb")
    @Expose
    private String thumb;
    @SerializedName("w")
    @Expose
    private Integer w;
    @SerializedName("h")
    @Expose
    private Integer h;

    /**
     * @return The thumb
     */
    public String getThumb() {
        return thumb;
    }

    /**
     * @param thumb The thumb
     */
    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    /**
     * @return The w
     */
    public Integer getW() {
        return w;
    }

    /**
     * @param w The w
     */
    public void setW(Integer w) {
        this.w = w;
    }

    /**
     * @return The h
     */
    public Integer getH() {
        return h;
    }

    /**
     * @param h The h
     */
    public void setH(Integer h) {
        this.h = h;
    }

}
