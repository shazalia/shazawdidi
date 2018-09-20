package com.shazawdidi.tsupvisites.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class VisitesResponse {
    @SerializedName("lastId")
    private int lastId;
    @SerializedName("results")
    private List<Visites> results;

    public int getLastId() {
        return lastId;
    }

    public void setLastId(int lastId) {
        this.lastId = lastId;
    }

    public List <Visites> getResults() {
        return results;
    }

    public void setResults(List <Visites> results) {
        this.results = results;
    }
}
