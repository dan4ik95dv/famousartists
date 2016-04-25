package com.github.dan4ik95dv.famousartists.model.yandex.album.response;

import com.github.dan4ik95dv.famousartists.model.realm.RealmBoolean;
import com.github.dan4ik95dv.famousartists.model.realm.RealmInteger;
import com.github.dan4ik95dv.famousartists.model.realm.RealmString;
import com.github.dan4ik95dv.famousartists.model.yandex.Artist;
import com.github.dan4ik95dv.famousartists.model.yandex.Label;
import com.github.dan4ik95dv.famousartists.model.yandex.Volume;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

import io.realm.RealmList;

@Generated("org.jsonschema2pojo")
public class AlbumResponse {

    @SerializedName("id")
    @Expose
    private RealmInteger id;
    @SerializedName("title")
    @Expose
    private RealmString title;
    @SerializedName("year")
    @Expose
    private RealmInteger year;
    @SerializedName("cover")
    @Expose
    private RealmString cover;
    @SerializedName("coverUri")
    @Expose
    private RealmString coverUri;
    @SerializedName("genre")
    @Expose
    private RealmString genre;
//    @SerializedName("buy")
//    @Expose
//    private RealmList<Object> buy;
    @SerializedName("trackCount")
    @Expose
    private RealmInteger trackCount;
    @SerializedName("recent")
    @Expose
    private RealmBoolean recent;
    @SerializedName("veryImportant")
    @Expose
    private RealmBoolean veryImportant;
    @SerializedName("artists")
    @Expose
    private RealmList<Artist> artists;
    @SerializedName("labels")
    @Expose
    private RealmList<Label> labels;
    @SerializedName("available")
    @Expose
    private RealmBoolean available;
    @SerializedName("availableForPremiumUsers")
    @Expose
    private RealmBoolean availableForPremiumUsers;
    @SerializedName("availableForMobile")
    @Expose
    private RealmBoolean availableForMobile;
    @SerializedName("volumes")
    @Expose
    private RealmList<Volume> volumes;
    @SerializedName("redirected")
    @Expose
    private RealmBoolean redirected;

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
     * @return The year
     */
    public Integer getYear() {
        return year.getValue();
    }

    /**
     * @param year The year
     */
    public void setYear(Integer year) {
        this.year = new RealmInteger(year);
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

//    /**
//     * @return The buy
//     */
//    public RealmList<Object> getBuy() {
//        return buy;
//    }
//
//    /**
//     * @param buy The buy
//     */
//    public void setBuy(RealmList<Object> buy) {
//        this.buy = buy;
//    }

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
     * @return The labels
     */
    public RealmList<Label> getLabels() {
        return labels;
    }

    /**
     * @param labels The labels
     */
    public void setLabels(RealmList<Label> labels) {
        this.labels = labels;
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

    /**
     * @return The volumes
     */
    public RealmList<Volume> getVolumes() {
        return volumes;
    }

    /**
     * @param volumes The volumes
     */
    public void setVolumes(RealmList<Volume> volumes) {
        this.volumes = volumes;
    }

    /**
     * @return The redirected
     */
    public Boolean getRedirected() {
        return redirected.getValue();
    }

    /**
     * @param redirected The redirected
     */
    public void setRedirected(Boolean redirected) {
        this.redirected = new RealmBoolean(redirected);
    }

}
