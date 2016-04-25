package com.github.dan4ik95dv.famousartists.ui.presenter;

import android.content.Context;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.github.dan4ik95dv.famousartists.app.App;
import com.github.dan4ik95dv.famousartists.constant.Intent;
import com.github.dan4ik95dv.famousartists.ui.activity.PosterActivity;
import com.github.dan4ik95dv.famousartists.ui.view.PosterMvpView;

public class PosterPresenter implements Presenter<PosterMvpView> {


    private PosterMvpView posterMvpView;
    private PosterActivity posterActivity;
    private Context context;


    public PosterPresenter(Context context) {
        this.context = context;
        this.posterActivity = (PosterActivity) context;

        App.getInstance().getApplicationComponent().inject(this);
        attachView((PosterMvpView) context);
    }

    @Override
    public void attachView(PosterMvpView view) {
        this.posterMvpView = view;
    }

    @Override
    public void detachView() {
        this.posterMvpView = null;
    }

    public void init() {
        if (posterActivity.getIntent() != null) {
            String url = posterActivity.getIntent().getStringExtra(Intent.IMAGE);
            Glide.with(context).load(url != null ? url : "")
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .listener(imageLoadingListener)
                    .into(posterMvpView.posterImage());
        }
    }

    RequestListener<String, GlideDrawable> imageLoadingListener = new RequestListener<String, GlideDrawable>() {
        @Override
        public boolean onException(Exception e, String model, Target<GlideDrawable> target, boolean isFirstResource) {
            return false;
        }

        @Override
        public boolean onResourceReady(GlideDrawable resource, String model, Target<GlideDrawable> target, boolean isFromMemoryCache, boolean isFirstResource) {
            posterMvpView.posterLoaded();
            return false;
        }
    };

}
