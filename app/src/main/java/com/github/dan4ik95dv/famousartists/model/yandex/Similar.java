package com.github.dan4ik95dv.famousartists.model.yandex;

import com.github.dan4ik95dv.famousartists.model.realm.RealmBoolean;
import com.github.dan4ik95dv.famousartists.model.realm.RealmInteger;
import com.github.dan4ik95dv.famousartists.model.realm.RealmString;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;


public class Similar extends RealmObject {

    @PrimaryKey
    private int sId;

    @SerializedName("id")
    @Expose
    private RealmInteger id;
    @SerializedName("name")
    @Expose
    private RealmString name;
    @SerializedName("various")
    @Expose
    private RealmBoolean various;
    @SerializedName("composer")
    @Expose
    private RealmBoolean composer;
    @SerializedName("cover")
    @Expose
    private Cover cover;
    @SerializedName("genres")
    @Expose
    private RealmList<RealmString> genres;
    @SerializedName("counts")
    @Expose
    private Counts counts;
    @SerializedName("ticketsAvailable")
    @Expose
    private RealmBoolean ticketsAvailable;

    public int getsId() {
        return sId;
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
     * @return The various
     */
    public Boolean getVarious() {
        return various.getValue();
    }

    /**
     * @param various The various
     */
    public void setVarious(Boolean various) {
        this.various = new RealmBoolean(various);
    }

    /**
     * @return The composer
     */
    public Boolean getComposer() {
        return composer.getValue();
    }

    /**
     * @param composer The composer
     */
    public void setComposer(Boolean composer) {
        this.composer = new RealmBoolean(composer);
    }

    /**
     * @return The cover
     */
    public Cover getCover() {
        return cover;
    }

    /**
     * @param cover The cover
     */
    public void setCover(Cover cover) {
        this.cover = cover;
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
    public void setGenres(RealmList<RealmString> genres) {
        this.genres = genres;
    }

    /**
     * @return The counts
     */
    public Counts getCounts() {
        return counts;
    }

    /**
     * @param counts The counts
     */
    public void setCounts(Counts counts) {
        this.counts = counts;
    }

    /**
     * @return The ticketsAvailable
     */
    public Boolean getTicketsAvailable() {
        return ticketsAvailable.getValue();
    }

    /**
     * @param ticketsAvailable The ticketsAvailable
     */
    public void setTicketsAvailable(Boolean ticketsAvailable) {
        this.ticketsAvailable = new RealmBoolean(ticketsAvailable);
    }

}
