package com.github.dan4ik95dv.famousartists.model.yandex;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Lyric {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("lyrics")
    @Expose
    private String lyrics;
    @SerializedName("fullLyrics")
    @Expose
    private String fullLyrics;
    @SerializedName("hasRights")
    @Expose
    private Boolean hasRights;

    /**
     * @return The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return The lyrics
     */
    public String getLyrics() {
        return lyrics;
    }

    /**
     * @param lyrics The lyrics
     */
    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    /**
     * @return The fullLyrics
     */
    public String getFullLyrics() {
        return fullLyrics;
    }

    /**
     * @param fullLyrics The fullLyrics
     */
    public void setFullLyrics(String fullLyrics) {
        this.fullLyrics = fullLyrics;
    }

    /**
     * @return The hasRights
     */
    public Boolean getHasRights() {
        return hasRights;
    }

    /**
     * @param hasRights The hasRights
     */
    public void setHasRights(Boolean hasRights) {
        this.hasRights = hasRights;
    }

}
