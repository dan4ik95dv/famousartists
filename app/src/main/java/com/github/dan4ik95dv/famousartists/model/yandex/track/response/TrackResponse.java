package com.github.dan4ik95dv.famousartists.model.yandex.track.response;

import com.github.dan4ik95dv.famousartists.model.realm.RealmBoolean;
import com.github.dan4ik95dv.famousartists.model.realm.RealmString;
import com.github.dan4ik95dv.famousartists.model.yandex.Album;
import com.github.dan4ik95dv.famousartists.model.yandex.Artist;
import com.github.dan4ik95dv.famousartists.model.yandex.Lyric;
import com.github.dan4ik95dv.famousartists.model.yandex.Video;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import io.realm.RealmList;
import io.realm.RealmObject;


public class TrackResponse extends RealmObject {

    @SerializedName("artists")
    @Expose
    private RealmList<Artist> artists;
    @SerializedName("aliases")
    @Expose
    private RealmList<RealmString> aliases;

    @SerializedName("alsoInAlbums")
    @Expose
    private RealmList<Album> alsoInAlbums;
    @SerializedName("similarTracks")
    @Expose
    private RealmList<com.github.dan4ik95dv.famousartists.model.yandex.Track> similarTracks;
    @SerializedName("track")
    @Expose
    private com.github.dan4ik95dv.famousartists.model.yandex.Track track;
    @SerializedName("lyric")
    @Expose
    private RealmList<Lyric> lyric;
    @SerializedName("video")
    @Expose
    private RealmList<Video> video;
    @SerializedName("radioIsAvailable")
    @Expose
    private RealmBoolean radioIsAvailable;

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
     * @return The aliases
     */
    public RealmList<RealmString> getAliases() {
        return aliases;
    }

    /**
     * @param aliases The aliases
     */
    public void setAliases(RealmList<RealmString> aliases) {
        this.aliases = aliases;
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
    public void setAlsoInAlbums(RealmList<Album> alsoInAlbums) {
        this.alsoInAlbums = alsoInAlbums;
    }

    /**
     * @return The similarTracks
     */
    public RealmList<com.github.dan4ik95dv.famousartists.model.yandex.Track> getSimilarTracks() {
        return similarTracks;
    }

    /**
     * @param similarTracks The similarTracks
     */
    public void setSimilarTracks(RealmList<com.github.dan4ik95dv.famousartists.model.yandex.Track> similarTracks) {
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
    public RealmList<Lyric> getLyric() {
        return lyric;
    }

    /**
     * @param lyric The lyric
     */
    public void setLyric(RealmList<Lyric> lyric) {
        this.lyric = lyric;
    }

    /**
     * @return The video
     */
    public RealmList<Video> getVideo() {
        return video;
    }

    /**
     * @param video The video
     */
    public void setVideo(RealmList<Video> video) {
        this.video = video;
    }

    /**
     * @return The radioIsAvailable
     */
    public Boolean getRadioIsAvailable() {
        return radioIsAvailable.getValue();
    }

    /**
     * @param radioIsAvailable The radioIsAvailable
     */
    public void setRadioIsAvailable(Boolean radioIsAvailable) {
        this.radioIsAvailable = new RealmBoolean(radioIsAvailable);
    }

}
