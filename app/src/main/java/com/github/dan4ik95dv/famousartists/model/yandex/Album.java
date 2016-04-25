package com.github.dan4ik95dv.famousartists.model.yandex;

import com.github.dan4ik95dv.famousartists.model.realm.RealmBoolean;
import com.github.dan4ik95dv.famousartists.model.realm.RealmInteger;
import com.github.dan4ik95dv.famousartists.model.realm.RealmString;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;


public class Album extends RealmObject {

    @PrimaryKey
    private int sId;

    @SerializedName("id")
    @Expose
    private RealmInteger id;
    @SerializedName("storageDir")
    @Expose
    private RealmString storageDir;
    @SerializedName("title")
    @Expose
    private RealmString title;
    @SerializedName("artists")
    @Expose
    private RealmList<Artist> artists;
    @SerializedName("cover")
    @Expose
    private RealmString cover;
    @SerializedName("coverUri")
    @Expose
    private RealmString coverUri;
    @SerializedName("trackCount")
    @Expose
    private RealmInteger trackCount;
    @SerializedName("genre")
    @Expose
    private RealmString genre;
    @SerializedName("recent")
    @Expose
    private RealmBoolean recent;
    @SerializedName("veryImportant")
    @Expose
    private RealmBoolean veryImportant;
    @SerializedName("available")
    @Expose
    private RealmBoolean available;
    @SerializedName("availableForPremiumUsers")
    @Expose
    private RealmBoolean availableForPremiumUsers;
    @SerializedName("availableForMobile")
    @Expose
    private RealmBoolean availableForMobile;

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
     * @return The cover
     */
    public String getCover() {
        return cover.getValue();
    }

    /**
     * @param cover The cover
     */
    public void setCover(String cover) {
        this.cover = new RealmString(cover);
    }

    /**
     * @return The coverUri
     */
    public String getCoverUri() {
        return coverUri.getValue();
    }

    /**
     * @param coverUri The coverUri
     */
    public void setCoverUri(String coverUri) {
        this.coverUri = new RealmString(coverUri);
    }

    /**
     * @return The trackCount
     */
    public Integer getTrackCount() {
        return trackCount.getValue();
    }

    /**
     * @param trackCount The trackCount
     */
    public void setTrackCount(Integer trackCount) {
        this.trackCount = new RealmInteger(trackCount);
    }

    /**
     * @return The genre
     */
    public String getGenre() {
        return genre.getValue();
    }

    /**
     * @param genre The genre
     */
    public void setGenre(String genre) {
        this.genre = new RealmString(genre);
    }

    /**
     * @return The recent
     */
    public Boolean getRecent() {
        return recent.getValue();
    }

    /**
     * @param recent The recent
     */
    public void setRecent(Boolean recent) {
        this.recent = new RealmBoolean(recent);
    }

    /**
     * @return The veryImportant
     */
    public Boolean getVeryImportant() {
        return veryImportant.getValue();
    }

    /**
     * @param veryImportant The veryImportant
     */
    public void setVeryImportant(Boolean veryImportant) {
        this.veryImportant = new RealmBoolean(veryImportant);
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
     * @return The availableForMobile
     */
    public Boolean getAvailableForMobile() {
        return availableForMobile.getValue();
    }

    /**
     * @param availableForMobile The availableForMobile
     */
    public void setAvailableForMobile(Boolean availableForMobile) {
        this.availableForMobile = new RealmBoolean(availableForMobile);
    }

}
