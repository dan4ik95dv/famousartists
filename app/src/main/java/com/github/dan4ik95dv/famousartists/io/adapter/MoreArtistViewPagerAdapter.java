package com.github.dan4ik95dv.famousartists.io.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.github.dan4ik95dv.famousartists.R;
import com.github.dan4ik95dv.famousartists.ui.fragment.ArtistAlbumsFragment;
import com.github.dan4ik95dv.famousartists.ui.fragment.ArtistDescriptionFragment;
import com.github.dan4ik95dv.famousartists.ui.fragment.ArtistTracksFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Daniil Celikin on 25.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
public class MoreArtistViewPagerAdapter extends FragmentPagerAdapter {
    public static final int DESCRIPTION_ARTIST_FRAGMENT = 0;
    public static final int ALBUMS_ARTIST_FRAGMENT = 1;
    public static final int TRACKS_ARTIST_FRAGMENT = 2;

    private final List<Fragment> mFragmentList = new ArrayList<>();
    private final List<String> mFragmentTitleList = new ArrayList<>();

    public MoreArtistViewPagerAdapter(FragmentManager fm, Context context) {
        super(fm);

        addFragments(context);
    }

    private void addFragments(Context context) {
        addFragment(new ArtistDescriptionFragment(),context.getString(R.string.description_tab));
        addFragment(new ArtistAlbumsFragment(), context.getString(R.string.albums_tab));
        addFragment(new ArtistTracksFragment(), context.getString(R.string.tracks_tab));
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    public void addFragment(Fragment fragment, String title) {
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);
    }


    public List<Fragment> getFragmentList() {
        return mFragmentList;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitleList.get(position);
    }
}