package com.example.DuAn1_CP16306_Nhom2.Menu;

import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.DuAn1_CP16306_Nhom2.HomeTab.Food;
import com.example.DuAn1_CP16306_Nhom2.Test.Test;
import com.example.DuAn1_CP16306_Nhom2.adapter.CartAdapter;
import com.example.DuAn1_CP16306_Nhom2.R;

import java.text.DecimalFormat;

public class OrderFrag extends Fragment {
    public OrderFrag() {
    }

    ListView recyclerView;
    TextView tv_sumk;
    CartAdapter cartAdapter;
    Button btnpaym;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_order_frag, container, false);
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.rcv_pay);
        tv_sumk = view.findViewById(R.id.tv_sumk);
        btnpaym = view.findViewById(R.id.btnpaym);


        btnpaym.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), Test.class);
                startActivity(i);
            }
        });
        cartAdapter = new CartAdapter(getContext(), Food.listcart);
        recyclerView.setAdapter(cartAdapter);
        UpdateSum();

    }

    public void UpdateSum() {
        long sum = 0;
        if (Food.listcart == null) {
            return;
        } else {
            for (int i = 0; i < Food.listcart.size(); i++) {
                sum += Food.listcart.get(i).getGiaF();

            }
            DecimalFormat decimalFormat = new DecimalFormat("###,###,###");
            tv_sumk.setText(decimalFormat.format(sum) + "đ");
        }
    }
}