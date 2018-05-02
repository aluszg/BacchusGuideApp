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
public class BacchusFragmentB extends Fragment {

    public static final String LOG_TAG = BacchusFragmentB.class.getName ();

    public BacchusFragmentB() {
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
        bacchus.add (new Bacchus (getString(R.string.bacchus_4_name), R.drawable.image_4, getString(R.string.bacchus_4_description), getString(R.string.bacchus_4_author), getString(R.string.bacchus_4_founder)));
        bacchus.add (new Bacchus (getString(R.string.bacchus_5_name), R.drawable.image_5, getString(R.string.bacchus_5_description), getString(R.string.bacchus_5_author), getString(R.string.bacchus_5_founder)));
        bacchus.add (new Bacchus (getString(R.string.bacchus_6_name), R.drawable.image_6, getString(R.string.bacchus_6_description), getString(R.string.bacchus_6_author), getString(R.string.bacchus_6_founder)));

        // Create a new {@link ArrayAdapter} of earthquakes
        BacchusAdapter adapter = new BacchusAdapter (getActivity (), bacchus);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        listView.setAdapter (adapter);

        return rootView;
    }
}
