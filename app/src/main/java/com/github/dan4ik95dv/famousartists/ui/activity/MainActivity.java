package com.github.dan4ik95dv.famousartists.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.support.annotation.IdRes;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.github.dan4ik95dv.famousartists.R;
import com.github.dan4ik95dv.famousartists.di.component.activity.DaggerMainComponent;
import com.github.dan4ik95dv.famousartists.di.module.activity.MainModule;
import com.github.dan4ik95dv.famousartists.ui.adapter.MainPagerAdapter;
import com.github.dan4ik95dv.famousartists.ui.presenter.MainPresenter;
import com.github.dan4ik95dv.famousartists.ui.view.MainMvpView;
import com.github.dan4ik95dv.famousartists.ui.widget.FragmentViewPager;
import com.miguelcatalan.materialsearchview.MaterialSearchView;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabClickListener;

import java.util.ArrayList;

import javax.inject.Inject;

import butterknife.Bind;

/**
 * Created by Daniil Celikin on 12.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
public class MainActivity extends BaseActivity implements MainMvpView {
    private static final String TAG = "MainActivity";
    @Inject
    MainPresenter presenter;

    @Bind(R.id.search_view)
    MaterialSearchView mSearchView;
    @Bind(R.id.toolbar)
    Toolbar mToolbar;

    @Bind(R.id.fragmentsViewPager)
    FragmentViewPager mFragmentsViewPager;
    @Bind(R.id.mainCoordinatorLayout)
    CoordinatorLayout mMainCoordinatorLayout;

    //@State
    int tabIndex = MainPagerAdapter.ARTISTS_TAB;

    MenuItem itemSearchAction;
    BottomBar mBottomBar;
    MainPagerAdapter mAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainComponent
                .builder()
                .mainModule(new MainModule(this))
                .build()
                .inject(this);

        initActionBar();
        initBottomBar(savedInstanceState);
        initViewPager();
        initStartView();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        itemSearchAction = menu.findItem(R.id.action_search);
        mSearchView.setMenuItem(itemSearchAction);
        return true;
    }


    private void initActionBar() {
        setSupportActionBar(mToolbar);
        mSearchView.setOnQueryTextListener(presenter.getOnQueryTextSearchListener());
        mSearchView.setOnItemClickListener(presenter.getSearchSuggestionAdapterClickItemListener());
        mSearchView.setAdapter(presenter.getSuggestionsAdapter());
        mSearchView.setVoiceSearch(true);
        mSearchView.setVisibility(View.GONE);
    }

    private void initBottomBar(Bundle savedInstanceState) {
        mBottomBar = BottomBar.attach(mMainCoordinatorLayout, savedInstanceState);
        mBottomBar.setItemsFromMenu(R.menu.bottom_view, onMenuTabClickListener);
    }

    private void initViewPager() {
        mAdapter = new MainPagerAdapter(getSupportFragmentManager(), this);
        mFragmentsViewPager.setOffscreenPageLimit(mAdapter.getCount());
        mFragmentsViewPager.setAdapter(mAdapter);
    }

    private void initStartView() {
        mBottomBar.selectTabAtPosition(tabIndex, false);
        selectItem(R.id.navArtistsFragment);
    }

    private void selectItem(Integer resId) {
        switch (resId) {
            case R.id.navArtistsFragment:
                tabIndex = MainPagerAdapter.ARTISTS_TAB;
                mToolbar.setTitle(R.string.artists_nav);
                mSearchView.setVisibility(View.VISIBLE);
                if (itemSearchAction != null)
                    itemSearchAction.setVisible(true);
                break;
            case R.id.navSettingsFragment:
                tabIndex = MainPagerAdapter.SETTINGS_TAB;
                mToolbar.setTitle(R.string.settings_nav);
                mSearchView.setVisibility(View.GONE);
                if (itemSearchAction != null)
                    itemSearchAction.setVisible(false);

                break;
            default:
                tabIndex = MainPagerAdapter.ARTISTS_TAB;
        }
        mFragmentsViewPager.setCurrentItem(tabIndex, false);
    }


    private OnMenuTabClickListener onMenuTabClickListener = new OnMenuTabClickListener() {
        @Override
        public void onMenuTabSelected(@IdRes int menuItemId) {
            selectItem(menuItemId);
        }

        @Override
        public void onMenuTabReSelected(@IdRes int menuItemId) {

        }
    };

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == MaterialSearchView.REQUEST_VOICE && resultCode == RESULT_OK) {
            ArrayList<String> matches = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
            if (matches != null && matches.size() > 0) {
                String searchWrd = matches.get(0);
                if (!TextUtils.isEmpty(searchWrd)) {
                    mSearchView.setQuery(searchWrd, false);
                }
            }
            return;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onBackPressed() {
        if (mSearchView.isSearchOpen()) {
            mSearchView.closeSearch();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onResume() {
        if (mAdapter != null)
            mAdapter.notifyDataSetChanged();
        super.onResume();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mBottomBar.onSaveInstanceState(outState);
    }


    @Override
    public void hideSearch() {
        mSearchView.closeSearch();
    }
}
