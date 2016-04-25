package com.github.dan4ik95dv.famousartists.io.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.dan4ik95dv.famousartists.model.yandex.suggestions.Suggestion;
import com.github.dan4ik95dv.famousartists.model.yandex.suggestions.response.Suggestions;

import java.util.ArrayList;

/**
 * Created by Daniil Celikin on 23.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */

public class SuggestionsAdapter extends BaseAdapter {

    private ArrayList<Suggestion> data;
    private Drawable suggestionIcon;
    private LayoutInflater inflater;
    private boolean ellipsize;


    public SuggestionsAdapter(Context context, ArrayList<Suggestion> suggestions) {
        inflater = LayoutInflater.from(context);
        data = suggestions;
    }

    public SuggestionsAdapter(Context context, ArrayList<Suggestion> suggestions, Drawable suggestionIcon, boolean ellipsize) {
        inflater = LayoutInflater.from(context);
        this.data = suggestions;
        this.suggestionIcon = suggestionIcon;
        this.ellipsize = ellipsize;
    }

    public void setSuggestions(Suggestions suggestions) {
        data.clear();
        data.addAll(suggestions.getSuggestions());
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Suggestion getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        SuggestionsViewHolder viewHolder;

        if (convertView == null) {
            convertView = inflater.inflate(com.miguelcatalan.materialsearchview.R.layout.suggest_item, parent, false);
            viewHolder = new SuggestionsViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (SuggestionsViewHolder) convertView.getTag();
        }

        Suggestion currentListData = getItem(position);

        viewHolder.textView.setText(currentListData.getSuggestion());
        if (ellipsize) {
            viewHolder.textView.setSingleLine();
            viewHolder.textView.setEllipsize(TextUtils.TruncateAt.END);
        }

        return convertView;
    }

    private class SuggestionsViewHolder {

        TextView textView;
        ImageView imageView;

        public SuggestionsViewHolder(View convertView) {
            textView = (TextView) convertView.findViewById(com.miguelcatalan.materialsearchview.R.id.suggestion_text);
            if (suggestionIcon != null) {
                imageView = (ImageView) convertView.findViewById(com.miguelcatalan.materialsearchview.R.id.suggestion_icon);
                imageView.setImageDrawable(suggestionIcon);
            }
        }
    }
}