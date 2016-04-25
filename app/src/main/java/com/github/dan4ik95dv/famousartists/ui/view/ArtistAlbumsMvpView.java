package com.github.dan4ik95dv.famousartists.ui.view;

import com.github.dan4ik95dv.famousartists.ui.fragment.ArtistAlbumsFragment;

/**
 * Created by Daniil Celikin on 25.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
public interface ArtistAlbumsMvpView extends FragmentMvpView {

    ArtistAlbumsFragment getFragment();

    void noAlbums();

    void hideProgress();
}
