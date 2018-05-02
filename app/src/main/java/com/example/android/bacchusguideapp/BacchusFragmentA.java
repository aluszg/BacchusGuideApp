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
public class BacchusFragmentA extends Fragment {

    public static final String LOG_TAG = BacchusFragmentA.class.getName ();

    public BacchusFragmentA() {
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
        bacchus.add (new Bacchus (getString(R.string.bacchus_1_name), R.drawable.image_1, getString(R.string.bacchus_1_description), getString(R.string.bacchus_1_author), getString(R.string.bacchus_1_founder)));
        bacchus.add (new Bacchus (getString(R.string.bacchus_2_name), R.drawable.image_2, getString(R.string.bacchus_2_description), getString(R.string.bacchus_2_author), getString(R.string.bacchus_2_founder)));
        bacchus.add (new Bacchus (getString(R.string.bacchus_3_name), R.drawable.image_3, getString(R.string.bacchus_3_description), getString(R.string.bacchus_3_author), getString(R.string.bacchus_3_founder)));

        // Create a new {@link ArrayAdapter} of earthquakes
        BacchusAdapter adapter = new BacchusAdapter (getActivity (), bacchus);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        listView.setAdapter (adapter);

        return rootView;
    }
}

