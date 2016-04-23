package com.github.dan4ik95dv.famousartists.model.yandex.track.response;

import com.github.dan4ik95dv.famousartists.model.yandex.Artist;
import com.github.dan4ik95dv.famousartists.model.yandex.Lyric;
import com.github.dan4ik95dv.famousartists.model.yandex.OtherVersions;
import com.github.dan4ik95dv.famousartists.model.yandex.Video;
import com.github.dan4ik95dv.famousartists.model.yandex.track.Album;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class Track {

    @SerializedName("artists")
    @Expose
    private List<Artist> artists = new ArrayList<Artist>();
    @SerializedName("aliases")
    @Expose
    private List<Object> aliases = new ArrayList<Object>();
    @SerializedName("otherVersions")
    @Expose
    private OtherVersions otherVersions;
    @SerializedName("alsoInAlbums")
    @Expose
    private List<Album> alsoInAlbums = new ArrayList<Album>();
    @SerializedName("similarTracks")
    @Expose
    private List<Object> similarTracks = new ArrayList<Object>();
    @SerializedName("track")
    @Expose
    private com.github.dan4ik95dv.famousartists.model.yandex.Track track;
    @SerializedName("lyric")
    @Expose
    private List<Lyric> lyric = new ArrayList<Lyric>();
    @SerializedName("video")
    @Expose
    private List<Video> video = new ArrayList<Video>();
    @SerializedName("radioIsAvailable")
    @Expose
    private Boolean radioIsAvailable;

    /**
     * @return The artists
     */
    public List<Artist> getArtists() {
        return artists;
    }

    /**
     * @param artists The artists
     */
    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    /**
     * @return The aliases
     */
    public List<Object> getAliases() {
        return aliases;
    }

    /**
     * @param aliases The aliases
     */
    public void setAliases(List<Object> aliases) {
        this.aliases = aliases;
    }

    /**
     * @return The otherVersions
     */
    public OtherVersions getOtherVersions() {
        return otherVersions;
    }

    /**
     * @param otherVersions The otherVersions
     */
    public void setOtherVersions(OtherVersions otherVersions) {
        this.otherVersions = otherVersions;
    }

    /**
     * @return The alsoInAlbums
     */
    public List<Album> getAlsoInAlbums() {
        return alsoInAlbums;
    }

    /**
     * @param alsoInAlbums The alsoInAlbums
     */
    public void setAlsoInAlbums(List<Album> alsoInAlbums) {
        this.alsoInAlbums = alsoInAlbums;
    }

    /**
     * @return The similarTracks
     */
    public List<Object> getSimilarTracks() {
        return similarTracks;
    }

    /**
     * @param similarTracks The similarTracks
     */
    public void setSimilarTracks(List<Object> similarTracks) {
        this.similarTracks = similarTracks;
    }

    /**
     * @return The track
     */
    public com.github.dan4ik95dv.famousartists.model.yandex.Track getTrack() {
        return track;
    }

    /**
     * @param track The track
     */
    public void setTrack(com.github.dan4ik95dv.famousartists.model.yandex.Track track) {
        this.track = track;
    }

    /**
     * @return The lyric
     */
    public List<Lyric> getLyric() {
        return lyric;
    }

    /**
     * @param lyric The lyric
     */
    public void setLyric(List<Lyric> lyric) {
        this.lyric = lyric;
    }

    /**
     * @return The video
     */
    public List<Video> getVideo() {
        return video;
    }

    /**
     * @param video The video
     */
    public void setVideo(List<Video> video) {
        this.video = video;
    }

    /**
     * @return The radioIsAvailable
     */
    public Boolean getRadioIsAvailable() {
        return radioIsAvailable;
    }

    /**
     * @param radioIsAvailable The radioIsAvailable
     */
    public void setRadioIsAvailable(Boolean radioIsAvailable) {
        this.radioIsAvailable = radioIsAvailable;
    }

}
