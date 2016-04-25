package com.github.dan4ik95dv.famousartists.model.yandex;

import com.github.dan4ik95dv.famousartists.model.realm.RealmString;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

@Generated("org.jsonschema2pojo")
public class Promotion extends RealmObject {

    @PrimaryKey
    private String promosId;

    @SerializedName("promoId")
    @Expose
    private RealmString promoId;
    @SerializedName("category")
    @Expose
    private RealmString category;
    @SerializedName("titleUrl")
    @Expose
    private RealmString titleUrl;
    @SerializedName("subtitleUrl")
    @Expose
    private RealmString subtitleUrl;
    @SerializedName("title")
    @Expose
    private RealmString title;
    @SerializedName("subtitle")
    @Expose
    private RealmString subtitle;
    @SerializedName("heading")
    @Expose
    private RealmString heading;
    @SerializedName("description")
    @Expose
    private RealmString description;
    @SerializedName("background")
    @Expose
    private RealmString background;
    @SerializedName("imagePosition")
    @Expose
    private RealmString imagePosition;
    @SerializedName("promotionType")
    @Expose
    private RealmString promotionType;
    @SerializedName("startDate")
    @Expose
    private RealmString startDate;
    @SerializedName("album")
    @Expose
    private Album album;

    public String getPromosId() {
        return promosId;
    }

    /**
     * @return The promoId
     */
    public String getPromoId() {
        return promoId.getValue();
    }

    /**
     * @param promoId The promoId
     */
    public void setPromoId(String promoId) {
        this.promosId = promoId;
        this.promoId = new RealmString(promoId);
    }

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
     * @return The titleUrl
     */
    public String getTitleUrl() {
        return titleUrl.getValue();
    }

    /**
     * @param titleUrl The titleUrl
     */
    public void setTitleUrl(String titleUrl) {
        this.titleUrl = new RealmString(titleUrl);
    }

    /**
     * @return The subtitleUrl
     */
    public String getSubtitleUrl() {
        return subtitleUrl.getValue();
    }

    /**
     * @param subtitleUrl The subtitleUrl
     */
    public void setSubtitleUrl(String subtitleUrl) {
        this.subtitleUrl = new RealmString(subtitleUrl);
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
     * @return The subtitle
     */
    public String getSubtitle() {
        return subtitle.getValue();
    }

    /**
     * @param subtitle The subtitle
     */
    public void setSubtitle(String subtitle) {
        this.subtitle = new RealmString(subtitle);
    }

    /**
     * @return The heading
     */
    public String getHeading() {
        return heading.getValue();
    }

    /**
     * @param heading The heading
     */
    public void setHeading(String heading) {
        this.heading = new RealmString(heading);
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
     * @return The background
     */
    public String getBackground() {
        return background.getValue();
    }

    /**
     * @param background The background
     */
    public void setBackground(String background) {
        this.background = new RealmString(background);
    }

    /**
     * @return The imagePosition
     */
    public String getImagePosition() {
        return imagePosition.getValue();
    }

    /**
     * @param imagePosition The imagePosition
     */
    public void setImagePosition(String imagePosition) {
        this.imagePosition = new RealmString(imagePosition);
    }

    /**
     * @return The promotionType
     */
    public String getPromotionType() {
        return promotionType.getValue();
    }

    /**
     * @param promotionType The promotionType
     */
    public void setPromotionType(String promotionType) {
        this.promotionType = new RealmString(promotionType);
    }

    /**
     * @return The startDate
     */
    public String getStartDate() {
        return startDate.getValue();
    }

    /**
     * @param startDate The startDate
     */
    public void setStartDate(String startDate) {
        this.startDate = new RealmString(startDate);
    }

    /**
     * @return The album
     */
    public Album getAlbum() {
        return album;
    }

    /**
     * @param album The album
     */
    public void setAlbum(Album album) {
        this.album = album;
    }

}