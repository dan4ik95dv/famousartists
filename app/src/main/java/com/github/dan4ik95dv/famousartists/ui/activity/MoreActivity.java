package com.github.dan4ik95dv.famousartists.ui.activity;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.github.dan4ik95dv.famousartists.R;
import com.github.dan4ik95dv.famousartists.constant.Client;
import com.github.dan4ik95dv.famousartists.di.component.activity.DaggerMoreComponent;
import com.github.dan4ik95dv.famousartists.di.module.activity.MoreModule;
import com.github.dan4ik95dv.famousartists.model.contest.ArtistContest;
import com.github.dan4ik95dv.famousartists.model.yandex.Artist;
import com.github.dan4ik95dv.famousartists.ui.presenter.MorePresenter;
import com.github.dan4ik95dv.famousartists.ui.view.MoreMvpView;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static android.text.TextUtils.isEmpty;
import static com.github.dan4ik95dv.famousartists.util.Utils.fillTitleActivity;

/**
 * Created by Daniil Celikin on 12.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
public class MoreActivity extends BaseActivity implements MoreMvpView {
    private static final String TAG = "MainActivity";

    @Inject
    MorePresenter presenter;

    @Bind(R.id.artistLogoImageView)
    ImageView mArtistLogoImageView;

    @Bind(R.id.artstLogoShadowView)
    View mArtistLogoShadowView;

    @Bind(R.id.toolbar)
    Toolbar mToolbar;

    @Bind(R.id.tabLayout)
    TabLayout mTabLayout;

    @Bind(R.id.collapsingToolbarLayout)
    CollapsingToolbarLayout mCollapsingToolbarLayout;

    @Bind(R.id.appBarLayout)
    AppBarLayout mAppBarLayout;

    @Bind(R.id.viewPager)
    ViewPager mViewPager;

    @Bind(R.id.coordinatorLayout)
    CoordinatorLayout mCoordinatorLayout;

    @OnClick(R.id.artistLogoImageView)
    void artistLogoClick() {
        presenter.showPoster();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);
        ButterKnife.bind(this);
        DaggerMoreComponent
                .builder()
                .moreModule(new MoreModule(this))
                .build()
                .inject(this);
        initToolbar(mToolbar);
        presenter.init();
        setupViewPager();
    }


    public void setupViewPager() {
        mViewPager.setOffscreenPageLimit(3);
        mViewPager.setAdapter(presenter.getAdapter());
        mTabLayout.setupWithViewPager(mViewPager);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == android.R.id.home)
            this.finish();
        return super.onOptionsItemSelected(menuItem);
    }

    @Override
    public void bindView(Artist artist) {
        if (artist != null) {
            fillTitleActivity(mCollapsingToolbarLayout, getSupportActionBar(), artist.getName());
            if (artist.getCover() != null) {
                String imageUrl = !isEmpty(artist.getCover().getUri()) ? artist.getCover().getUri().replaceFirst("%%", Client.SMALL_IMG) : null;
                Glide.with(this).load(imageUrl).into(mArtistLogoImageView);
            }
        }
    }

    @Override
    public void bindView(ArtistContest artistContest) {
        if (artistContest != null) {
            fillTitleActivity(mCollapsingToolbarLayout, getSupportActionBar(), artistContest.getName());
            if (artistContest.getCoverContest() != null && artistContest.getCoverContest().getSmall() != null) {
                Glide.with(this).load(artistContest.getCoverContest().getSmall()).into(mArtistLogoImageView);
            }
        }
    }
}
