package com.example.ekasilabalexcdtb.alextourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by eKasiLab Alex CDTB on 19 Jul 2017.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position == 0)
        {
            fragment = new AlexFragmentA();
        }
        else if (position == 1)
        {
            fragment = new AlexFragmentB();
        }
        else if (position == 2)
        {
            fragment = new AlexFragmentC();
        }
        else if (position == 3)
        {
            fragment = new AlexFragmentD();
        }


        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }
    @Override
    public CharSequence getPageTitle(int position){
        String title =  null;
        if (position == 0)
        {
            title = "Public Places";
        }
        else if (position == 1)
        {
            title = "Entertainments";
        }
        else if (position == 2)
        {
            title = "Trades and Shopping";
        }
        else if (position == 3)
        {
            title = "Cooperates and Firms";
        }
        return title;
    }

}
