package com.github.dan4ik95dv.famousartists.model.yandex;


import com.github.dan4ik95dv.famousartists.model.realm.RealmString;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

import io.realm.RealmObject;

@Generated("org.jsonschema2pojo")
public class Og extends RealmObject {

    @SerializedName("title")
    @Expose
    private RealmString title;
    @SerializedName("description")
    @Expose
    private RealmString description;

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

}