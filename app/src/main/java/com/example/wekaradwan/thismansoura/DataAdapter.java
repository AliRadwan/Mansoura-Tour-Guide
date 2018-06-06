package com.example.wekaradwan.thismansoura;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by weka radwan on 2/15/2018.
 */


/**
 * Data adapter class that will take the text form  Data class and set it to listView.
 */
public class DataAdapter extends ArrayAdapter<Data> {
    /**
     * @param context the current content of the activity .
     * @param datas   the object of Data that will display the text.
     */
    public DataAdapter(@NonNull Context context, @NonNull ArrayList<Data> datas) {
        super(context, 0, datas);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if an existing view is being reused, otherwise inflate the view
        View listItem = convertView;

        if (listItem == null) {
            listItem = LayoutInflater.from(getContext()).inflate(R.layout.list_items, parent, false);
        }

        //Get the Word object {currentData} and locate at this position in the list.
        Data currentData = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID bigText.
        TextView bigTextView = (TextView) listItem.findViewById(R.id.bigText);

        //Get the text from the currentData object and set it to bigText.
        bigTextView.setText(currentData.getBigText());

        // Find the TextView in the list_item.xml layout with the ID smallText.
        TextView smallTextView = (TextView) listItem.findViewById(R.id.smallText);

        //Get the text from the currentData object and set it to bigText.
        smallTextView.setText(currentData.getSmallText());

        // Find the ImageView in the list_item.xml layout with the ID allImage.
        ImageView imageView = (ImageView) listItem.findViewById(R.id.allImage);

        //Get the image from the currentData object and set it to allImage.
        imageView.setImageResource(currentData.getImage());

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in the ListView.
        return listItem;
    }
}
