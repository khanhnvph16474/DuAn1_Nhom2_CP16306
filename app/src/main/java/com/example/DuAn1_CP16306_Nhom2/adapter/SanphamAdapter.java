package com.example.DuAn1_CP16306_Nhom2.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.DuAn1_CP16306_Nhom2.Index;
import com.example.DuAn1_CP16306_Nhom2.model.Sanpham;
import com.squareup.picasso.Picasso;
import com.example.DuAn1_CP16306_Nhom2.R;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class SanphamAdapter extends RecyclerView.Adapter<SanphamAdapter.ItemViewHolder> {
    ArrayList<Sanpham> sanphamArrayList;
    Context context;
    public SanphamAdapter(Context context, ArrayList<Sanpham> sanphamArrayList) {
        this.sanphamArrayList = sanphamArrayList;
        this.context =context;
    }

    //tao layout
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sanphammoinhat,null);
        ItemViewHolder itemViewHolder = new ItemViewHolder(view);
        return itemViewHolder;
    }
    //xu ly du lieu
    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        Sanpham sanpham = sanphamArrayList.get(position);
            holder.txttensanpham.setText(sanpham.getTensanpham());
            DecimalFormat decimalFormat = new DecimalFormat("###,###,###");
            holder.txtgiasanpham.setText("Giá: " + decimalFormat.format(sanpham.getGiasanpham()) + " VND");
            Picasso.get().load(sanpham.getHinhanhsanpham())
                    .placeholder(R.drawable.home)
                    .error(R.drawable.erro)
                    .into(holder.imghinhsp);
            holder.linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    goToIndex(sanpham);
                }
            });
    }
    public void goToIndex(Sanpham sanpham){
        Intent i = new Intent(context, Index.class);
        Bundle bundle= new Bundle();
        bundle.putSerializable("drink",sanpham);
        i.putExtras(bundle);
        context.startActivity(i);
    }
    public void release(){
        context = null;
    }
    @Override
    public int getItemCount() {
        return sanphamArrayList.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder{
        ImageView imghinhsp;
        TextView txttensanpham,txtgiasanpham;
        LinearLayout linearLayout;
        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            linearLayout  = itemView.findViewById(R.id.lldrink);
            imghinhsp = itemView.findViewById(R.id.imageviewsanpham);
            txttensanpham = itemView.findViewById(R.id.textviewtensanpham);
            txtgiasanpham = itemView.findViewById(R.id.textviewgiasanpham);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
        }
    }

}
