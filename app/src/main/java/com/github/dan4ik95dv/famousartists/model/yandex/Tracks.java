package com.github.dan4ik95dv.famousartists.model.yandex;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class Tracks {

    @SerializedName("items")
    @Expose
    private List<Object> items = new ArrayList<Object>();

    /**
     * @return The items
     */
    public List<Object> getItems() {
        return items;
    }

    /**
     * @param items The items
     */
    public void setItems(List<Object> items) {
        this.items = items;
    }

}
