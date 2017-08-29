package com.example.lg.nado;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class TabPagerAdapter extends FragmentStatePagerAdapter {

    // Count number of tabs
    private int tabCount;

    public TabPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {

        // Returning the current tabs
        switch (position) {
            case 0:
                wordActivity tabFragment1 = new wordActivity();
                return tabFragment1;
            case 1:
                celebrityActivity tabFragment2 = new celebrityActivity();
                return tabFragment2;
            case 2:
                famousActivity tabFragment3 = new famousActivity();
                return tabFragment3;
            case 3:
                placeActivity tabFragment4 = new placeActivity();
                return tabFragment4;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
