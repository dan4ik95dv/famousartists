package com.github.dan4ik95dv.famousartists.model.yandex;

import com.github.dan4ik95dv.famousartists.model.realm.RealmBoolean;
import com.github.dan4ik95dv.famousartists.model.realm.RealmInteger;
import com.github.dan4ik95dv.famousartists.model.realm.RealmString;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;


public class Track extends RealmObject {

    @PrimaryKey
    private String sId;

    @SerializedName("id")
    @Expose
    private RealmString id;
    @SerializedName("realId")
    @Expose
    private RealmString realId;
    @SerializedName("title")
    @Expose
    private RealmString title;
    @SerializedName("available")
    @Expose
    private RealmBoolean available;
    @SerializedName("availableForPremiumUsers")
    @Expose
    private RealmBoolean availableForPremiumUsers;
    @SerializedName("durationMs")
    @Expose
    private RealmInteger durationMs;
    @SerializedName("storageDir")
    @Expose
    private RealmString storageDir;
    @SerializedName("fileSize")
    @Expose
    private RealmInteger fileSize;
    @SerializedName("normalization")
    @Expose
    private Normalization normalization;
    @SerializedName("artists")
    @Expose
    private RealmList<Artist> artists;
    @SerializedName("albums")
    @Expose
    private RealmList<Album> albums;
    @SerializedName("lyricsAvailable")
    @Expose
    private RealmBoolean lyricsAvailable;

    public String getsId() {
        return sId;
    }

    /**
     * @return The id
     */
    public String getId() {
        return id.getValue();
    }

    /**
     * @param id The id
     */
    public void setId(String id) {
        this.sId = id;
        this.id = new RealmString(id);
    }

    /**
     * @return The realId
     */
    public String getRealId() {
        return realId.getValue();
    }

    /**
     * @param realId The realId
     */
    public void setRealId(String realId) {
        this.realId = new RealmString(realId);
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
     * @return The availableForPremiumUsers
     */
    public Boolean getAvailableForPremiumUsers() {
        return availableForPremiumUsers.getValue();
    }

    /**
     * @param availableForPremiumUsers The availableForPremiumUsers
     */
    public void setAvailableForPremiumUsers(Boolean availableForPremiumUsers) {
        this.availableForPremiumUsers = new RealmBoolean(availableForPremiumUsers);
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
     * @return The fileSize
     */
    public Integer getFileSize() {
        return fileSize.getValue();
    }

    /**
     * @param fileSize The fileSize
     */
    public void setFileSize(Integer fileSize) {
        this.fileSize = new RealmInteger(fileSize);
    }

    /**
     * @return The normalization
     */
    public Normalization getNormalization() {
        return normalization;
    }

    /**
     * @param normalization The normalization
     */
    public void setNormalization(Normalization normalization) {
        this.normalization = normalization;
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
     * @return The lyricsAvailable
     */
    public Boolean getLyricsAvailable() {
        return lyricsAvailable.getValue();
    }

    /**
     * @param lyricsAvailable The lyricsAvailable
     */
    public void setLyricsAvailable(Boolean lyricsAvailable) {
        this.lyricsAvailable = new RealmBoolean(lyricsAvailable);
    }

}
