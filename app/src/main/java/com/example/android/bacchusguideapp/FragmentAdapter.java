package com.example.android.bacchusguideapp;


import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/**
 * A MapFragment {@link Fragment} subclass.
 */
public class FragmentAdapter extends FragmentPagerAdapter {

    private final Context context;

    public FragmentAdapter(FragmentManager fm, Context context) {
        super (fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new MapFragment ();
            case 1:
                return new BacchusFragmentA ();
            case 2:
                return new BacchusFragmentB ();
            case 3:
                return new BacchusFragmentC ();
            case 4:
                return new BacchusFragmentD ();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        Resources res = context.getResources();
        switch (position) {
            case 0:
                return res.getString(R.string.maps);
            case 1:
                return res.getString(R.string.bacchus_a);
            case 2:
                return res.getString(R.string.bacchus_b);
            case 3:
                return res.getString(R.string.bacchus_c);
            case 4:
                return res.getString(R.string.bacchus_d);
            default:
                return null;
        }
    }
}

