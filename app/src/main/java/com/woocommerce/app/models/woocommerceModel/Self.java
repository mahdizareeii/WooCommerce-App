package com.woocommerce.app.models.woocommerceModel;

import com.google.gson.annotations.SerializedName;

public class Self {

    @SerializedName("href")
    private String href;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

}