package com.github.dan4ik95dv.famousartists.model.yandex;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class Item {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("various")
    @Expose
    private Boolean various;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("cover")
    @Expose
    private Cover cover;
    @SerializedName("composer")
    @Expose
    private Boolean composer;
    @SerializedName("counts")
    @Expose
    private Counts counts;
    @SerializedName("genres")
    @Expose
    private List<String> genres = new ArrayList<String>();
    @SerializedName("ticketsAvailable")
    @Expose
    private Boolean ticketsAvailable;
    @SerializedName("popularTracks")
    @Expose
    private List<PopularTrack> popularTracks = new ArrayList<PopularTrack>();
    @SerializedName("regions")
    @Expose
    private List<String> regions = new ArrayList<String>();

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

    /**
     * @return The popularTracks
     */
    public List<PopularTrack> getPopularTracks() {
        return popularTracks;
    }

    /**
     * @param popularTracks The popularTracks
     */
    public void setPopularTracks(List<PopularTrack> popularTracks) {
        this.popularTracks = popularTracks;
    }

    /**
     * @return The regions
     */
    public List<String> getRegions() {
        return regions;
    }

    /**
     * @param regions The regions
     */
    public void setRegions(List<String> regions) {
        this.regions = regions;
    }

}
