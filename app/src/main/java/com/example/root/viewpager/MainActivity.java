package com.example.root.viewpager;

import android.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/**
 * 问题列表:
 * 1.FragmentPagerAdapter的实现
 * 结论:需要搞继续清楚pagerAdapter各个回调的调用逻辑.
 */

public class MainActivity extends AppCompatActivity {

    private ViewPager viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewpager = (ViewPager) findViewById(R.id.viewPager);
    }

    public void onClick(View view) {
        FragmentManager fm = getFragmentManager();
        viewpager.setAdapter(new MyFragmentPagerAdapter(fm));
    }
}
