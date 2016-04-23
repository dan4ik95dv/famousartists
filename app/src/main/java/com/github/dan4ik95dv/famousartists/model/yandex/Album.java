package com.github.dan4ik95dv.famousartists.model.yandex;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class Album {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("storageDir")
    @Expose
    private String storageDir;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("artists")
    @Expose
    private List<Object> artists = new ArrayList<Object>();
    @SerializedName("cover")
    @Expose
    private Integer cover;
    @SerializedName("coverUri")
    @Expose
    private String coverUri;
    @SerializedName("trackCount")
    @Expose
    private Integer trackCount;
    @SerializedName("genre")
    @Expose
    private String genre;
    @SerializedName("recent")
    @Expose
    private Boolean recent;
    @SerializedName("veryImportant")
    @Expose
    private Boolean veryImportant;
    @SerializedName("available")
    @Expose
    private Boolean available;
    @SerializedName("availableForPremiumUsers")
    @Expose
    private Boolean availableForPremiumUsers;
    @SerializedName("availableForMobile")
    @Expose
    private Boolean availableForMobile;

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
     * @return The cover
     */
    public Integer getCover() {
        return cover;
    }

    /**
     * @param cover The cover
     */
    public void setCover(Integer cover) {
        this.cover = cover;
    }

    /**
     * @return The coverUri
     */
    public String getCoverUri() {
        return coverUri;
    }

    /**
     * @param coverUri The coverUri
     */
    public void setCoverUri(String coverUri) {
        this.coverUri = coverUri;
    }

    /**
     * @return The trackCount
     */
    public Integer getTrackCount() {
        return trackCount;
    }

    /**
     * @param trackCount The trackCount
     */
    public void setTrackCount(Integer trackCount) {
        this.trackCount = trackCount;
    }

    /**
     * @return The genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre The genre
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * @return The recent
     */
    public Boolean getRecent() {
        return recent;
    }

    /**
     * @param recent The recent
     */
    public void setRecent(Boolean recent) {
        this.recent = recent;
    }

    /**
     * @return The veryImportant
     */
    public Boolean getVeryImportant() {
        return veryImportant;
    }

    /**
     * @param veryImportant The veryImportant
     */
    public void setVeryImportant(Boolean veryImportant) {
        this.veryImportant = veryImportant;
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
     * @return The availableForMobile
     */
    public Boolean getAvailableForMobile() {
        return availableForMobile;
    }

    /**
     * @param availableForMobile The availableForMobile
     */
    public void setAvailableForMobile(Boolean availableForMobile) {
        this.availableForMobile = availableForMobile;
    }

}
