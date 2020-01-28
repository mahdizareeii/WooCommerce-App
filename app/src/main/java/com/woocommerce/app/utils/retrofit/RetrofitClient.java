package com.woocommerce.app.utils.retrofit;

import com.woocommerce.app.utils.AppConstants;
import com.woocommerce.app.utils.woocommerceConfiguration.BasicAuthInterceptor;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static Retrofit retrofit;

    private static Retrofit.Builder retrofitBuilder = new Retrofit.Builder()
            .client(new OkHttpClient.Builder().addInterceptor(new BasicAuthInterceptor(AppConstants.ConsumerKey, AppConstants.ConsumerSecret)).build())
            .baseUrl(AppConstants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create());

    private static Retrofit getRetrofit() {
        if (retrofit == null) {
            retrofit = retrofitBuilder.build();
        }
        return retrofit;
    }

    public static RetrofitApi getRetrofitApi = getRetrofit().create(RetrofitApi.class);

}
