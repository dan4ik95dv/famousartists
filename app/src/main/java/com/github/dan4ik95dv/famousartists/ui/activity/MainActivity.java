package com.github.dan4ik95dv.famousartists.ui.activity;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.design.widget.CoordinatorLayout;

import com.github.dan4ik95dv.famousartists.R;
import com.github.dan4ik95dv.famousartists.di.component.activity.DaggerMainComponent;
import com.github.dan4ik95dv.famousartists.di.module.activity.MainModule;
import com.github.dan4ik95dv.famousartists.ui.adapter.MainPagerAdapter;
import com.github.dan4ik95dv.famousartists.ui.presenter.MainPresenter;
import com.github.dan4ik95dv.famousartists.ui.view.MainMvpView;
import com.github.dan4ik95dv.famousartists.ui.widget.FragmentViewPager;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabClickListener;

import javax.inject.Inject;

import butterknife.Bind;

/**
 * Created by Daniil Celikin on 12.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
public class MainActivity extends BaseActivity implements MainMvpView {

    @Inject
    MainPresenter presenter;

    @Bind(R.id.fragmentsViewPager)
    FragmentViewPager mFragmentsViewPager;
    @Bind(R.id.mainCoordinatorLayout)
    CoordinatorLayout mMainCoordinatorLayout;

    //    @State
    int tabIndex = MainPagerAdapter.ARTISTS_TAB;

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
        initBottomBar(savedInstanceState);
        initViewPager();
        initStartView();
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
                break;
            case R.id.navSettingsFragment:
                tabIndex = MainPagerAdapter.SETTINGS_TAB;
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
}
