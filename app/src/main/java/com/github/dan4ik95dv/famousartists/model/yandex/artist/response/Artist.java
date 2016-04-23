package com.github.dan4ik95dv.famousartists.model.yandex.artist.response;

import com.github.dan4ik95dv.famousartists.model.yandex.Album;
import com.github.dan4ik95dv.famousartists.model.yandex.Concert;
import com.github.dan4ik95dv.famousartists.model.yandex.Pics;
import com.github.dan4ik95dv.famousartists.model.yandex.Radio;
import com.github.dan4ik95dv.famousartists.model.yandex.Similar;
import com.github.dan4ik95dv.famousartists.model.yandex.Track;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class Artist {

    @SerializedName("artist")
    @Expose
    private com.github.dan4ik95dv.famousartists.model.yandex.Artist artist;
    @SerializedName("similar")
    @Expose
    private List<Similar> similar = new ArrayList<Similar>();
    @SerializedName("albums")
    @Expose
    private List<Album> albums = new ArrayList<Album>();
    @SerializedName("alsoAlbums")
    @Expose
    private List<Album> alsoAlbums = new ArrayList<Album>();
    @SerializedName("tracks")
    @Expose
    private List<Track> tracks = new ArrayList<Track>();
    @SerializedName("concerts")
    @Expose
    private List<Concert> concerts = new ArrayList<Concert>();
    @SerializedName("redirected")
    @Expose
    private Boolean redirected;
    @SerializedName("trackIds")
    @Expose
    private List<String> trackIds = new ArrayList<String>();
    @SerializedName("pics")
    @Expose
    private Pics pics;
    @SerializedName("radio")
    @Expose
    private Radio radio;

    /**
     * @return The artist
     */
    public com.github.dan4ik95dv.famousartists.model.yandex.Artist getArtist() {
        return artist;
    }

    /**
     * @param artist The artist
     */
    public void setArtist(com.github.dan4ik95dv.famousartists.model.yandex.Artist artist) {
        this.artist = artist;
    }

    /**
     * @return The similar
     */
    public List<Similar> getSimilar() {
        return similar;
    }

    /**
     * @param similar The similar
     */
    public void setSimilar(List<Similar> similar) {
        this.similar = similar;
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
     * @return The alsoAlbums
     */
    public List<Album> getAlsoAlbums() {
        return alsoAlbums;
    }

    /**
     * @param alsoAlbums The alsoAlbums
     */
    public void setAlsoAlbums(List<Album> alsoAlbums) {
        this.alsoAlbums = alsoAlbums;
    }

    /**
     * @return The tracks
     */
    public List<Track> getTracks() {
        return tracks;
    }

    /**
     * @param tracks The tracks
     */
    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }

    /**
     * @return The concerts
     */
    public List<Concert> getConcerts() {
        return concerts;
    }

    /**
     * @param concerts The concerts
     */
    public void setConcerts(List<Concert> concerts) {
        this.concerts = concerts;
    }

    /**
     * @return The redirected
     */
    public Boolean getRedirected() {
        return redirected;
    }

    /**
     * @param redirected The redirected
     */
    public void setRedirected(Boolean redirected) {
        this.redirected = redirected;
    }

    /**
     * @return The trackIds
     */
    public List<String> getTrackIds() {
        return trackIds;
    }

    /**
     * @param trackIds The trackIds
     */
    public void setTrackIds(List<String> trackIds) {
        this.trackIds = trackIds;
    }

    /**
     * @return The pics
     */
    public Pics getPics() {
        return pics;
    }

    /**
     * @param pics The pics
     */
    public void setPics(Pics pics) {
        this.pics = pics;
    }

    /**
     * @return The radio
     */
    public Radio getRadio() {
        return radio;
    }

    /**
     * @param radio The radio
     */
    public void setRadio(Radio radio) {
        this.radio = radio;
    }

}
