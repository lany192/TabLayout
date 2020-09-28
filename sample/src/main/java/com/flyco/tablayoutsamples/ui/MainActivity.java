package com.flyco.tablayoutsamples.ui;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.flyco.tablayoutsamples.adapter.SimpleHomeAdapter;

public class MainActivity extends AppCompatActivity {
    private final String[] mItems = {"PagerTabLayout-ViewPager", "CommonTabLayout", "SegmentTabLayout", "PagerTabLayout-ViewPager2"};
    private final Class<?>[] mClasses = {SlidingTabActivity.class, CommonTabActivity.class,
            SegmentTabActivity.class, PagerTabActivity.class};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView lv = new ListView(this);
        lv.setCacheColorHint(Color.TRANSPARENT);
        lv.setFadingEdgeLength(0);
        lv.setAdapter(new SimpleHomeAdapter(this, mItems));

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, mClasses[position]);
                startActivity(intent);
            }
        });

        setContentView(lv);
    }
}
