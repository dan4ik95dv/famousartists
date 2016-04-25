package com.github.dan4ik95dv.famousartists.model.yandex;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmList;
import io.realm.RealmObject;


public class Albums extends RealmObject {

    @SerializedName("items")
    @Expose
    private RealmList<Album> items;

    /**
     * @return The items
     */
    public RealmList<Album> getItems() {
        return items;
    }

    /**
     * @param items The items
     */
    public void setItems(RealmList<Album> items) {
        this.items = items;
    }

}
