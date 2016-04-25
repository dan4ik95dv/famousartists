package com.github.dan4ik95dv.famousartists.model.yandex;

import com.github.dan4ik95dv.famousartists.model.realm.RealmString;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;


public class Link extends RealmObject {

    @SerializedName("title")
    @Expose
    private RealmString title;
    @SerializedName("href")
    @Expose
    private RealmString href;
    @SerializedName("type")
    @Expose
    private RealmString type;
    @SerializedName("socialNetwork")
    @Expose
    private RealmString socialNetwork;

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
     * @return The href
     */
    public String getHref() {
        return href.getValue();
    }

    /**
     * @param href The href
     */
    public void setHref(String href) {
        this.href = new RealmString(href);
    }

    /**
     * @return The type
     */
    public String getType() {
        return type.getValue();
    }

    /**
     * @param type The type
     */
    public void setType(String type) {
        this.type = new RealmString(type);
    }

    /**
     * @return The socialNetwork
     */
    public String getSocialNetwork() {
        return socialNetwork.getValue();
    }

    /**
     * @param socialNetwork The socialNetwork
     */
    public void setSocialNetwork(String socialNetwork) {
        this.socialNetwork = new RealmString( socialNetwork);
    }

}
