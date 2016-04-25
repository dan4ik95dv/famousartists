package com.github.dan4ik95dv.famousartists.util;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.ActionBar;

import static android.text.TextUtils.isEmpty;

/**
 * Created by Daniil Celikin on 25.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
public class Utils {
    public static void fillTitleActivity(CollapsingToolbarLayout collapsingToolbarLayout, ActionBar actionBar, String text) {
        if ((collapsingToolbarLayout != null) && (actionBar != null)) {
            if (!isEmpty(text)) {
                collapsingToolbarLayout.setTitle(text);
                actionBar.setTitle(text);
            } else {
                actionBar.setTitle("");
                collapsingToolbarLayout.setTitle("");
            }
        }
    }
}
