package com.github.dan4ik95dv.famousartists.model.contest;

import com.github.dan4ik95dv.famousartists.model.realm.RealmInteger;
import com.github.dan4ik95dv.famousartists.model.realm.RealmString;
import com.github.dan4ik95dv.famousartists.model.realm.RealmStringListParcelConverter;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;
import org.parceler.ParcelPropertyConverter;

import io.realm.ArtistContestRealmProxy;
import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.Ignore;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Daniil Celikin on 09.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */

@Parcel(implementations = {ArtistContestRealmProxy.class}, value = Parcel.Serialization.BEAN, analyze = ArtistContest.class)
public class ArtistContest extends RealmObject {
    @PrimaryKey
    private int sId;

    @Ignore
    @SerializedName("id")
    @Expose
    private RealmInteger id;

    @SerializedName("name")
    @Expose
    private RealmString name;
    @SerializedName("genres")
    @Expose
    private RealmList<RealmString> genres;
    @SerializedName("tracks")
    @Expose
    private RealmInteger tracks;
    @SerializedName("albums")
    @Expose
    private RealmInteger albums;
    @SerializedName("description")
    @Expose
    private RealmString description;
    @SerializedName("cover")
    @Expose
    private CoverContest coverContest;

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = id.getValue();
    }

    /**
     * @return The id
     */
    public Integer getId() {
        return id.getValue();
    }

    /**
     * @param id The id
     */
    public void setId(Integer id) {
        this.sId = id;
        this.id = new RealmInteger(id);
    }

    /**
     * @return The name
     */
    public String getName() {
        return name.getValue();
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = new RealmString(name);
    }

    /**
     * @return The genres
     */
    public RealmList<RealmString> getGenres() {
        return genres;
    }

    /**
     * @param genres The genres
     */
    @ParcelPropertyConverter(RealmStringListParcelConverter.class)
    public void setGenres(RealmList<RealmString> genres) {
        this.genres = genres;
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
     * @return The description
     */
    public String getDescription() {
        return description.getValue();
    }

    /**
     * @param description The description
     */
    public void setDescription(String description) {
        this.description = new RealmString(description);
    }

    /**
     * @return The cover
     */
    public CoverContest getCoverContest() {
        return coverContest;
    }

    /**
     * @param coverContest The cover
     */
    public void setCoverContest(CoverContest coverContest) {
        this.coverContest = coverContest;
    }

}