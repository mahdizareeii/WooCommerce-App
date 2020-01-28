package com.woocommerce.app.utils.retrofit;

import com.woocommerce.app.models.woocommerceModel.Product;
import com.woocommerce.app.utils.AppConstants;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface RetrofitApi {

    @GET(AppConstants.getProducts)
    Observable<List<Product>> getProducts();

}
