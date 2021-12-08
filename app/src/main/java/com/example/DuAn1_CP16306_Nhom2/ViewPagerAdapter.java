package com.example.DuAn1_CP16306_Nhom2;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.DuAn1_CP16306_Nhom2.Menu.AccountFrag;
import com.example.DuAn1_CP16306_Nhom2.Menu.NotifiFrag;
import com.example.DuAn1_CP16306_Nhom2.Menu.HomeFrag;
import com.example.DuAn1_CP16306_Nhom2.Menu.OrderFrag;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter( FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new HomeFrag();
            case 1:
                return new OrderFrag();
            case 2:
                return new NotifiFrag();
            case 3:
                return new AccountFrag();
            default:
                return new HomeFrag();
        }
    }
}
