package com.example.root.viewpager;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by haichen.cui on 17-2-7.
 */

public class MyFragmentPagerAdapter extends PagerAdapter {
    Fragment[] frags = {new Fragment1(), new Fragment2()};
    FragmentManager fm;

    public MyFragmentPagerAdapter(FragmentManager fm) {
        this.fm = fm;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return ((Fragment) object).getView() == view;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        Fragment frag = frags[position];
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(container.getId(), frag);
        ft.commit();
        return frag;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        Fragment frag = frags[position];
        FragmentTransaction ft = fm.beginTransaction();
        ft.remove(frag);
    }
}
