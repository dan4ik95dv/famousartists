package com.github.dan4ik95dv.famousartists.model.yandex;

import com.github.dan4ik95dv.famousartists.model.realm.RealmInteger;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;


public class CountsQuery extends RealmObject {

    @SerializedName("artists")
    @Expose
    private RealmInteger artists;
    @SerializedName("albums")
    @Expose
    private RealmInteger albums;
    @SerializedName("tracks")
    @Expose
    private RealmInteger tracks;
    @SerializedName("videos")
    @Expose
    private RealmInteger videos;
    @SerializedName("playlists")
    @Expose
    private RealmInteger playlists;

    /**
     * @return The artists
     */
    public Integer getArtists() {
        return artists.getValue();
    }

    /**
     * @param artists The artists
     */
    public void setArtists(Integer artists) {
        this.artists = new RealmInteger(artists);
    }

    /**
     * @return The albums
     */
    public Integer getAlbums() {
        return albums.getValue();
    }

    /**
     * @param albums The albums
     */
    public void setAlbums(Integer albums) {
        this.albums = new RealmInteger(albums);
    }

    /**
     * @return The tracks
     */
    public Integer getTracks() {
        return tracks.getValue();
    }

    /**
     * @param tracks The tracks
     */
    public void setTracks(Integer tracks) {
        this.tracks = new RealmInteger(tracks);
    }

    /**
     * @return The videos
     */
    public Integer getVideos() {
        return videos.getValue();
    }

    /**
     * @param videos The videos
     */
    public void setVideos(Integer videos) {
        this.videos = new RealmInteger(videos);
    }

    /**
     * @return The playlists
     */
    public Integer getPlaylists() {
        return playlists.getValue();
    }

    /**
     * @param playlists The playlists
     */
    public void setPlaylists(Integer playlists) {
        this.playlists = new RealmInteger(playlists);
    }

}
