package com.github.dan4ik95dv.famousartists.model.yandex.search.response;

import com.github.dan4ik95dv.famousartists.model.yandex.Albums;
import com.github.dan4ik95dv.famousartists.model.yandex.Artists;
import com.github.dan4ik95dv.famousartists.model.yandex.CountsQuery;
import com.github.dan4ik95dv.famousartists.model.yandex.Misspell;
import com.github.dan4ik95dv.famousartists.model.yandex.Pager;
import com.github.dan4ik95dv.famousartists.model.yandex.Playlists;
import com.github.dan4ik95dv.famousartists.model.yandex.Tracks;
import com.github.dan4ik95dv.famousartists.model.yandex.Videos;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class MusicSearchResponse {

    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("albums")
    @Expose
    private Albums albums;
    @SerializedName("tracks")
    @Expose
    private Tracks tracks;
    @SerializedName("artists")
    @Expose
    private Artists artists;
    @SerializedName("videos")
    @Expose
    private Videos videos;
    @SerializedName("playlists")
    @Expose
    private Playlists playlists;
    @SerializedName("misspell")
    @Expose
    private Misspell misspell;
    @SerializedName("pager")
    @Expose
    private Pager pager;
    @SerializedName("counts")
    @Expose
    private CountsQuery counts;

    /**
     * @return The text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text The text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return The albums
     */
    public Albums getAlbums() {
        return albums;
    }

    /**
     * @param albums The albums
     */
    public void setAlbums(Albums albums) {
        this.albums = albums;
    }

    /**
     * @return The tracks
     */
    public Tracks getTracks() {
        return tracks;
    }

    /**
     * @param tracks The tracks
     */
    public void setTracks(Tracks tracks) {
        this.tracks = tracks;
    }

    /**
     * @return The artists
     */
    public Artists getArtists() {
        return artists;
    }

    /**
     * @param artists The artists
     */
    public void setArtists(Artists artists) {
        this.artists = artists;
    }

    /**
     * @return The videos
     */
    public Videos getVideos() {
        return videos;
    }

    /**
     * @param videos The videos
     */
    public void setVideos(Videos videos) {
        this.videos = videos;
    }

    /**
     * @return The playlists
     */
    public Playlists getPlaylists() {
        return playlists;
    }

    /**
     * @param playlists The playlists
     */
    public void setPlaylists(Playlists playlists) {
        this.playlists = playlists;
    }

    /**
     * @return The misspell
     */
    public Misspell getMisspell() {
        return misspell;
    }

    /**
     * @param misspell The misspell
     */
    public void setMisspell(Misspell misspell) {
        this.misspell = misspell;
    }

    /**
     * @return The pager
     */
    public Pager getPager() {
        return pager;
    }

    /**
     * @param pager The pager
     */
    public void setPager(Pager pager) {
        this.pager = pager;
    }

    /**
     * @return The counts
     */
    public CountsQuery getCounts() {
        return counts;
    }

    /**
     * @param counts The counts
     */
    public void setCounts(CountsQuery counts) {
        this.counts = counts;
    }

}
