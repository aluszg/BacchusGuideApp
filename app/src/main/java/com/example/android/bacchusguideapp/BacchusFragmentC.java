package com.example.android.bacchusguideapp;


import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A Bacchus {@link Fragment} subclass.
 */
public class BacchusFragmentC extends Fragment {

    public static final String LOG_TAG = BacchusFragmentC.class.getName ();

    public BacchusFragmentC() {
        // Required empty public constructor
    }

    //The details fragment showing the contents of a selected item
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate (R.layout.bacchus_fragment_list_view, container, false);

        // Find a reference to the {@link ListView} in the layout
        ListView listView = (ListView) rootView.findViewById (R.id.list);

        // Create a fake list of earthquake locations.
        // Author: bachusiki.zgora.pl
        ArrayList<Bacchus> bacchus = new ArrayList<Bacchus> ();
        bacchus.add (new Bacchus (getString(R.string.bacchus_7_name), R.drawable.image_7, getString(R.string.bacchus_7_description), getString(R.string.bacchus_7_author), getString(R.string.bacchus_7_founder)));
        bacchus.add (new Bacchus (getString(R.string.bacchus_8_name), R.drawable.image_8, getString(R.string.bacchus_8_description), getString(R.string.bacchus_8_author), getString(R.string.bacchus_8_founder)));
        bacchus.add (new Bacchus (getString(R.string.bacchus_9_name), R.drawable.image_9, getString(R.string.bacchus_9_description), getString(R.string.bacchus_9_author), getString(R.string.bacchus_9_founder)));
        bacchus.add (new Bacchus (getString(R.string.bacchus_10_name), R.drawable.image_10, getString(R.string.bacchus_10_description), getString(R.string.bacchus_10_author), getString(R.string.bacchus_10_founder)));
        bacchus.add (new Bacchus (getString(R.string.bacchus_11_name), R.drawable.image_11, getString(R.string.bacchus_11_description), getString(R.string.bacchus_11_author), getString(R.string.bacchus_11_founder)));

        // Create a new {@link ArrayAdapter} of earthquakes
        BacchusAdapter adapter = new BacchusAdapter (getActivity (), bacchus);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        listView.setAdapter (adapter);

        return rootView;
    }
}
