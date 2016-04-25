package com.github.dan4ik95dv.famousartists.model.yandex;

import com.github.dan4ik95dv.famousartists.model.realm.RealmString;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

import io.realm.RealmObject;

@Generated("org.jsonschema2pojo")
public class Title extends RealmObject {

    @SerializedName("type")
    @Expose
    private RealmString type;
    @SerializedName("text")
    @Expose
    private RealmString text;

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
}