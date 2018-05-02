package com.example.android.bacchusguideapp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class BacchusAdapter extends ArrayAdapter<Bacchus> {

    private final ArrayList<Bacchus> bacchus;

    /**
     * Constructs a new {@link BacchusAdapter}.
     *
     * @param context of the app
     * @param bacchus is the list of earthquakes, which is the data source od the adapter
     */
    public BacchusAdapter(Context context, ArrayList<Bacchus> bacchus) {
        super (context, 0, bacchus);
        this.bacchus = bacchus;
    }

    @Nullable
    @Override
    public Bacchus getItem(final int position) {
        return bacchus.get(position);
    }

    // Set the adapter on the {@link ListView}
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Check if there is an existing list item view (called ConvertView) that we can reuse.
        //otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from (getContext ()).inflate (R.layout.bacchus_fragment_list_item, parent, false);
        }

        //Find the Bacchus at the given position in the list of bacchus
        Bacchus currentBacchus = getItem (position);

        //Find the TextView with view ID name
        TextView nameView = (TextView) listItemView.findViewById (R.id.bacchus_name);
        //Display the name of the current Bacchus in the TextView
        nameView.setText (currentBacchus.getName ());

        //Find the ImageView in the list_item.xml layout with the ID image
        ImageView imageView = (ImageView) listItemView.findViewById (R.id.image);
        //Display the image of the current Bacchus in the ImageView
        imageView.setImageResource (currentBacchus.getImageResourceId ());

        //Find the TextView with view ID description
        TextView descriptionView = (TextView) listItemView.findViewById (R.id.bacchus_description);
        //Display the description of the current Bacchus in the TextView
        descriptionView.setText (currentBacchus.getDescription ());

        //Find the TextView with view ID author
        TextView authorView = (TextView) listItemView.findViewById (R.id.bacchus_author);
        //Display the author of the current Bacchus in the TextView
        authorView.setText (currentBacchus.getAuthor ());

        //Find the TextView with view ID founder
        TextView founderView = (TextView) listItemView.findViewById (R.id.bacchus_founder);
        //Display the founder of the current Bacchus in the TextView
        founderView.setText (currentBacchus.getFounder ());

        //Return the list item view that is now showing the appropriate dtae
        return listItemView;
    }
}

