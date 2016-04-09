package com.github.dan4ik95dv.famousartists.io.client;

import com.github.dan4ik95dv.famousartists.model.Artist;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Headers;
import rx.Observable;

/**
 * Created by Daniil Celikin on 09.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
public interface Rest {

    //Get Famous Artists
    @Headers({"Accept: application/json", "Content-Type: application / json"})
    @GET("artists.json")
    Observable<List<Artist>> getArtists();

}
