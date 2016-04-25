package com.github.dan4ik95dv.famousartists.model.yandex;

import com.github.dan4ik95dv.famousartists.model.realm.RealmInteger;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;


public class Ratings extends RealmObject {

    @SerializedName("day")
    @Expose
    private RealmInteger day;
    @SerializedName("month")
    @Expose
    private RealmInteger month;
    @SerializedName("week")
    @Expose
    private RealmInteger week;

    /**
     * @return The day
     */
    public Integer getDay() {
        return day.getValue();
    }

    /**
     * @param day The day
     */
    public void setDay(Integer day) {
        this.day = new RealmInteger(day);
    }

    /**
     * @return The month
     */
    public Integer getMonth() {
        return month.getValue();
    }

    /**
     * @param month The month
     */
    public void setMonth(Integer month) {
        this.month = new RealmInteger(month);
    }

    /**
     * @return The week
     */
    public Integer getWeek() {
        return week.getValue();
    }

    /**
     * @param week The week
     */
    public void setWeek(Integer week) {
        this.week = new RealmInteger(week);
    }

}
