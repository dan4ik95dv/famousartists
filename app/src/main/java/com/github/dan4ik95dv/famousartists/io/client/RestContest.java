package com.github.dan4ik95dv.famousartists.io.client;


import com.github.dan4ik95dv.famousartists.model.contest.ArtistContest;

import java.util.ArrayList;

import retrofit2.http.GET;
import retrofit2.http.Headers;
import rx.Observable;

/**
 * Created by Daniil Celikin on 09.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
public interface RestContest {

    //Get Famous Artists
    @Headers({"Accept: application/json", "Content-Type: application / json"})
    @GET("artists.json")
    Observable<ArrayList<ArtistContest>> getArtists();

}
