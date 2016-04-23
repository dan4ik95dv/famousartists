package com.github.dan4ik95dv.famousartists.model.yandex;

import com.github.dan4ik95dv.famousartists.model.yandex.artist.Label;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class Duplicate {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("year")
    @Expose
    private Integer year;
    @SerializedName("cover")
    @Expose
    private String cover;
    @SerializedName("coverUri")
    @Expose
    private String coverUri;
    @SerializedName("genre")
    @Expose
    private String genre;
    @SerializedName("buy")
    @Expose
    private List<Object> buy = new ArrayList<Object>();
    @SerializedName("trackCount")
    @Expose
    private Integer trackCount;
    @SerializedName("recent")
    @Expose
    private Boolean recent;
    @SerializedName("veryImportant")
    @Expose
    private Boolean veryImportant;
    @SerializedName("artists")
    @Expose
    private List<Artist> artists = new ArrayList<Artist>();
    @SerializedName("labels")
    @Expose
    private List<com.github.dan4ik95dv.famousartists.model.yandex.artist.Label> labels = new ArrayList<com.github.dan4ik95dv.famousartists.model.yandex.artist.Label>();
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
     * @return The year
     */
    public Integer getYear() {
        return year;
    }

    /**
     * @param year The year
     */
    public void setYear(Integer year) {
        this.year = year;
    }

    /**
     * @return The cover
     */
    public String getCover() {
        return cover;
    }

    /**
     * @param cover The cover
     */
    public void setCover(String cover) {
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
     * @return The buy
     */
    public List<Object> getBuy() {
        return buy;
    }

    /**
     * @param buy The buy
     */
    public void setBuy(List<Object> buy) {
        this.buy = buy;
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
     * @return The labels
     */
    public List<com.github.dan4ik95dv.famousartists.model.yandex.artist.Label> getLabels() {
        return labels;
    }

    /**
     * @param labels The labels
     */
    public void setLabels(List<Label> labels) {
        this.labels = labels;
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
