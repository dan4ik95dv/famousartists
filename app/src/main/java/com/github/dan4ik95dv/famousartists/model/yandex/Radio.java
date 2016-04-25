package com.github.dan4ik95dv.famousartists.model.yandex;

import com.github.dan4ik95dv.famousartists.model.realm.RealmBoolean;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;


public class Radio extends RealmObject {

    @SerializedName("available")
    @Expose
    private RealmBoolean available;

    /**
     * @return The available
     */
    public Boolean getAvailable() {
        return available.getValue();
    }

    /**
     * @param available The available
     */
    public void setAvailable(Boolean available) {
        this.available = new RealmBoolean(available);
    }

}
