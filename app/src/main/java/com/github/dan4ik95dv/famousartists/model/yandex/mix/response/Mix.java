package com.github.dan4ik95dv.famousartists.model.yandex.mix.response;

/**
 * Created by Daniil Celikin on 24.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */

import com.github.dan4ik95dv.famousartists.model.realm.RealmBoolean;
import com.github.dan4ik95dv.famousartists.model.realm.RealmString;
import com.github.dan4ik95dv.famousartists.model.yandex.Event;
import com.github.dan4ik95dv.famousartists.model.yandex.Og;
import com.github.dan4ik95dv.famousartists.model.yandex.Promotion;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

import io.realm.RealmList;

@Generated("org.jsonschema2pojo")
public class Mix {

    @SerializedName("category")
    @Expose
    private RealmString category;
    @SerializedName("special")
    @Expose
    private RealmBoolean special;
    @SerializedName("title")
    @Expose
    private RealmString title;
    @SerializedName("titleColor")
    @Expose
    private RealmString titleColor;
    @SerializedName("featured")
    @Expose
    private RealmBoolean featured;
    @SerializedName("og")
    @Expose
    private Og og;
    @SerializedName("promotions")
    @Expose
    private RealmList<Promotion> promotions;
    @SerializedName("events")
    @Expose
    private RealmList<Event> events;

    /**
     * @return The category
     */
    public String getCategory() {
        return category.getValue();
    }

    /**
     * @param category The category
     */
    public void setCategory(String category) {
        this.category = new RealmString(category);
    }

    /**
     * @return The special
     */
    public Boolean getSpecial() {
        return special.getValue();
    }

    /**
     * @param special The special
     */
    public void setSpecial(Boolean special) {
        this.special = new RealmBoolean(special);
    }

    /**
     * @return The title
     */
    public String getTitle() {
        return title.getValue();
    }

    /**
     * @param title The title
     */
    public void setTitle(String title) {
        this.title = new RealmString(title);
    }

    /**
     * @return The titleColor
     */
    public String getTitleColor() {
        return titleColor.getValue();
    }

    /**
     * @param titleColor The titleColor
     */
    public void setTitleColor(String titleColor) {
        this.titleColor = new RealmString(titleColor);
    }

    /**
     * @return The featured
     */
    public Boolean getFeatured() {
        return featured.getValue();
    }

    /**
     * @param featured The featured
     */
    public void setFeatured(Boolean featured) {
        this.featured = new RealmBoolean(featured);
    }

    /**
     * @return The og
     */
    public Og getOg() {
        return og;
    }

    /**
     * @param og The og
     */
    public void setOg(Og og) {
        this.og = og;
    }

    /**
     * @return The promotions
     */
    public RealmList<Promotion> getPromotions() {
        return promotions;
    }

    /**
     * @param promotions The promotions
     */
    public void setPromotions(RealmList<Promotion> promotions) {
        this.promotions = promotions;
    }

    /**
     * @return The events
     */
    public RealmList<Event> getEvents() {
        return events;
    }

    /**
     * @param events The events
     */
    public void setEvents(RealmList<Event> events) {
        this.events = events;
    }

}