package com.example.wekaradwan.thismansoura;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by weka radwan on 2/14/2018.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mcontext;

    /***
     * @param context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter across swipes.
     */
    public ViewPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mcontext = context;
    }

    /**
     * @param position have the number of the view pager
     *                 Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AboutFragment();
        } else if (position == 1) {
            return new RestaurantFragment();
        } else if (position == 2) {
            return new HotelFragment();
        } else if (position == 3) {
            return new ShoppingFragment();
        } else {
            return new SightsFragment();
        }
    }

    /**
     * @return the total number of pages.
     */
    @Override
    public int getCount() {
        return 5;
    }

    /**
     * connect the viewpager with the tabLayout
     */
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mcontext.getString(R.string.category_about);
        } else if (position == 1) {
            return mcontext.getString(R.string.category_restaurant);
        } else if (position == 2) {
            return mcontext.getString(R.string.category_hotel);
        } else if (position == 3) {
            return mcontext.getString(R.string.category_shopping);
        } else {
            return mcontext.getString(R.string.category_sights);
        }
    }
}
