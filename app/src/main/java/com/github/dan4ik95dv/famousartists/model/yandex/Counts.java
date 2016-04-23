package com.github.dan4ik95dv.famousartists.model.yandex;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Counts {

    @SerializedName("tracks")
    @Expose
    private Integer tracks;
    @SerializedName("directAlbums")
    @Expose
    private Integer directAlbums;
    @SerializedName("alsoAlbums")
    @Expose
    private Integer alsoAlbums;
    @SerializedName("similarCount")
    @Expose
    private Integer similarCount;

    /**
     * @return The tracks
     */
    public Integer getTracks() {
        return tracks;
    }

    /**
     * @param tracks The tracks
     */
    public void setTracks(Integer tracks) {
        this.tracks = tracks;
    }

    /**
     * @return The directAlbums
     */
    public Integer getDirectAlbums() {
        return directAlbums;
    }

    /**
     * @param directAlbums The directAlbums
     */
    public void setDirectAlbums(Integer directAlbums) {
        this.directAlbums = directAlbums;
    }

    /**
     * @return The alsoAlbums
     */
    public Integer getAlsoAlbums() {
        return alsoAlbums;
    }

    /**
     * @param alsoAlbums The alsoAlbums
     */
    public void setAlsoAlbums(Integer alsoAlbums) {
        this.alsoAlbums = alsoAlbums;
    }

    /**
     * @return The similarCount
     */
    public Integer getSimilarCount() {
        return similarCount;
    }

    /**
     * @param similarCount The similarCount
     */
    public void setSimilarCount(Integer similarCount) {
        this.similarCount = similarCount;
    }

}
