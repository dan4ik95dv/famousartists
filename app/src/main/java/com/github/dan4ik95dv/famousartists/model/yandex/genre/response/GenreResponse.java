package com.github.dan4ik95dv.famousartists.model.yandex.genre.response;

import com.github.dan4ik95dv.famousartists.model.realm.RealmString;
import com.github.dan4ik95dv.famousartists.model.yandex.Album;
import com.github.dan4ik95dv.famousartists.model.yandex.Artist;
import com.github.dan4ik95dv.famousartists.model.yandex.Promotion;
import com.github.dan4ik95dv.famousartists.model.yandex.Radio;
import com.github.dan4ik95dv.famousartists.model.yandex.Track;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import io.realm.RealmList;

@Generated("org.jsonschema2pojo")
public class GenreResponse {

    @SerializedName("promotions")
    @Expose
    private RealmList<Promotion> promotions;
    @SerializedName("albums")
    @Expose
    private RealmList<Album> albums;
    @SerializedName("artists")
    @Expose
    private RealmList<Artist> artists;
    @SerializedName("tracks")
    @Expose
    private RealmList<Track> tracks;
    @SerializedName("genre")
    @Expose
    private RealmString genre;
    @SerializedName("radio")
    @Expose
    private Radio radio;
    @SerializedName("filter")
    @Expose
    private RealmString filter;
    @SerializedName("pics")
    @Expose
    private List<String> pics = new ArrayList<String>();

    /**
     * @return The promotions
     */
    public RealmList<Promotion> getPromotions() {
        return promotions;
    }

    /**
     * @param promotions The promotions
     */
    public void setPromotions(RealmList<Promotion> promotions) {
        this.promotions = promotions;
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

    /**
     * @return The filter
     */
    public String getFilter() {
        return filter.getValue();
    }

    /**
     * @param filter The filter
     */
    public void setFilter(String filter) {
        this.filter = new RealmString(filter);
    }

    /**
     * @return The pics
     */
    public List<String> getPics() {
        return pics;
    }

    /**
     * @param pics The pics
     */
    public void setPics(List<String> pics) {
        this.pics = pics;
    }

}