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
public class ShoppingFragment extends Fragment {


    public ShoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //Create object from View Class that 'll inflate the information_list XML .
        View rootView = inflater.inflate(R.layout.information_list, container, false);

        //Create list of datas
        final ArrayList<Data> datas = new ArrayList<Data>();
        datas.add(new Data(R.string.shopping_title_1, R.string.shopping_content_1, R.drawable.downtown));
        datas.add(new Data(R.string.shopping_title_2, R.string.shopping_content_2, R.drawable.gamaa));
        datas.add(new Data(R.string.shopping_title_3, R.string.shopping_content_3, R.drawable.xbox));
        datas.add(new Data(R.string.shopping_title_4, R.string.shopping_content_4, R.drawable.carrefour));
        datas.add(new Data(R.string.shopping_title_5, R.string.shopping_content_5, R.drawable.pen));
        datas.add(new Data(R.string.shopping_title_6, R.string.shopping_content_6, R.drawable.rivan));
        datas.add(new Data(R.string.shopping_title_7, R.string.shopping_content_7, R.drawable.newborn));
        datas.add(new Data(R.string.shopping_title_8, R.string.shopping_content_8, R.drawable.townteam));

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
