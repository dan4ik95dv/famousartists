package com.github.dan4ik95dv.famousartists.ui.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.github.dan4ik95dv.famousartists.R;
import com.github.dan4ik95dv.famousartists.ui.fragment.ArtistsFragment;
import com.github.dan4ik95dv.famousartists.ui.fragment.SettingsFragment;
import com.github.dan4ik95dv.famousartists.ui.view.FragmentMvpView;
import com.github.dan4ik95dv.famousartists.ui.widget.CacheFragmentStatePagerAdapter;

/**
 * Created by Daniil Celikin on 16.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */

public class MainPagerAdapter extends CacheFragmentStatePagerAdapter {

    public static final int ARTISTS_TAB = 0;
    public static final int SETTINGS_TAB = 1;

    private final Context context;

    public MainPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case ARTISTS_TAB:
                return ArtistsFragment.newInstance();
            case SETTINGS_TAB:
                return SettingsFragment.newInstance();
        }
        return null;
    }

    @Override
    public int getItemPosition(Object object) {
        if (object instanceof FragmentMvpView)
            ((FragmentMvpView) object).updateFragment();
        return super.getItemPosition(object);
    }

    @Override
    public String getItemTag(int position) {
        switch (position) {
            case ARTISTS_TAB:
                return "artists";
            case SETTINGS_TAB:
                return "settings";
        }
        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case ARTISTS_TAB:
                return context.getString(R.string.artists_nav);
            case SETTINGS_TAB:
                return context.getString(R.string.settings_nav);
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    public Fragment getItemAt(int position) {
        return mFragmentManager.findFragmentByTag(getItemTag(position));
    }
}
