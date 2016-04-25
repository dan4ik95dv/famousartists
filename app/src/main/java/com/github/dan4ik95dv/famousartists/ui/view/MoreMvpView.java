package com.github.dan4ik95dv.famousartists.ui.view;

import com.github.dan4ik95dv.famousartists.model.contest.ArtistContest;
import com.github.dan4ik95dv.famousartists.model.yandex.Artist;

/**
 * Created by Daniil Celikin on 12.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
public interface MoreMvpView extends ActivityMvpView {
    void bindView(Artist artist);
    void bindView(ArtistContest artistContest);
}
