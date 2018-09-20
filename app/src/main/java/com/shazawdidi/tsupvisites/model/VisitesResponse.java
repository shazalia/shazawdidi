package com.shazawdidi.tsupvisites.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class VisitesResponse {
    @SerializedName("lastId")
    private int lastId;
    @SerializedName("results")
    private List<Visites> results;


    public List <Visites> getResults() {
        return results;
    }

}
