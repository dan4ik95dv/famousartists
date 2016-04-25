package com.github.dan4ik95dv.famousartists.model.yandex;

import com.github.dan4ik95dv.famousartists.model.realm.RealmString;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;


public class Cover extends RealmObject {

    @SerializedName("type")
    @Expose
    private RealmString type;
    @SerializedName("prefix")
    @Expose
    private RealmString prefix;
    @SerializedName("uri")
    @Expose
    private RealmString uri;

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
     * @return The prefix
     */
    public String getPrefix() {
        return prefix.getValue();
    }

    /**
     * @param prefix The prefix
     */
    public void setPrefix(String prefix) {
        this.prefix = new RealmString(prefix);
    }

    /**
     * @return The uri
     */
    public String getUri() {
        return uri.getValue();
    }

    /**
     * @param uri The uri
     */
    public void setUri(String uri) {
        this.uri = new RealmString(uri);
    }

}
