package com.github.dan4ik95dv.famousartists.ui.view;

import com.github.dan4ik95dv.famousartists.ui.fragment.ArtistTracksFragment;

/**
 * Created by Daniil Celikin on 25.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
public interface ArtistTracksMvpView extends FragmentMvpView {

    ArtistTracksFragment getFragment();

    void hideProgress();
    void noTracks();
}
