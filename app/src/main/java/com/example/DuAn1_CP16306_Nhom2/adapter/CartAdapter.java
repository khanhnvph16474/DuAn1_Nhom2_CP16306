package com.example.DuAn1_CP16306_Nhom2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.DuAn1_CP16306_Nhom2.R;
import com.example.DuAn1_CP16306_Nhom2.model.Cart;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CartAdapter extends BaseAdapter {
    Context context;
    ArrayList<Cart> cartlist;

    public CartAdapter(Context context, ArrayList<Cart> cartlist) {
        this.context = context;
        this.cartlist = cartlist;
    }

    @Override
    public int getCount() {
        if (cartlist != null) {
            return cartlist.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return cartlist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        CViewHolder cViewHolder = null;
        if (convertView == null) {
            cViewHolder = new CViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_cart2, null);
            cViewHolder.imgcart = convertView.findViewById(R.id.imagecart);
            cViewHolder.tvtenf = convertView.findViewById(R.id.tvtenf);
            cViewHolder.btnslf = convertView.findViewById(R.id.btnslf);
            cViewHolder.btncong = convertView.findViewById(R.id.btncong);
            cViewHolder.btntru = convertView.findViewById(R.id.btntru);
            convertView.setTag(cViewHolder);
        } else {
            cViewHolder = (CViewHolder) convertView.getTag();
        }
        // lấy vị trí
        Cart cart = (Cart) getItem(position);
        cViewHolder.tvtenf.setText(cart.getTenF());
        // load ảnh
        Picasso.get().load(cart.getHinhF()).into(cViewHolder.imgcart);
        cViewHolder.btnslf.setText(Integer.toString(cart.getSoluongF()));

        return convertView;
    }

    public class CViewHolder {
        ImageView imgcart,btntru,btncong;
        TextView tvtenf, btnslf;
    }


}
