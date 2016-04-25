package com.github.dan4ik95dv.famousartists.model.yandex;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import io.realm.RealmList;


public class Videos  {

    @SerializedName("items")
    @Expose
    private List<Video> items;

    /**
     * @return The items
     */
    public List<Video> getItems() {
        return items;
    }

    /**
     * @param items The items
     */
    public void setItems(List<Video> items) {
        this.items = items;
    }

}
