package com.github.dan4ik95dv.famousartists.io.bus.event;

import com.github.dan4ik95dv.famousartists.model.contest.ArtistContest;

/**
 * Created by Daniil Celikin on 26.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
public class ArtistContestEvent {
    ArtistContest artistContest;

    public ArtistContestEvent(ArtistContest artistContest) {
        this.artistContest = artistContest;
    }

    public ArtistContest getArtistContest() {
        return artistContest;
    }
}
