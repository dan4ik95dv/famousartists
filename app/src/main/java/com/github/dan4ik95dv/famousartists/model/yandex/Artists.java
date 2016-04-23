package com.github.dan4ik95dv.famousartists.model.yandex;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class Artists {

    @SerializedName("items")
    @Expose
    private List<Item> items = new ArrayList<Item>();
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("perPage")
    @Expose
    private Integer perPage;

    /**
     * @return The items
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     * @param items The items
     */
    public void setItems(List<Item> items) {
        this.items = items;
    }

    /**
     * @return The total
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * @param total The total
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * @return The perPage
     */
    public Integer getPerPage() {
        return perPage;
    }

    /**
     * @param perPage The perPage
     */
    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

}
