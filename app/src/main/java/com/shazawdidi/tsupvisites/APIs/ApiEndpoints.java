package com.shazawdidi.tsupvisites.APIs;

import com.shazawdidi.tsupvisites.model.VisitesResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiEndpoints {
    @GET("movie/{id}")
    abstract Call <VisitesResponse> getVisites();
}
