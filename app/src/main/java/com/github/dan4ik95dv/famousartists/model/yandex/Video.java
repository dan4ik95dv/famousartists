package com.github.dan4ik95dv.famousartists.model.yandex;

import com.github.dan4ik95dv.famousartists.model.realm.RealmInteger;
import com.github.dan4ik95dv.famousartists.model.realm.RealmString;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;


public class Video extends RealmObject {

    @SerializedName("cover")
    @Expose
    private RealmString cover;
    @SerializedName("url")
    @Expose
    private RealmString url;
    @SerializedName("title")
    @Expose
    private RealmString title;
    @SerializedName("text")
    @Expose
    private RealmString text;
    @SerializedName("duration")
    @Expose
    private RealmInteger duration;
    @SerializedName("embed")
    @Expose
    private RealmString embed;

    /**
     * @return The cover
     */
    public String getCover() {
        return cover.getValue();
    }

    /**
     * @param cover The cover
     */
    public void setCover(String cover) {
        this.cover = new RealmString(cover);
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
     * @return The duration
     */
    public Integer getDuration() {
        return duration.getValue();
    }

    /**
     * @param duration The duration
     */
    public void setDuration(Integer duration) {
        this.duration = new RealmInteger(duration);
    }

    /**
     * @return The embed
     */
    public String getEmbed() {
        return embed.getValue();
    }

    /**
     * @param embed The embed
     */
    public void setEmbed(String embed) {
        this.embed = new RealmString(embed);
    }

}
