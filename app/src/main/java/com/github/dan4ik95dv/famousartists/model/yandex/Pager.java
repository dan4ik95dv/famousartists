package com.github.dan4ik95dv.famousartists.model.yandex;

import com.github.dan4ik95dv.famousartists.model.realm.RealmInteger;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;


public class Pager extends RealmObject {

    @SerializedName("total")
    @Expose
    private RealmInteger total;
    @SerializedName("perPage")
    @Expose
    private RealmInteger perPage;
    @SerializedName("page")
    @Expose
    private RealmInteger page;

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

    /**
     * @return The page
     */
    public Integer getPage() {
        return page.getValue();
    }

    /**
     * @param page The page
     */
    public void setPage(Integer page) {
        this.page = new RealmInteger(page);
    }

}
