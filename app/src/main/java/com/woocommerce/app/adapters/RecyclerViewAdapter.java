package com.woocommerce.app.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.woocommerce.app.R;
import com.woocommerce.app.models.woocommerceModel.Product;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RVViewHolder> {

    private List<Product> list;

    @NonNull
    @Override
    public RVViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_view, parent, false);
        return new RVViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RVViewHolder holder, int position) {
        Product product = list.get(position);
        holder.txtProductName.setText(product.getName());
        holder.txtCategory.setText(product.getCatalogVisibility());
        holder.txtPrice.setText("$"+product.getPrice());
        Glide.with(holder.itemView.getContext()).load(product.getImages().get(0).getSrc())
                .transform(new CenterCrop(), new RoundedCorners(20)).into(holder.imgProduct);
    }

    @Override
    public int getItemCount() {
        return list != null ? list.size() : 0;
    }

    public void updateList(List<Product> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    public class RVViewHolder extends RecyclerView.ViewHolder {

        private TextView txtProductName, txtCategory, txtPrice;
        private ImageView imgProduct;

        public RVViewHolder(@NonNull View itemView) {
            super(itemView);
            initView(itemView);
        }

        private void initView(View view) {
            imgProduct = view.findViewById(R.id.imgProduct);
            txtProductName = view.findViewById(R.id.txtProductName);
            txtCategory = view.findViewById(R.id.txtCategory);
            txtPrice = view.findViewById(R.id.txtPrice);
        }
    }
}
