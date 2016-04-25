package com.github.dan4ik95dv.famousartists.ui.view;

import com.github.dan4ik95dv.famousartists.model.contest.ArtistContest;
import com.github.dan4ik95dv.famousartists.ui.fragment.ArtistDescriptionFragment;

/**
 * Created by Daniil Celikin on 25.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
public interface ArtistDescriptionMvpView extends FragmentMvpView {

    ArtistDescriptionFragment getFragment();
    void bindView(ArtistContest artistContest);
    void hideProgress();
}
