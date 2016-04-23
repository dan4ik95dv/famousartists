package com.github.dan4ik95dv.famousartists.model.yandex;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class Pics {

    @SerializedName("query")
    @Expose
    private String query;
    @SerializedName("items")
    @Expose
    private List<com.github.dan4ik95dv.famousartists.model.yandex.artist.Item> items = new ArrayList<com.github.dan4ik95dv.famousartists.model.yandex.artist.Item>();

    /**
     * @return The query
     */
    public String getQuery() {
        return query;
    }

    /**
     * @param query The query
     */
    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * @return The items
     */
    public List<com.github.dan4ik95dv.famousartists.model.yandex.artist.Item> getItems() {
        return items;
    }

    /**
     * @param items The items
     */
    public void setItems(List<com.github.dan4ik95dv.famousartists.model.yandex.artist.Item> items) {
        this.items = items;
    }

}
