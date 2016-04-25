package com.github.dan4ik95dv.famousartists.model.yandex;

import com.github.dan4ik95dv.famousartists.model.realm.RealmBoolean;
import com.github.dan4ik95dv.famousartists.model.realm.RealmInteger;
import com.github.dan4ik95dv.famousartists.model.realm.RealmString;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;


public class PopularTrack extends RealmObject {

    @PrimaryKey
    private Integer sId;

    @SerializedName("id")
    @Expose
    private RealmInteger id;
    @SerializedName("storageDir")
    @Expose
    private RealmString storageDir;
    @SerializedName("durationMillis")
    @Expose
    private RealmInteger durationMillis;
    @SerializedName("durationMs")
    @Expose
    private RealmInteger durationMs;
    @SerializedName("explicit")
    @Expose
    private RealmBoolean explicit;
    @SerializedName("title")
    @Expose
    private RealmString title;
    @SerializedName("available")
    @Expose
    private RealmBoolean available;
    @SerializedName("album")
    @Expose
    private Album album;
    @SerializedName("albums")
    @Expose
    private RealmList<Album> albums;
    @SerializedName("artists")
    @Expose
    private RealmList<Artist> artists;
    @SerializedName("regions")
    @Expose
    private RealmList<RealmString> regions;

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
        this.sId = id;
        this.id = new RealmInteger(id);
    }

    /**
     * @return The storageDir
     */
    public String getStorageDir() {
        return storageDir.getValue();
    }

    /**
     * @param storageDir The storageDir
     */
    public void setStorageDir(String storageDir) {
        this.storageDir = new RealmString(storageDir);
    }

    /**
     * @return The durationMillis
     */
    public Integer getDurationMillis() {
        return durationMillis.getValue();
    }

    /**
     * @param durationMillis The durationMillis
     */
    public void setDurationMillis(Integer durationMillis) {
        this.durationMillis = new RealmInteger(durationMillis);
    }

    /**
     * @return The durationMs
     */
    public Integer getDurationMs() {
        return durationMs.getValue();
    }

    /**
     * @param durationMs The durationMs
     */
    public void setDurationMs(Integer durationMs) {
        this.durationMs = new RealmInteger(durationMs);
    }

    /**
     * @return The explicit
     */
    public Boolean getExplicit() {
        return explicit.getValue();
    }

    /**
     * @param explicit The explicit
     */
    public void setExplicit(Boolean explicit) {
        this.explicit = new RealmBoolean(explicit);
    }

    /**
     * @return The title
     */
    public String getTitle() {
        return title.getValue();
    }

    /**
     * @param title The title
     */
    public void setTitle(String title) {
        this.title = new RealmString(title);
    }

    /**
     * @return The available
     */
    public Boolean getAvailable() {
        return available.getValue();
    }

    /**
     * @param available The available
     */
    public void setAvailable(Boolean available) {
        this.available = new RealmBoolean(available);
    }

    /**
     * @return The album
     */
    public Album getAlbum() {
        return album;
    }

    /**
     * @param album The album
     */
    public void setAlbum(Album album) {
        this.album = album;
    }

    /**
     * @return The albums
     */
    public RealmList<Album> getAlbums() {
        return albums;
    }

    /**
     * @param albums The albums
     */
    public void setAlbums(RealmList<Album> albums) {
        this.albums = albums;
    }

    /**
     * @return The artists
     */
    public RealmList<Artist> getArtists() {
        return artists;
    }

    /**
     * @param artists The artists
     */
    public void setArtists(RealmList<Artist> artists) {
        this.artists = artists;
    }

    /**
     * @return The regions
     */
    public RealmList<RealmString> getRegions() {
        return regions;
    }

    /**
     * @param regions The regions
     */
    public void setRegions(RealmList<RealmString> regions) {
        this.regions = regions;
    }

}
