package com.github.dan4ik95dv.famousartists.model.yandex;


import com.github.dan4ik95dv.famousartists.model.realm.RealmString;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

import io.realm.RealmList;
import io.realm.RealmObject;

@Generated("org.jsonschema2pojo")
public class Event extends RealmObject {

    @SerializedName("id")
    @Expose
    private RealmString id;
    @SerializedName("type")
    @Expose
    private RealmString type;
    @SerializedName("typeForFrom")
    @Expose
    private RealmString typeForFrom;
    @SerializedName("title")
    @Expose
    private RealmList<Title> title;
    @SerializedName("promo")
    @Expose
    private Promotion promo;

    /**
     * @return The id
     */
    public String getId() {
        return id.getValue();
    }

    /**
     * @param id The id
     */
    public void setId(String id) {
        this.id = new RealmString(id);
    }

    /**
     * @return The type
     */
    public String getType() {
        return type.getValue();
    }

    /**
     * @param type The type
     */
    public void setType(String type) {
        this.type = new RealmString( type);
    }

    /**
     * @return The typeForFrom
     */
    public String getTypeForFrom() {
        return typeForFrom.getValue();
    }

    /**
     * @param typeForFrom The typeForFrom
     */
    public void setTypeForFrom(String typeForFrom) {
        this.typeForFrom = new RealmString(typeForFrom);
    }

    /**
     * @return The title
     */
    public RealmList<Title> getTitle() {
        return title;
    }

    /**
     * @param title The title
     */
    public void setTitle(RealmList<Title> title) {
        this.title = title;
    }

    /**
     * @return The promo
     */
    public Promotion getPromo() {
        return promo;
    }

    /**
     * @param promo The promo
     */
    public void setPromo(Promotion promo) {
        this.promo = promo;
    }

}