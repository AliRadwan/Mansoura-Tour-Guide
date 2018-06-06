package com.example.wekaradwan.thismansoura;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //Create object from View Class that 'll inflate the information_list XML .
        View rootView = inflater.inflate(R.layout.information_list, container, false);

        //Create list of datas
        final ArrayList<Data> datas = new ArrayList<Data>();
        datas.add(new Data(R.string.restaurant_title_1, R.string.restaurant_content_1, R.drawable.stereo));
        datas.add(new Data(R.string.restaurant_title_2, R.string.restaurant_content_2, R.drawable.spectra));
        datas.add(new Data(R.string.restaurant_title_3, R.string.restaurant_content_3, R.drawable.bermer));
        datas.add(new Data(R.string.restaurant_title_4, R.string.restaurant_content_4, R.drawable.ketchup));
        datas.add(new Data(R.string.restaurant_title_5, R.string.restaurant_content_5, R.drawable.sabbahi));
        datas.add(new Data(R.string.restaurant_title_6, R.string.restaurant_content_6, R.drawable.davinci));
        datas.add(new Data(R.string.restaurant_title_7, R.string.restaurant_content_7, R.drawable.fattoma));
        datas.add(new Data(R.string.restaurant_title_8, R.string.restaurant_content_8, R.drawable.elbakhl));
        datas.add(new Data(R.string.restaurant_title_9, R.string.restaurant_content_9, R.drawable.mcdonalds));
        datas.add(new Data(R.string.restaurant_title_10, R.string.restaurant_content_10, R.drawable.kfc));

        //Create object from wordAdapter called adapter .
        //this adapter will take the datas to link between activity and listView
        DataAdapter adapter = new DataAdapter(getActivity(), datas);

        //Create object from ListView call listview that 'll connect with the List XML file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        //linked between ListView object and the DataAdapter object
        //this 'll display each list item in the List view .
        listView.setAdapter(adapter);

        //return the View object
        return rootView;
    }
}
