package com.github.dan4ik95dv.famousartists.model.yandex.artist.response;

import com.github.dan4ik95dv.famousartists.model.realm.RealmBoolean;
import com.github.dan4ik95dv.famousartists.model.realm.RealmString;
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

import io.realm.RealmList;


public class ArtistResponse {

    @SerializedName("artist")
    @Expose
    private com.github.dan4ik95dv.famousartists.model.yandex.Artist artist;
    @SerializedName("similar")
    @Expose
    private RealmList<Similar> similar;
    @SerializedName("albums")
    @Expose
    private RealmList<Album> albums;
    @SerializedName("alsoAlbums")
    @Expose
    private RealmList<Album> alsoAlbums;
    @SerializedName("tracks")
    @Expose
    private RealmList<Track> tracks;
    @SerializedName("concerts")
    @Expose
    private RealmList<Concert> concerts;
    @SerializedName("redirected")
    @Expose
    private RealmBoolean redirected;
    @SerializedName("trackIds")
    @Expose
    private RealmList<RealmString> trackIds;
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
    public RealmList<Similar> getSimilar() {
        return similar;
    }

    /**
     * @param similar The similar
     */
    public void setSimilar(RealmList<Similar> similar) {
        this.similar = similar;
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
     * @return The alsoAlbums
     */
    public RealmList<Album> getAlsoAlbums() {
        return alsoAlbums;
    }

    /**
     * @param alsoAlbums The alsoAlbums
     */
    public void setAlsoAlbums(RealmList<Album> alsoAlbums) {
        this.alsoAlbums = alsoAlbums;
    }

    /**
     * @return The tracks
     */
    public RealmList<Track> getTracks() {
        return tracks;
    }

    /**
     * @param tracks The tracks
     */
    public void setTracks(RealmList<Track> tracks) {
        this.tracks = tracks;
    }

    /**
     * @return The concerts
     */
    public RealmList<Concert> getConcerts() {
        return concerts;
    }

    /**
     * @param concerts The concerts
     */
    public void setConcerts(RealmList<Concert> concerts) {
        this.concerts = concerts;
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

    /**
     * @return The trackIds
     */
    public RealmList<RealmString> getTrackIds() {
        return trackIds;
    }

    /**
     * @param trackIds The trackIds
     */
    public void setTrackIds(RealmList<RealmString> trackIds) {
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
