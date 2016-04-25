package com.github.dan4ik95dv.famousartists.model.yandex;

import com.github.dan4ik95dv.famousartists.model.realm.RealmInteger;
import com.github.dan4ik95dv.famousartists.model.realm.RealmString;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;


public class Label extends RealmObject {

    @PrimaryKey
    private Integer sId;

    @SerializedName("id")
    @Expose
    private RealmInteger id;
    @SerializedName("name")
    @Expose
    private RealmString name;

    public Integer getsId() {
        return sId;
    }

    /**
     * @return The id
     */
    public Integer getId() {
        return id.getValue();
    }

    /**
     * @param id The id
     */
    public void setId(Integer id) {
        this.sId = id;
        this.id = new RealmInteger(id);
    }

    /**
     * @return The name
     */
    public String getName() {
        return name.getValue();
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = new RealmString(name);
    }

}
