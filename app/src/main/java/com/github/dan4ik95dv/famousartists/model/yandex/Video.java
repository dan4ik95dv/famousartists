package com.github.dan4ik95dv.famousartists.model.yandex;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Video {

    @SerializedName("cover")
    @Expose
    private String cover;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("embed")
    @Expose
    private String embed;

    /**
     * @return The cover
     */
    public String getCover() {
        return cover;
    }

    /**
     * @param cover The cover
     */
    public void setCover(String cover) {
        this.cover = cover;
    }

    /**
     * @return The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

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
     * @return The text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text The text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return The duration
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * @param duration The duration
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * @return The embed
     */
    public String getEmbed() {
        return embed;
    }

    /**
     * @param embed The embed
     */
    public void setEmbed(String embed) {
        this.embed = embed;
    }

}
