package com.flyco.tablayoutsamples.ui;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.flyco.tablayoutsamples.adapter.SimpleHomeAdapter;

public class SimpleHomeActivity extends AppCompatActivity {
    private final String[] mItems = {"SlidingTabLayout", "CommonTabLayout", "SegmentTabLayout"};
    private final Class<?>[] mClasses = {SlidingTabActivity.class, CommonTabActivity.class,
            SegmentTabActivity.class};

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
                Intent intent = new Intent(SimpleHomeActivity.this, mClasses[position]);
                startActivity(intent);
            }
        });

        setContentView(lv);
    }
}
