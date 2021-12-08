package com.example.DuAn1_CP16306_Nhom2.Menu;

import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.DuAn1_CP16306_Nhom2.Login;
import com.example.DuAn1_CP16306_Nhom2.R;

public class AccountFrag extends Fragment {
    public AccountFrag() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_account_frag, container, false);
    }

    TextView tvname, tvsdt, tvthanhpho, tvgmail;
    Button btnout;

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tvname = view.findViewById(R.id.tvname);
        tvsdt = view.findViewById(R.id.tvsdt);
        tvthanhpho = view.findViewById(R.id.tvthanhpho);
        tvgmail = view.findViewById(R.id.tvgmail);
        btnout = view.findViewById(R.id.logout);

        int i = 1;
        String name = Login.listu.get(i).getTenU();
        tvname.setText(name);
        tvthanhpho.setText(Login.listu.get(i).getDiachiU());
        tvsdt.setText(Login.listu.get(i).getSdtU()+"");
        tvgmail.setText(Login.listu.get(i).getGmailU());
        btnout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Login.class);
                startActivity(intent);
            }
        });
    }


}