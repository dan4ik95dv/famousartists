package com.github.dan4ik95dv.famousartists.model.yandex;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import io.realm.RealmList;
import io.realm.RealmObject;


public class Tracks {

    @SerializedName("items")
    @Expose
    private List<Track> items;

    /**
     * @return The items
     */
    public List<Track> getItems() {
        return items;
    }

    /**
     * @param items The items
     */
    public void setItems(List<Track> items) {
        this.items = items;
    }

}
