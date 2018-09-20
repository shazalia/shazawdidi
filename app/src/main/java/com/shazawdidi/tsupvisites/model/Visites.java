package com.shazawdidi.tsupvisites.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Visites {
    @SerializedName("Id")
    private Integer Id;
    @SerializedName("visitTitle")
    private String visitTitle;
    @SerializedName("description")
    private String description;
    @SerializedName("VisitDate")
    private String VisitDate;
    @SerializedName("MerchantID")
    private List<Integer> MerchantID = new ArrayList<Integer>();
    @SerializedName("MerchantName")
    private String MerchantName;
    @SerializedName("TicketNo")
    private Integer TicketNo;

    public Visites(Integer Id, String visitTitle, String description, String VisitDate, List<Integer>MerchantID
            , String MerchantName, Integer TicketNo ) {
    }
    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getVisitTitle() {
        return visitTitle;
    }

    public void setVisitTitle(String visitTitle) {
        this.visitTitle = visitTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVisitDate() {
        return VisitDate;
    }

    public void setVisitDate(String visitDate) {
        VisitDate = visitDate;
    }

    public List <Integer> getMerchantID() {
        return MerchantID;
    }

    public void setMerchantID(List <Integer> merchantID) {
        MerchantID = merchantID;
    }

    public String getMerchantName() {
        return MerchantName;
    }

    public void setMerchantName(String merchantName) {
        MerchantName = merchantName;
    }

    public Integer getTicketNo() {
        return TicketNo;
    }

    public void setTicketNo(Integer ticketNo) {
        TicketNo = ticketNo;
    }





}
