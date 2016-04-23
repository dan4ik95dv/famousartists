package com.github.dan4ik95dv.famousartists.model.yandex;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class OtherVersions {

    @SerializedName("remix")
    @Expose
    private List<Object> remix = new ArrayList<Object>();
    @SerializedName("live")
    @Expose
    private List<Object> live = new ArrayList<Object>();
    @SerializedName("instrumental")
    @Expose
    private List<Object> instrumental = new ArrayList<Object>();
    @SerializedName("another")
    @Expose
    private List<Object> another = new ArrayList<Object>();

    /**
     * @return The remix
     */
    public List<Object> getRemix() {
        return remix;
    }

    /**
     * @param remix The remix
     */
    public void setRemix(List<Object> remix) {
        this.remix = remix;
    }

    /**
     * @return The live
     */
    public List<Object> getLive() {
        return live;
    }

    /**
     * @param live The live
     */
    public void setLive(List<Object> live) {
        this.live = live;
    }

    /**
     * @return The instrumental
     */
    public List<Object> getInstrumental() {
        return instrumental;
    }

    /**
     * @param instrumental The instrumental
     */
    public void setInstrumental(List<Object> instrumental) {
        this.instrumental = instrumental;
    }

    /**
     * @return The another
     */
    public List<Object> getAnother() {
        return another;
    }

    /**
     * @param another The another
     */
    public void setAnother(List<Object> another) {
        this.another = another;
    }

}
