package com.woocommerce.app.models.woocommerceModel;

import android.media.Image;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Product {

    @SerializedName("id")
    private Integer id;

    @SerializedName("name")
    private String name;

    @SerializedName("slug")
    private String slug;

    @SerializedName("permalink")
    private String permalink;

    @SerializedName("date_created")
    private String dateCreated;

    @SerializedName("date_created_gmt")
    private String dateCreatedGmt;

    @SerializedName("date_modified")
    private String dateModified;

    @SerializedName("date_modified_gmt")
    private String dateModifiedGmt;

    @SerializedName("type")
    private String type;

    @SerializedName("status")
    private String status;

    @SerializedName("featured")
    private Boolean featured;

    @SerializedName("catalog_visibility")
    private String catalogVisibility;

    @SerializedName("description")
    private String description;

    @SerializedName("short_description")
    private String shortDescription;

    @SerializedName("sku")
    private String sku;

    @SerializedName("price")
    private String price;

    @SerializedName("regular_price")
    private String regularPrice;

    @SerializedName("sale_price")
    private String salePrice;

    @SerializedName("date_on_sale_from")
    private String dateOnSaleFrom;

    @SerializedName("date_on_sale_from_gmt")
    private String dateOnSaleFromGmt;

    @SerializedName("date_on_sale_to")
    private String dateOnSaleTo;

    @SerializedName("date_on_sale_to_gmt")
    private String dateOnSaleToGmt;

    @SerializedName("price_html")
    private String priceHtml;

    @SerializedName("on_sale")
    private Boolean onSale;

    @SerializedName("purchasable")
    private Boolean purchasable;

    @SerializedName("total_sales")
    private Integer totalSales;

    @SerializedName("virtual")
    private Boolean virtual;

    @SerializedName("downloadable")
    private Boolean downloadable;

    @SerializedName("downloads")
    private List<String> downloads = null;

    @SerializedName("download_limit")
    private Integer downloadLimit;

    @SerializedName("download_expiry")
    private Integer downloadExpiry;

    @SerializedName("external_url")
    private String externalUrl;

    @SerializedName("button_text")
    private String buttonText;

    @SerializedName("tax_status")
    private String taxStatus;

    @SerializedName("tax_class")
    private String taxClass;

    @SerializedName("manage_stock")
    private Boolean manageStock;

    @SerializedName("stock_quantity")
    private String stockQuantity;

    @SerializedName("stock_status")
    private String stockStatus;

    @SerializedName("backorders")
    private String backorders;

    @SerializedName("backorders_allowed")
    private Boolean backordersAllowed;

    @SerializedName("backordered")
    private Boolean backordered;

    @SerializedName("sold_individually")
    private Boolean soldIndividually;

    @SerializedName("weight")
    private String weight;

    @SerializedName("dimensions")
    private Dimensions dimensions;

    @SerializedName("shipping_required")
    private Boolean shippingRequired;

    @SerializedName("shipping_taxable")
    private Boolean shippingTaxable;

    @SerializedName("shipping_class")
    private String shippingClass;

    @SerializedName("shipping_class_id")
    private Integer shippingClassId;

    @SerializedName("reviews_allowed")
    private Boolean reviewsAllowed;

    @SerializedName("average_rating")
    private String averageRating;

    @SerializedName("rating_count")
    private Integer ratingCount;

    @SerializedName("related_ids")
    private List<Integer> relatedIds = null;

    @SerializedName("upsell_ids")
    private List<String> upsellIds = null;

    @SerializedName("cross_sell_ids")
    private List<String> crossSellIds = null;

    @SerializedName("parent_id")
    private Integer parentId;

    @SerializedName("purchase_note")
    private String purchaseNote;

    @SerializedName("categories")
    private List<Category> categories = null;

    @SerializedName("tags")
    private List<String> tags = null;

    @SerializedName("images")
    private List<com.woocommerce.app.models.woocommerceModel.Image> images = null;

    @SerializedName("attributes")
    private List<Attribute> attributes = null;

    @SerializedName("default_attributes")
    private List<DefaultAttribute> defaultAttributes = null;

    @SerializedName("variations")
    private List<String> variations = null;

    @SerializedName("grouped_products")
    private List<String> groupedProducts = null;

    @SerializedName("menu_order")
    private Integer menuOrder;

    @SerializedName("meta_data")
    private List<String> metaData = null;

    @SerializedName("_links")
    private Links links;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getFeatured() {
        return featured;
    }

    public void setFeatured(Boolean featured) {
        this.featured = featured;
    }

    public String getCatalogVisibility() {
        return catalogVisibility;
    }

    public void setCatalogVisibility(String catalogVisibility) {
        this.catalogVisibility = catalogVisibility;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(String regularPrice) {
        this.regularPrice = regularPrice;
    }

    public String getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice;
    }

    public String getDateOnSaleFrom() {
        return dateOnSaleFrom;
    }

    public void setDateOnSaleFrom(String dateOnSaleFrom) {
        this.dateOnSaleFrom = dateOnSaleFrom;
    }

    public String getDateOnSaleFromGmt() {
        return dateOnSaleFromGmt;
    }

    public void setDateOnSaleFromGmt(String dateOnSaleFromGmt) {
        this.dateOnSaleFromGmt = dateOnSaleFromGmt;
    }

    public String getDateOnSaleTo() {
        return dateOnSaleTo;
    }

    public void setDateOnSaleTo(String dateOnSaleTo) {
        this.dateOnSaleTo = dateOnSaleTo;
    }

    public String getDateOnSaleToGmt() {
        return dateOnSaleToGmt;
    }

    public void setDateOnSaleToGmt(String dateOnSaleToGmt) {
        this.dateOnSaleToGmt = dateOnSaleToGmt;
    }

    public String getPriceHtml() {
        return priceHtml;
    }

    public void setPriceHtml(String priceHtml) {
        this.priceHtml = priceHtml;
    }

    public Boolean getOnSale() {
        return onSale;
    }

    public void setOnSale(Boolean onSale) {
        this.onSale = onSale;
    }

    public Boolean getPurchasable() {
        return purchasable;
    }

    public void setPurchasable(Boolean purchasable) {
        this.purchasable = purchasable;
    }

    public Integer getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(Integer totalSales) {
        this.totalSales = totalSales;
    }

    public Boolean getVirtual() {
        return virtual;
    }

    public void setVirtual(Boolean virtual) {
        this.virtual = virtual;
    }

    public Boolean getDownloadable() {
        return downloadable;
    }

    public void setDownloadable(Boolean downloadable) {
        this.downloadable = downloadable;
    }

    public List<String> getDownloads() {
        return downloads;
    }

    public void setDownloads(List<String> downloads) {
        this.downloads = downloads;
    }

    public Integer getDownloadLimit() {
        return downloadLimit;
    }

    public void setDownloadLimit(Integer downloadLimit) {
        this.downloadLimit = downloadLimit;
    }

    public Integer getDownloadExpiry() {
        return downloadExpiry;
    }

    public void setDownloadExpiry(Integer downloadExpiry) {
        this.downloadExpiry = downloadExpiry;
    }

    public String getExternalUrl() {
        return externalUrl;
    }

    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    public String getButtonText() {
        return buttonText;
    }

    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }

    public String getTaxStatus() {
        return taxStatus;
    }

    public void setTaxStatus(String taxStatus) {
        this.taxStatus = taxStatus;
    }

    public String getTaxClass() {
        return taxClass;
    }

    public void setTaxClass(String taxClass) {
        this.taxClass = taxClass;
    }

    public Boolean getManageStock() {
        return manageStock;
    }

    public void setManageStock(Boolean manageStock) {
        this.manageStock = manageStock;
    }

    public String getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(String stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String getStockStatus() {
        return stockStatus;
    }

    public void setStockStatus(String stockStatus) {
        this.stockStatus = stockStatus;
    }

    public String getBackorders() {
        return backorders;
    }

    public void setBackorders(String backorders) {
        this.backorders = backorders;
    }

    public Boolean getBackordersAllowed() {
        return backordersAllowed;
    }

    public void setBackordersAllowed(Boolean backordersAllowed) {
        this.backordersAllowed = backordersAllowed;
    }

    public Boolean getBackordered() {
        return backordered;
    }

    public void setBackordered(Boolean backordered) {
        this.backordered = backordered;
    }

    public Boolean getSoldIndividually() {
        return soldIndividually;
    }

    public void setSoldIndividually(Boolean soldIndividually) {
        this.soldIndividually = soldIndividually;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public Boolean getShippingRequired() {
        return shippingRequired;
    }

    public void setShippingRequired(Boolean shippingRequired) {
        this.shippingRequired = shippingRequired;
    }

    public Boolean getShippingTaxable() {
        return shippingTaxable;
    }

    public void setShippingTaxable(Boolean shippingTaxable) {
        this.shippingTaxable = shippingTaxable;
    }

    public String getShippingClass() {
        return shippingClass;
    }

    public void setShippingClass(String shippingClass) {
        this.shippingClass = shippingClass;
    }

    public Integer getShippingClassId() {
        return shippingClassId;
    }

    public void setShippingClassId(Integer shippingClassId) {
        this.shippingClassId = shippingClassId;
    }

    public Boolean getReviewsAllowed() {
        return reviewsAllowed;
    }

    public void setReviewsAllowed(Boolean reviewsAllowed) {
        this.reviewsAllowed = reviewsAllowed;
    }

    public String getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(String averageRating) {
        this.averageRating = averageRating;
    }

    public Integer getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(Integer ratingCount) {
        this.ratingCount = ratingCount;
    }

    public List<Integer> getRelatedIds() {
        return relatedIds;
    }

    public void setRelatedIds(List<Integer> relatedIds) {
        this.relatedIds = relatedIds;
    }

    public List<String> getUpsellIds() {
        return upsellIds;
    }

    public void setUpsellIds(List<String> upsellIds) {
        this.upsellIds = upsellIds;
    }

    public List<String> getCrossSellIds() {
        return crossSellIds;
    }

    public void setCrossSellIds(List<String> crossSellIds) {
        this.crossSellIds = crossSellIds;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getPurchaseNote() {
        return purchaseNote;
    }

    public void setPurchaseNote(String purchaseNote) {
        this.purchaseNote = purchaseNote;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<com.woocommerce.app.models.woocommerceModel.Image> getImages() {
        return images;
    }

    public void setImages(List<com.woocommerce.app.models.woocommerceModel.Image> images) {
        this.images = images;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public List<DefaultAttribute> getDefaultAttributes() {
        return defaultAttributes;
    }

    public void setDefaultAttributes(List<DefaultAttribute> defaultAttributes) {
        this.defaultAttributes = defaultAttributes;
    }

    public List<String> getVariations() {
        return variations;
    }

    public void setVariations(List<String> variations) {
        this.variations = variations;
    }

    public List<String> getGroupedProducts() {
        return groupedProducts;
    }

    public void setGroupedProducts(List<String> groupedProducts) {
        this.groupedProducts = groupedProducts;
    }

    public Integer getMenuOrder() {
        return menuOrder;
    }

    public void setMenuOrder(Integer menuOrder) {
        this.menuOrder = menuOrder;
    }

    public List<String> getMetaData() {
        return metaData;
    }

    public void setMetaData(List<String> metaData) {
        this.metaData = metaData;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }
}
