package com.github.dan4ik95dv.famousartists.model.yandex;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class CountsQuery {

    @SerializedName("artists")
    @Expose
    private Integer artists;
    @SerializedName("albums")
    @Expose
    private Integer albums;
    @SerializedName("tracks")
    @Expose
    private Integer tracks;
    @SerializedName("videos")
    @Expose
    private Integer videos;
    @SerializedName("playlists")
    @Expose
    private Integer playlists;

    /**
     * @return The artists
     */
    public Integer getArtists() {
        return artists;
    }

    /**
     * @param artists The artists
     */
    public void setArtists(Integer artists) {
        this.artists = artists;
    }

    /**
     * @return The albums
     */
    public Integer getAlbums() {
        return albums;
    }

    /**
     * @param albums The albums
     */
    public void setAlbums(Integer albums) {
        this.albums = albums;
    }

    /**
     * @return The tracks
     */
    public Integer getTracks() {
        return tracks;
    }

    /**
     * @param tracks The tracks
     */
    public void setTracks(Integer tracks) {
        this.tracks = tracks;
    }

    /**
     * @return The videos
     */
    public Integer getVideos() {
        return videos;
    }

    /**
     * @param videos The videos
     */
    public void setVideos(Integer videos) {
        this.videos = videos;
    }

    /**
     * @return The playlists
     */
    public Integer getPlaylists() {
        return playlists;
    }

    /**
     * @param playlists The playlists
     */
    public void setPlaylists(Integer playlists) {
        this.playlists = playlists;
    }

}
