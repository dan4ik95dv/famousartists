package com.github.dan4ik95dv.famousartists.model.yandex;

import com.github.dan4ik95dv.famousartists.model.realm.RealmString;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;


public class MetroStation extends RealmObject {

    @SerializedName("title")
    @Expose
    private RealmString title;
    @SerializedName("line-color")
    @Expose
    private RealmString lineColor;

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
     * @return The lineColor
     */
    public String getLineColor() {
        return lineColor.getValue();
    }

    /**
     * @param lineColor The line-color
     */
    public void setLineColor(String lineColor) {
        this.lineColor =  new RealmString(lineColor);
    }

}
