package com.woocommerce.app.models.woocommerceModel;

import com.google.gson.annotations.SerializedName;

public class Image {

    @SerializedName("id")
    private Integer id;

    @SerializedName("date_created")
    private String dateCreated;

    @SerializedName("date_created_gmt")
    private String dateCreatedGmt;

    @SerializedName("date_modified")
    private String dateModified;

    @SerializedName("date_modified_gmt")
    private String dateModifiedGmt;

    @SerializedName("src")
    private String src;

    @SerializedName("name")
    private String name;

    @SerializedName("alt")
    private String alt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDateCreatedGmt() {
        return dateCreatedGmt;
    }

    public void setDateCreatedGmt(String dateCreatedGmt) {
        this.dateCreatedGmt = dateCreatedGmt;
    }

    public String getDateModified() {
        return dateModified;
    }

    public void setDateModified(String dateModified) {
        this.dateModified = dateModified;
    }

    public String getDateModifiedGmt() {
        return dateModifiedGmt;
    }

    public void setDateModifiedGmt(String dateModifiedGmt) {
        this.dateModifiedGmt = dateModifiedGmt;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

}