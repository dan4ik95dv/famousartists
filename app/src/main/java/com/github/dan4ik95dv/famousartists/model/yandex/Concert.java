package com.github.dan4ik95dv.famousartists.model.yandex;

import com.github.dan4ik95dv.famousartists.model.realm.RealmString;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import io.realm.RealmList;
import io.realm.RealmObject;


public class Concert extends RealmObject {

    @SerializedName("artist")
    @Expose
    private Artist artist;
    @SerializedName("concertTitle")
    @Expose
    private RealmString concertTitle;
    @SerializedName("afishaUrl")
    @Expose
    private RealmString afishaUrl;
    @SerializedName("city")
    @Expose
    private RealmString city;
    @SerializedName("place")
    @Expose
    private RealmString place;
    @SerializedName("datetime")
    @Expose
    private RealmString datetime;
    @SerializedName("metro-stations")
    @Expose
    private RealmList<MetroStation> metroStations;
    @SerializedName("hash")
    @Expose
    private RealmString hash;
    @SerializedName("images")
    @Expose
    private RealmList<RealmString> images;

    /**
     * @return The artist
     */
    public Artist getArtist() {
        return artist;
    }

    /**
     * @param artist The artist
     */
    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    /**
     * @return The concertTitle
     */
    public String getConcertTitle() {
        return concertTitle.getValue();
    }

    /**
     * @param concertTitle The concertTitle
     */
    public void setConcertTitle(String concertTitle) {
        this.concertTitle = new RealmString(concertTitle);
    }

    /**
     * @return The afishaUrl
     */
    public String getAfishaUrl() {
        return afishaUrl.getValue();
    }

    /**
     * @param afishaUrl The afishaUrl
     */
    public void setAfishaUrl(String afishaUrl) {
        this.afishaUrl = new RealmString(afishaUrl);
    }

    /**
     * @return The city
     */
    public String getCity() {
        return city.getValue();
    }

    /**
     * @param city The city
     */
    public void setCity(String city) {
        this.city = new RealmString( city);
    }

    /**
     * @return The place
     */
    public String getPlace() {
        return place.getValue();
    }

    /**
     * @param place The place
     */
    public void setPlace(String place) {
        this.place =  new RealmString(place);
    }

    /**
     * @return The datetime
     */
    public String getDatetime() {
        return datetime.getValue();
    }

    /**
     * @param datetime The datetime
     */
    public void setDatetime(String datetime) {
        this.datetime = new RealmString(datetime);
    }

    /**
     * @return The metroStations
     */
    public List<MetroStation> getMetroStations() {
        return metroStations;
    }

    /**
     * @param metroStations The metro-stations
     */
    public void setMetroStations(RealmList<MetroStation> metroStations) {
        this.metroStations = metroStations;
    }

    /**
     * @return The hash
     */
    public String getHash() {
        return hash.getValue();
    }

    /**
     * @param hash The hash
     */
    public void setHash(String hash) {
        this.hash = new RealmString(hash);
    }

    /**
     * @return The images
     */
    public RealmList<RealmString> getImages() {
        return images;
    }

    /**
     * @param images The images
     */
    public void setImages(RealmList<RealmString> images) {
        this.images = images;
    }

}
