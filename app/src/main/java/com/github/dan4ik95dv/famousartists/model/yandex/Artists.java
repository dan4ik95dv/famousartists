package com.github.dan4ik95dv.famousartists.model.yandex;

import com.github.dan4ik95dv.famousartists.model.realm.RealmInteger;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmList;
import io.realm.RealmObject;


public class Artists extends RealmObject {

    @SerializedName("items")
    @Expose
    private RealmList<Item> items;
    @SerializedName("total")
    @Expose
    private RealmInteger total;
    @SerializedName("perPage")
    @Expose
    private RealmInteger perPage;

    /**
     * @return The items
     */
    public RealmList<Item> getItems() {
        return items;
    }

    /**
     * @param items The items
     */
    public void setItems(RealmList<Item> items) {
        this.items = items;
    }

    /**
     * @return The total
     */
    public Integer getTotal() {
        return total.getValue();
    }

    /**
     * @param total The total
     */
    public void setTotal(Integer total) {
        this.total = new RealmInteger(total);
    }

    /**
     * @return The perPage
     */
    public Integer getPerPage() {
        return perPage.getValue();
    }

    /**
     * @param perPage The perPage
     */
    public void setPerPage(Integer perPage) {
        this.perPage = new RealmInteger(perPage);
    }

}
