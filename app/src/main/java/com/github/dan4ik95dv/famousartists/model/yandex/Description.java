package com.github.dan4ik95dv.famousartists.model.yandex;

import com.github.dan4ik95dv.famousartists.model.realm.RealmString;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;


public class Description extends RealmObject {

    @SerializedName("text")
    @Expose
    private RealmString text;
    @SerializedName("url")
    @Expose
    private RealmString url;

    /**
     * @return The text
     */
    public String getText() {
        return text.getValue();
    }

    /**
     * @param text The text
     */
    public void setText(String text) {
        this.text = new RealmString(text);
    }

    /**
     * @return The url
     */
    public String getUrl() {
        return url.getValue();
    }

    /**
     * @param url The url
     */
    public void setUrl(String url) {
        this.url = new RealmString(url);
    }

}
