package com.github.dan4ik95dv.famousartists.model.yandex;

import com.github.dan4ik95dv.famousartists.model.realm.RealmBoolean;
import com.github.dan4ik95dv.famousartists.model.realm.RealmInteger;
import com.github.dan4ik95dv.famousartists.model.realm.RealmString;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;


public class Lyric extends RealmObject {
    @PrimaryKey
    private int sId;

    @SerializedName("id")
    @Expose
    private RealmInteger id;
    @SerializedName("lyrics")
    @Expose
    private RealmString lyrics;
    @SerializedName("fullLyrics")
    @Expose
    private RealmString fullLyrics;
    @SerializedName("hasRights")
    @Expose
    private RealmBoolean hasRights;

    public int getsId() {
        return sId;
    }

    /**
     * @return The id
     */
    public Integer getId() {
        return id.getValue();
    }

    /**
     * @param id The id
     */
    public void setId(Integer id) {
        this.id = new RealmInteger(id);
        this.sId = id;
    }

    /**
     * @return The lyrics
     */
    public String getLyrics() {
        return lyrics.getValue();
    }

    /**
     * @param lyrics The lyrics
     */
    public void setLyrics(String lyrics) {
        this.lyrics = new RealmString( lyrics);
    }

    /**
     * @return The fullLyrics
     */
    public String getFullLyrics() {
        return fullLyrics.getValue();
    }

    /**
     * @param fullLyrics The fullLyrics
     */
    public void setFullLyrics(String fullLyrics) {
        this.fullLyrics = new RealmString( fullLyrics);
    }

    /**
     * @return The hasRights
     */
    public Boolean getHasRights() {
        return hasRights.getValue();
    }

    /**
     * @param hasRights The hasRights
     */
    public void setHasRights(Boolean hasRights) {
        this.hasRights = new RealmBoolean(hasRights);
    }

}
