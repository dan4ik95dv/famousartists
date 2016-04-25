package com.github.dan4ik95dv.famousartists.model.yandex;

import com.github.dan4ik95dv.famousartists.model.realm.RealmBoolean;
import com.github.dan4ik95dv.famousartists.model.realm.RealmInteger;
import com.github.dan4ik95dv.famousartists.model.realm.RealmString;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmList;
import io.realm.RealmObject;


public class Artist extends RealmObject {

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
    @SerializedName("available")
    @Expose
    private RealmBoolean available;
    @SerializedName("ratings")
    @Expose
    private Ratings ratings;
    @SerializedName("links")
    @Expose
    private RealmList<Link> links;
    @SerializedName("likesCount")
    @Expose
    private RealmInteger likesCount;
    @SerializedName("likesCounter")
    @Expose
    private RealmInteger likesCounter;
    @SerializedName("description")
    @Expose
    private Description description;
    @SerializedName("countries")
    @Expose
    private RealmList<RealmString> countries;
    @SerializedName("initDate")
    @Expose
    private RealmString initDate;
    @SerializedName("enWikipediaLink")
    @Expose
    private RealmString enWikipediaLink;
    @SerializedName("dbAliases")
    @Expose
    private RealmList<RealmString> dbAliases;
    @SerializedName("ticketsAvailable")
    @Expose
    private RealmBoolean ticketsAvailable;
    @SerializedName("allCovers")
    @Expose
    private RealmList<Cover> allCovers;

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
     * @return The available
     */
    public Boolean getAvailable() {
        return available.getValue();
    }

    /**
     * @param available The available
     */
    public void setAvailable(Boolean available) {
        this.available = new RealmBoolean(available);
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
    public RealmList<Link> getLinks() {
        return links;
    }

    /**
     * @param links The links
     */
    public void setLinks(RealmList<Link> links) {
        this.links = links;
    }

    /**
     * @return The likesCount
     */
    public Integer getLikesCount() {
        return likesCount.getValue();
    }

    /**
     * @param likesCount The likesCount
     */
    public void setLikesCount(Integer likesCount) {
        this.likesCount = new RealmInteger(likesCount);
    }

    /**
     * @return The likesCounter
     */
    public Integer getLikesCounter() {
        return likesCounter.getValue();
    }

    /**
     * @param likesCounter The likesCounter
     */
    public void setLikesCounter(Integer likesCounter) {
        this.likesCounter = new RealmInteger(likesCounter);
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
    public RealmList<RealmString> getCountries() {
        return countries;
    }

    /**
     * @param countries The countries
     */
    public void setCountries(RealmList<RealmString> countries) {
        this.countries = countries;
    }

    /**
     * @return The initDate
     */
    public String getInitDate() {
        return initDate.getValue();
    }

    /**
     * @param initDate The initDate
     */
    public void setInitDate(String initDate) {
        this.initDate = new RealmString( initDate);
    }

    /**
     * @return The enWikipediaLink
     */
    public String getEnWikipediaLink() {
        return enWikipediaLink.getValue();
    }

    /**
     * @param enWikipediaLink The enWikipediaLink
     */
    public void setEnWikipediaLink(String enWikipediaLink) {
        this.enWikipediaLink = new RealmString(enWikipediaLink);
    }

    /**
     * @return The dbAliases
     */
    public RealmList<RealmString> getDbAliases() {
        return dbAliases;
    }

    /**
     * @param dbAliases The dbAliases
     */
    public void setDbAliases(RealmList<RealmString> dbAliases) {
        this.dbAliases = dbAliases;
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

    /**
     * @return The allCovers
     */
    public RealmList<Cover> getAllCovers() {
        return allCovers;
    }

    /**
     * @param allCovers The allCovers
     */
    public void setAllCovers(RealmList<Cover> allCovers) {
        this.allCovers = allCovers;
    }

}
