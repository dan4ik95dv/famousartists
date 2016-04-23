package com.github.dan4ik95dv.famousartists.model.yandex;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class Track {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("realId")
    @Expose
    private String realId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("available")
    @Expose
    private Boolean available;
    @SerializedName("availableForPremiumUsers")
    @Expose
    private Boolean availableForPremiumUsers;
    @SerializedName("durationMs")
    @Expose
    private Integer durationMs;
    @SerializedName("storageDir")
    @Expose
    private String storageDir;
    @SerializedName("fileSize")
    @Expose
    private Integer fileSize;
    @SerializedName("normalization")
    @Expose
    private Normalization normalization;
    @SerializedName("artists")
    @Expose
    private List<Artist> artists = new ArrayList<Artist>();
    @SerializedName("albums")
    @Expose
    private List<Album> albums = new ArrayList<Album>();
    @SerializedName("lyricsAvailable")
    @Expose
    private Boolean lyricsAvailable;

    /**
     * @return The id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return The realId
     */
    public String getRealId() {
        return realId;
    }

    /**
     * @param realId The realId
     */
    public void setRealId(String realId) {
        this.realId = realId;
    }

    /**
     * @return The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return The available
     */
    public Boolean getAvailable() {
        return available;
    }

    /**
     * @param available The available
     */
    public void setAvailable(Boolean available) {
        this.available = available;
    }

    /**
     * @return The availableForPremiumUsers
     */
    public Boolean getAvailableForPremiumUsers() {
        return availableForPremiumUsers;
    }

    /**
     * @param availableForPremiumUsers The availableForPremiumUsers
     */
    public void setAvailableForPremiumUsers(Boolean availableForPremiumUsers) {
        this.availableForPremiumUsers = availableForPremiumUsers;
    }

    /**
     * @return The durationMs
     */
    public Integer getDurationMs() {
        return durationMs;
    }

    /**
     * @param durationMs The durationMs
     */
    public void setDurationMs(Integer durationMs) {
        this.durationMs = durationMs;
    }

    /**
     * @return The storageDir
     */
    public String getStorageDir() {
        return storageDir;
    }

    /**
     * @param storageDir The storageDir
     */
    public void setStorageDir(String storageDir) {
        this.storageDir = storageDir;
    }

    /**
     * @return The fileSize
     */
    public Integer getFileSize() {
        return fileSize;
    }

    /**
     * @param fileSize The fileSize
     */
    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
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
    public List<Artist> getArtists() {
        return artists;
    }

    /**
     * @param artists The artists
     */
    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    /**
     * @return The albums
     */
    public List<Album> getAlbums() {
        return albums;
    }

    /**
     * @param albums The albums
     */
    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    /**
     * @return The lyricsAvailable
     */
    public Boolean getLyricsAvailable() {
        return lyricsAvailable;
    }

    /**
     * @param lyricsAvailable The lyricsAvailable
     */
    public void setLyricsAvailable(Boolean lyricsAvailable) {
        this.lyricsAvailable = lyricsAvailable;
    }

}
