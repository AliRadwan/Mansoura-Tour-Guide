package com.example.wekaradwan.thismansoura;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        // Create an adapter that knows which fragment should be shown on each page
        ViewPagerAdapter fregmentAdapter = new ViewPagerAdapter(this, getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(fregmentAdapter);

        // Find the tab layout that shows the tabs
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        // linked the tabLayout with the viewPager
        tabLayout.setupWithViewPager(viewPager);
        //set icon to each item of tab
        tabLayout.getTabAt(0).setIcon(R.drawable.about);
        tabLayout.getTabAt(1).setIcon(R.drawable.restuant);
        tabLayout.getTabAt(2).setIcon(R.drawable.hotel);
        tabLayout.getTabAt(3).setIcon(R.drawable.shopping);
        tabLayout.getTabAt(4).setIcon(R.drawable.sights);
    }
}
