package com.github.dan4ik95dv.famousartists.model.yandex;

import com.github.dan4ik95dv.famousartists.model.yandex.artist.Counts;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class Similar {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("various")
    @Expose
    private Boolean various;
    @SerializedName("composer")
    @Expose
    private Boolean composer;
    @SerializedName("cover")
    @Expose
    private com.github.dan4ik95dv.famousartists.model.yandex.artist.Cover cover;
    @SerializedName("genres")
    @Expose
    private List<String> genres = new ArrayList<String>();
    @SerializedName("counts")
    @Expose
    private com.github.dan4ik95dv.famousartists.model.yandex.artist.Counts counts;
    @SerializedName("ticketsAvailable")
    @Expose
    private Boolean ticketsAvailable;

    /**
     * @return The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The various
     */
    public Boolean getVarious() {
        return various;
    }

    /**
     * @param various The various
     */
    public void setVarious(Boolean various) {
        this.various = various;
    }

    /**
     * @return The composer
     */
    public Boolean getComposer() {
        return composer;
    }

    /**
     * @param composer The composer
     */
    public void setComposer(Boolean composer) {
        this.composer = composer;
    }

    /**
     * @return The cover
     */
    public com.github.dan4ik95dv.famousartists.model.yandex.artist.Cover getCover() {
        return cover;
    }

    /**
     * @param cover The cover
     */
    public void setCover(com.github.dan4ik95dv.famousartists.model.yandex.artist.Cover cover) {
        this.cover = cover;
    }

    /**
     * @return The genres
     */
    public List<String> getGenres() {
        return genres;
    }

    /**
     * @param genres The genres
     */
    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    /**
     * @return The counts
     */
    public com.github.dan4ik95dv.famousartists.model.yandex.artist.Counts getCounts() {
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
        return ticketsAvailable;
    }

    /**
     * @param ticketsAvailable The ticketsAvailable
     */
    public void setTicketsAvailable(Boolean ticketsAvailable) {
        this.ticketsAvailable = ticketsAvailable;
    }

}
