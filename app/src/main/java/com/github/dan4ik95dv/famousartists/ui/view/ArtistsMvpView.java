package com.github.dan4ik95dv.famousartists.ui.view;

import com.github.dan4ik95dv.famousartists.ui.fragment.ArtistsFragment;

/**
 * Created by Daniil Celikin on 16.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
public interface ArtistsMvpView extends FragmentMvpView {

    ArtistsFragment getFragment();

    void hideProgress();

    void empty();

    void success();

    void error();


}
