package com.github.dan4ik95dv.famousartists.model.yandex;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Link {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("href")
    @Expose
    private String href;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("socialNetwork")
    @Expose
    private String socialNetwork;

    /**
     * @return The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return The href
     */
    public String getHref() {
        return href;
    }

    /**
     * @param href The href
     */
    public void setHref(String href) {
        this.href = href;
    }

    /**
     * @return The type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return The socialNetwork
     */
    public String getSocialNetwork() {
        return socialNetwork;
    }

    /**
     * @param socialNetwork The socialNetwork
     */
    public void setSocialNetwork(String socialNetwork) {
        this.socialNetwork = socialNetwork;
    }

}
