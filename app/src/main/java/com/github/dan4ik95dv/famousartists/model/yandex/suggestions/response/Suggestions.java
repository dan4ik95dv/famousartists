package com.github.dan4ik95dv.famousartists.model.yandex.suggestions.response;

import com.github.dan4ik95dv.famousartists.io.adapter.SuggestionsJsonAdapter;
import com.github.dan4ik95dv.famousartists.model.yandex.suggestions.Suggestion;
import com.google.gson.annotations.JsonAdapter;

import java.util.ArrayList;

/**
 * Created by Daniil Celikin on 23.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
@JsonAdapter(SuggestionsJsonAdapter.class)
public class Suggestions {
    String part;
    ArrayList<Suggestion> suggestions;
    Integer r;
    String log;
    String continuePart;

    public Suggestions() {
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public ArrayList<Suggestion> getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(ArrayList<Suggestion> suggestions) {
        this.suggestions = suggestions;
    }

    public Integer getR() {
        return r;
    }

    public void setR(Integer r) {
        this.r = r;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getContinuePart() {
        return continuePart;
    }

    public void setContinuePart(String continuePart) {
        this.continuePart = continuePart;
    }

    public String[] suggestionsToStrings() {
        String[] strings = new String[suggestions.size()];
        for (int i = 0; i < suggestions.size(); i++) {
            strings[i] = suggestions.get(i).getSuggestion();
        }
        return strings;
    }

    ;
}
