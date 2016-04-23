package com.github.dan4ik95dv.famousartists.model.yandex;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Radio {

    @SerializedName("available")
    @Expose
    private Boolean available;

    /**
     * @return The available
     */
    public Boolean getAvailable() {
        return available;
    }

    /**
     * @param available The available
     */
    public void setAvailable(Boolean available) {
        this.available = available;
    }

}
