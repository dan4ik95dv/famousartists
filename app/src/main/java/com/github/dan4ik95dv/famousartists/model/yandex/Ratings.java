package com.github.dan4ik95dv.famousartists.model.yandex;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Ratings {

    @SerializedName("day")
    @Expose
    private Integer day;
    @SerializedName("month")
    @Expose
    private Integer month;
    @SerializedName("week")
    @Expose
    private Integer week;

    /**
     * @return The day
     */
    public Integer getDay() {
        return day;
    }

    /**
     * @param day The day
     */
    public void setDay(Integer day) {
        this.day = day;
    }

    /**
     * @return The month
     */
    public Integer getMonth() {
        return month;
    }

    /**
     * @param month The month
     */
    public void setMonth(Integer month) {
        this.month = month;
    }

    /**
     * @return The week
     */
    public Integer getWeek() {
        return week;
    }

    /**
     * @param week The week
     */
    public void setWeek(Integer week) {
        this.week = week;
    }

}
