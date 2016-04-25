package com.github.dan4ik95dv.famousartists.io.adapter;

import com.github.dan4ik95dv.famousartists.model.yandex.suggestions.Suggestion;
import com.github.dan4ik95dv.famousartists.model.yandex.suggestions.response.Suggestions;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Daniil Celikin on 23.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
public class SuggestionsJsonAdapter extends TypeAdapter<Suggestions> {


    @Override
    public void write(JsonWriter out, Suggestions value) throws IOException {

    }

    @Override
    public Suggestions read(JsonReader in) throws IOException {
        Suggestions suggestions = new Suggestions();
        ArrayList<Suggestion> suggestionArrayList = new ArrayList<>();
        in.beginArray();
        suggestions.setPart(in.nextString());

        in.beginArray();
        while (in.hasNext()) {
            Suggestion suggestion = new Suggestion();
            if ((in.peek().equals(JsonToken.BEGIN_ARRAY))) {
                in.beginArray();
                suggestion.setType(in.nextString());
                suggestion.setSuggestion(in.nextString());
                String[] shortUrl = in.nextString().split("/");
                suggestion.setType(shortUrl[0]);
                suggestion.setId(Integer.valueOf(shortUrl[1]));
                in.endArray();
            } else if ((in.peek().equals(JsonToken.STRING))) {
                suggestion.setSuggestion(in.nextString());
            }
            suggestionArrayList.add(suggestion);
        }
        in.endArray();

        in.beginObject();
        while (in.hasNext()) {
            switch (in.nextName()) {
                case "continue":
                    suggestions.setContinuePart(in.nextString());
                    break;
                case "log":
                    suggestions.setLog(in.nextString());
                    break;
                case "r":
                    suggestions.setR(in.nextInt());
                    break;
            }
        }
        in.endObject();

        in.endArray();
        suggestions.setSuggestions(suggestionArrayList);

        return suggestions;
    }
}
