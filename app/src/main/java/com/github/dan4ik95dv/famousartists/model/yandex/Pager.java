package com.github.dan4ik95dv.famousartists.model.yandex;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Pager {

    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("perPage")
    @Expose
    private Integer perPage;
    @SerializedName("page")
    @Expose
    private Integer page;

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

    /**
     * @return The page
     */
    public Integer getPage() {
        return page;
    }

    /**
     * @param page The page
     */
    public void setPage(Integer page) {
        this.page = page;
    }

}
