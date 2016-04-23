package com.github.dan4ik95dv.famousartists.model.yandex;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class MetroStation {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("line-color")
    @Expose
    private String lineColor;

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
     * @return The lineColor
     */
    public String getLineColor() {
        return lineColor;
    }

    /**
     * @param lineColor The line-color
     */
    public void setLineColor(String lineColor) {
        this.lineColor = lineColor;
    }

}
