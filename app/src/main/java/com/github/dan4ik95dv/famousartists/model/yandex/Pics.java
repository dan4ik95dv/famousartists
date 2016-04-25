package com.github.dan4ik95dv.famousartists.model.yandex;

import com.github.dan4ik95dv.famousartists.model.realm.RealmString;
import com.github.dan4ik95dv.famousartists.model.yandex.artist.ItemArtist;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmList;
import io.realm.RealmObject;


public class Pics extends RealmObject {

    @SerializedName("query")
    @Expose
    private RealmString query;
    @SerializedName("items")
    @Expose
    private RealmList<ItemArtist> itemArtists;

    /**
     * @return The query
     */
    public String getQuery() {
        return query.getValue();
    }

    /**
     * @param query The query
     */
    public void setQuery(String query) {
        this.query = new RealmString(query);
    }

    /**
     * @return The items
     */
    public RealmList<ItemArtist> getItemArtists() {
        return itemArtists;
    }

    /**
     * @param itemArtists The items
     */
    public void setItemArtists(RealmList<ItemArtist> itemArtists) {
        this.itemArtists = itemArtists;
    }

}
