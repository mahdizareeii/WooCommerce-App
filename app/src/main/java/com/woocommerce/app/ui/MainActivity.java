package com.woocommerce.app.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.woocommerce.app.R;
import com.woocommerce.app.adapters.RecyclerViewAdapter;
import com.woocommerce.app.models.woocommerceModel.Product;
import com.woocommerce.app.utils.retrofit.OnCallBackListener;
import com.woocommerce.app.utils.retrofit.RetrofitClient;
import com.woocommerce.app.utils.retrofit.RetrofitHelper;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getProducts();
    }

    private void getProducts() {

        new RetrofitHelper<>(RetrofitClient.getRetrofitApi.getProducts(), new OnCallBackListener<List<Product>>() {
            @Override
            public void onCallBack(List<Product> products) {
                initRecyclerView(products);
            }
        });
    }

    private void initRecyclerView(List<Product> list) {
        RecyclerViewAdapter adapter = new RecyclerViewAdapter();
        RecyclerView recyclerView = findViewById(R.id.recyclerViewProduct);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        adapter.updateList(list);
    }
}
