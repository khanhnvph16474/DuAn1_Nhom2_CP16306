package com.example.DuAn1_CP16306_Nhom2.Test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.DuAn1_CP16306_Nhom2.HomeTab.Food;
import com.example.DuAn1_CP16306_Nhom2.MainActivity;
import com.example.DuAn1_CP16306_Nhom2.R;


import java.text.DecimalFormat;

public class Test extends AppCompatActivity {
    RecyclerView rcv_pay;
    static TextView tv_sumt,btnbackp;
    TestCartAdapter cartAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        rcv_pay = findViewById(R.id.rcv_pay);
        tv_sumt = findViewById(R.id.tv_sumt);
        btnbackp = findViewById(R.id.btnbackp);


        btnbackp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Test.this, MainActivity.class);
                startActivity(i);
            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rcv_pay.setHasFixedSize(true);
        rcv_pay.setLayoutManager(linearLayoutManager);
                DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getApplicationContext(),DividerItemDecoration.VERTICAL);
        rcv_pay.addItemDecoration(dividerItemDecoration);
        cartAdapter = new TestCartAdapter(this, Food.listcart);
        rcv_pay.setAdapter(cartAdapter);
        UpdateSum();
        CheckData();
    UpdateSum();
    CheckData();
    }
    public static void UpdateSum(){
        long sum = 0;
        for (int i = 0; i< Food.listcart.size(); i++){
            sum+= Food.listcart.get(i).getGiaF();

        }
        DecimalFormat decimalFormat = new DecimalFormat("###,###,###");
        tv_sumt.setText(decimalFormat.format(sum)+"đ");
    }
    void  CheckData()
    {
        if(Food.listcart.size()<=0)
        {
            cartAdapter.notifyDataSetChanged();
            rcv_pay.setVisibility(View.INVISIBLE);
        }
        else
        {
            cartAdapter.notifyDataSetChanged();
            rcv_pay.setVisibility(View.VISIBLE);
        }
    }
}
