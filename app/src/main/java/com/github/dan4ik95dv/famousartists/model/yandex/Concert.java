package com.github.dan4ik95dv.famousartists.model.yandex;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class Concert {

    @SerializedName("artist")
    @Expose
    private Artist artist;
    @SerializedName("concertTitle")
    @Expose
    private String concertTitle;
    @SerializedName("afishaUrl")
    @Expose
    private String afishaUrl;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("place")
    @Expose
    private String place;
    @SerializedName("datetime")
    @Expose
    private String datetime;
    @SerializedName("metro-stations")
    @Expose
    private List<MetroStation> metroStations = new ArrayList<MetroStation>();
    @SerializedName("hash")
    @Expose
    private String hash;
    @SerializedName("images")
    @Expose
    private List<Object> images = new ArrayList<Object>();

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
        return concertTitle;
    }

    /**
     * @param concertTitle The concertTitle
     */
    public void setConcertTitle(String concertTitle) {
        this.concertTitle = concertTitle;
    }

    /**
     * @return The afishaUrl
     */
    public String getAfishaUrl() {
        return afishaUrl;
    }

    /**
     * @param afishaUrl The afishaUrl
     */
    public void setAfishaUrl(String afishaUrl) {
        this.afishaUrl = afishaUrl;
    }

    /**
     * @return The city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city The city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return The place
     */
    public String getPlace() {
        return place;
    }

    /**
     * @param place The place
     */
    public void setPlace(String place) {
        this.place = place;
    }

    /**
     * @return The datetime
     */
    public String getDatetime() {
        return datetime;
    }

    /**
     * @param datetime The datetime
     */
    public void setDatetime(String datetime) {
        this.datetime = datetime;
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
    public void setMetroStations(List<MetroStation> metroStations) {
        this.metroStations = metroStations;
    }

    /**
     * @return The hash
     */
    public String getHash() {
        return hash;
    }

    /**
     * @param hash The hash
     */
    public void setHash(String hash) {
        this.hash = hash;
    }

    /**
     * @return The images
     */
    public List<Object> getImages() {
        return images;
    }

    /**
     * @param images The images
     */
    public void setImages(List<Object> images) {
        this.images = images;
    }

}
