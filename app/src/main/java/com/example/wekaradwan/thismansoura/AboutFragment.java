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
public class AboutFragment extends Fragment {

    public AboutFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //Create object from View Class that 'll inflate the information_list XML .
        View rootView = inflater.inflate(R.layout.information_list, container, false);

        //Create list of datas
        final ArrayList<Data> datas = new ArrayList<Data>();
        datas.add(new Data(R.string.about_title, R.string.about_content, R.drawable.aboutmansoura));

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
