package com.github.dan4ik95dv.famousartists.model.yandex;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class PopularTrack {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("storageDir")
    @Expose
    private String storageDir;
    @SerializedName("durationMillis")
    @Expose
    private Integer durationMillis;
    @SerializedName("durationMs")
    @Expose
    private Integer durationMs;
    @SerializedName("explicit")
    @Expose
    private Boolean explicit;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("available")
    @Expose
    private Boolean available;
    @SerializedName("album")
    @Expose
    private Album album;
    @SerializedName("albums")
    @Expose
    private List<Album> albums = new ArrayList<Album>();
    @SerializedName("artists")
    @Expose
    private List<Object> artists = new ArrayList<Object>();
    @SerializedName("regions")
    @Expose
    private List<String> regions = new ArrayList<String>();

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
     * @return The durationMillis
     */
    public Integer getDurationMillis() {
        return durationMillis;
    }

    /**
     * @param durationMillis The durationMillis
     */
    public void setDurationMillis(Integer durationMillis) {
        this.durationMillis = durationMillis;
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
     * @return The explicit
     */
    public Boolean getExplicit() {
        return explicit;
    }

    /**
     * @param explicit The explicit
     */
    public void setExplicit(Boolean explicit) {
        this.explicit = explicit;
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
     * @return The artists
     */
    public List<Object> getArtists() {
        return artists;
    }

    /**
     * @param artists The artists
     */
    public void setArtists(List<Object> artists) {
        this.artists = artists;
    }

    /**
     * @return The regions
     */
    public List<String> getRegions() {
        return regions;
    }

    /**
     * @param regions The regions
     */
    public void setRegions(List<String> regions) {
        this.regions = regions;
    }

}
