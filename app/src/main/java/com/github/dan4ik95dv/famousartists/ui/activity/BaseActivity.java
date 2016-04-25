package com.github.dan4ik95dv.famousartists.ui.activity;

import android.content.Intent;
import android.provider.SyncStateContract;
import android.support.v7.widget.Toolbar;

import com.trello.rxlifecycle.components.support.RxAppCompatActivity;

import butterknife.ButterKnife;
import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by Daniil Celikin on 12.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */

public abstract class BaseActivity extends RxAppCompatActivity {
    private CompositeSubscription subscription = new CompositeSubscription();

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        ButterKnife.bind(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
        subscription.unsubscribe();
    }

    public void watch(Subscription sub) {
        subscription.add(sub);
    }

    public void initToolbar(Toolbar toolbar) {
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setElevation(0);
        }
    }

    public void getArtist(Integer artistId) {
        if (artistId != null) {
            Intent intent = new Intent(this, MoreActivity.class);
            intent.putExtra(com.github.dan4ik95dv.famousartists.constant.Intent.ARTIST_ID, artistId);
            startActivity(intent);
        }
    }
    public void showPoster(String posterBig) {
        Intent intent = new Intent(this, PosterActivity.class);
        intent.putExtra(com.github.dan4ik95dv.famousartists.constant.Intent.IMAGE, posterBig);
        startActivity(intent);
    }
}