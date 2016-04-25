package com.github.dan4ik95dv.famousartists.ui.activity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.github.dan4ik95dv.famousartists.R;
import com.github.dan4ik95dv.famousartists.di.component.activity.DaggerPosterComponent;
import com.github.dan4ik95dv.famousartists.di.module.activity.PosterModule;
import com.github.dan4ik95dv.famousartists.ui.presenter.PosterPresenter;
import com.github.dan4ik95dv.famousartists.ui.view.PosterMvpView;

import javax.inject.Inject;

import butterknife.Bind;
import uk.co.senab.photoview.PhotoViewAttacher;


public class PosterActivity extends BaseActivity implements PosterMvpView {

    @Inject
    PosterPresenter presenter;

    @Bind(R.id.poster_photo)
    ImageView mPosterPhoto;

    @Bind(R.id.progress_bar)
    ProgressBar mProgressBar;

    private PhotoViewAttacher mAttacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DaggerPosterComponent.builder().posterModule(new PosterModule(this)).build().inject(this);
        setContentView(R.layout.activity_poster);
        initToolbar();
        initAttacher();
        presenter.init();
    }

    private void initAttacher() {
        mAttacher = new PhotoViewAttacher(mPosterPhoto);
        mAttacher.setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    private void initToolbar() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        mAttacher.cleanup();
        presenter.detachView();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(menuItem);
    }

    @Override
    public void posterLoaded() {
        mProgressBar.setVisibility(View.GONE);
    }

    @Override
    public ImageView posterImage() {
        return mPosterPhoto;
    }
}