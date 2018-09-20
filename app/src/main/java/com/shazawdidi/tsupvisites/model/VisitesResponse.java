package com.shazawdidi.tsupvisites.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class VisitesResponse {
    @SerializedName("Location")
    private List<Visites> Location;
    @SerializedName( "longitude" )
    private Integer longitude;
    @SerializedName( "latitude" )
    private Integer latitude;


    public List <Visites> getLocation() {
        return Location;
    }



    public Integer getLongitude() {
        return longitude;
    }

    public Integer getLatitude() {
        return latitude;
    }
}
