package com.github.dan4ik95dv.famousartists.model.yandex.suggestions;

/**
 * Created by Daniil Celikin on 23.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
public class Suggestion {
    String type;
    String suggestion;
    Integer id;

    public Suggestion() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
