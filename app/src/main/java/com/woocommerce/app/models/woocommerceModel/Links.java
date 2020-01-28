package com.woocommerce.app.models.woocommerceModel;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Links {

    @SerializedName("self")
    private List<Self> self = null;

    @SerializedName("collection")
    private List<Collection> collection = null;

    public List<Self> getSelf() {
        return self;
    }

    public void setSelf(List<Self> self) {
        this.self = self;
    }

    public List<Collection> getCollection() {
        return collection;
    }

    public void setCollection(List<Collection> collection) {
        this.collection = collection;
    }

}