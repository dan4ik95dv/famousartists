package com.github.dan4ik95dv.famousartists.model.yandex;

import com.github.dan4ik95dv.famousartists.model.realm.RealmInteger;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;


public class Counts extends RealmObject {

    @SerializedName("tracks")
    @Expose
    private RealmInteger tracks;
    @SerializedName("directAlbums")
    @Expose
    private RealmInteger directAlbums;
    @SerializedName("alsoAlbums")
    @Expose
    private RealmInteger alsoAlbums;
    @SerializedName("similarCount")
    @Expose
    private RealmInteger similarCount;

    /**
     * @return The tracks
     */
    public Integer getTracks() {
        return tracks.getValue();
    }

    /**
     * @param tracks The tracks
     */
    public void setTracks(Integer tracks) {
        this.tracks = new RealmInteger(tracks);
    }

    /**
     * @return The directAlbums
     */
    public Integer getDirectAlbums() {
        return directAlbums.getValue();
    }

    /**
     * @param directAlbums The directAlbums
     */
    public void setDirectAlbums(Integer directAlbums) {
        this.directAlbums = new RealmInteger(directAlbums);
    }

    /**
     * @return The alsoAlbums
     */
    public Integer getAlsoAlbums() {
        return alsoAlbums.getValue();
    }

    /**
     * @param alsoAlbums The alsoAlbums
     */
    public void setAlsoAlbums(Integer alsoAlbums) {
        this.alsoAlbums = new RealmInteger(alsoAlbums);
    }

    /**
     * @return The similarCount
     */
    public Integer getSimilarCount() {
        return similarCount.getValue();
    }

    /**
     * @param similarCount The similarCount
     */
    public void setSimilarCount(Integer similarCount) {
        this.similarCount = new RealmInteger( similarCount);
    }

}
