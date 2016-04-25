package com.github.dan4ik95dv.famousartists.model.yandex.artist;

import com.github.dan4ik95dv.famousartists.model.realm.RealmInteger;
import com.github.dan4ik95dv.famousartists.model.realm.RealmString;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;


public class ItemArtist extends RealmObject {

    @SerializedName("thumb")
    @Expose
    private RealmString thumb;
    @SerializedName("w")
    @Expose
    private RealmInteger w;
    @SerializedName("h")
    @Expose
    private RealmInteger h;

    /**
     * @return The thumb
     */
    public String getThumb() {
        return thumb.getValue();
    }

    /**
     * @param thumb The thumb
     */
    public void setThumb(String thumb) {
        this.thumb = new RealmString(thumb);
    }

    /**
     * @return The w
     */
    public Integer getW() {
        return w.getValue();
    }

    /**
     * @param w The w
     */
    public void setW(Integer w) {
        this.w = new RealmInteger(w);
    }

    /**
     * @return The h
     */
    public Integer getH() {
        return h.getValue();
    }

    /**
     * @param h The h
     */
    public void setH(Integer h) {
        this.h = new RealmInteger(h);
    }

}
