package com.github.dan4ik95dv.famousartists.model.yandex;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class Artist {

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
    private Cover cover;
    @SerializedName("genres")
    @Expose
    private List<String> genres = new ArrayList<String>();
    @SerializedName("counts")
    @Expose
    private Counts counts;
    @SerializedName("available")
    @Expose
    private Boolean available;
    @SerializedName("ratings")
    @Expose
    private Ratings ratings;
    @SerializedName("links")
    @Expose
    private List<Link> links = new ArrayList<Link>();
    @SerializedName("likesCount")
    @Expose
    private Integer likesCount;
    @SerializedName("likesCounter")
    @Expose
    private Integer likesCounter;
    @SerializedName("description")
    @Expose
    private Description description;
    @SerializedName("countries")
    @Expose
    private List<String> countries = new ArrayList<String>();
    @SerializedName("initDate")
    @Expose
    private String initDate;
    @SerializedName("enWikipediaLink")
    @Expose
    private String enWikipediaLink;
    @SerializedName("dbAliases")
    @Expose
    private List<String> dbAliases = new ArrayList<String>();
    @SerializedName("ticketsAvailable")
    @Expose
    private Boolean ticketsAvailable;
    @SerializedName("allCovers")
    @Expose
    private List<Cover> allCovers = new ArrayList<Cover>();

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
     * @return The available
     */
    public Boolean getAvailable() {
        return available;
    }

    /**
     * @param available The available
     */
    public void setAvailable(Boolean available) {
        this.available = available;
    }

    /**
     * @return The ratings
     */
    public Ratings getRatings() {
        return ratings;
    }

    /**
     * @param ratings The ratings
     */
    public void setRatings(Ratings ratings) {
        this.ratings = ratings;
    }

    /**
     * @return The links
     */
    public List<Link> getLinks() {
        return links;
    }

    /**
     * @param links The links
     */
    public void setLinks(List<Link> links) {
        this.links = links;
    }

    /**
     * @return The likesCount
     */
    public Integer getLikesCount() {
        return likesCount;
    }

    /**
     * @param likesCount The likesCount
     */
    public void setLikesCount(Integer likesCount) {
        this.likesCount = likesCount;
    }

    /**
     * @return The likesCounter
     */
    public Integer getLikesCounter() {
        return likesCounter;
    }

    /**
     * @param likesCounter The likesCounter
     */
    public void setLikesCounter(Integer likesCounter) {
        this.likesCounter = likesCounter;
    }

    /**
     * @return The description
     */
    public Description getDescription() {
        return description;
    }

    /**
     * @param description The description
     */
    public void setDescription(Description description) {
        this.description = description;
    }

    /**
     * @return The countries
     */
    public List<String> getCountries() {
        return countries;
    }

    /**
     * @param countries The countries
     */
    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    /**
     * @return The initDate
     */
    public String getInitDate() {
        return initDate;
    }

    /**
     * @param initDate The initDate
     */
    public void setInitDate(String initDate) {
        this.initDate = initDate;
    }

    /**
     * @return The enWikipediaLink
     */
    public String getEnWikipediaLink() {
        return enWikipediaLink;
    }

    /**
     * @param enWikipediaLink The enWikipediaLink
     */
    public void setEnWikipediaLink(String enWikipediaLink) {
        this.enWikipediaLink = enWikipediaLink;
    }

    /**
     * @return The dbAliases
     */
    public List<String> getDbAliases() {
        return dbAliases;
    }

    /**
     * @param dbAliases The dbAliases
     */
    public void setDbAliases(List<String> dbAliases) {
        this.dbAliases = dbAliases;
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
     * @return The allCovers
     */
    public List<Cover> getAllCovers() {
        return allCovers;
    }

    /**
     * @param allCovers The allCovers
     */
    public void setAllCovers(List<Cover> allCovers) {
        this.allCovers = allCovers;
    }

}
