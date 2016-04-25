package com.github.dan4ik95dv.famousartists.ui.view;

import android.widget.ImageView;


public interface PosterMvpView extends MvpView {
    void posterLoaded();

    ImageView posterImage();
}
