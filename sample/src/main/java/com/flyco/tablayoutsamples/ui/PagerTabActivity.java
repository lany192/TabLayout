package com.flyco.tablayoutsamples.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.flyco.tablayout.PagerTabLayout;
import com.flyco.tablayout.listener.OnTabListener;
import com.flyco.tablayout.widget.MsgView;
import com.flyco.tablayoutsamples.R;
import com.flyco.tablayoutsamples.utils.ViewFindUtils;

import java.util.ArrayList;
import java.util.List;

public class PagerTabActivity extends AppCompatActivity implements OnTabListener {
    private List<Fragment> mFragments = new ArrayList<>();
    private final String[] mTitles = {"精选", "轻读", "排行", "分类", "自定义", "设计", "工具资源"};
    private MyPagerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pager_tab);
        for (String title : mTitles) {
            mFragments.add(SimpleCardFragment.getInstance(title));
        }
        View decorView = getWindow().getDecorView();
        ViewPager2 viewPager2 = ViewFindUtils.find(decorView, R.id.vp);
        mAdapter = new MyPagerAdapter(this);
        viewPager2.setAdapter(mAdapter);

        /** 默认 */
        PagerTabLayout tabLayout_1 = ViewFindUtils.find(decorView, R.id.tl_1);
        /**自定义部分属性*/
        PagerTabLayout tabLayout_2 = ViewFindUtils.find(decorView, R.id.tl_2);
        /** 字体加粗,大写 */
        PagerTabLayout tabLayout_3 = ViewFindUtils.find(decorView, R.id.tl_3);
        /** tab固定宽度 */
        PagerTabLayout tabLayout_4 = ViewFindUtils.find(decorView, R.id.tl_4);
        /** indicator固定宽度 */
        PagerTabLayout tabLayout_5 = ViewFindUtils.find(decorView, R.id.tl_5);
        /** indicator圆 */
        PagerTabLayout tabLayout_6 = ViewFindUtils.find(decorView, R.id.tl_6);
        /** indicator矩形圆角 */
        final PagerTabLayout tabLayout_7 = ViewFindUtils.find(decorView, R.id.tl_7);
        /** indicator三角形 */
        PagerTabLayout tabLayout_8 = ViewFindUtils.find(decorView, R.id.tl_8);
        /** indicator圆角色块 */
        PagerTabLayout tabLayout_9 = ViewFindUtils.find(decorView, R.id.tl_9);
        /** indicator圆角色块 */
        PagerTabLayout tabLayout_10 = ViewFindUtils.find(decorView, R.id.tl_10);

        tabLayout_1.setViewPager2(viewPager2, mTitles);
        tabLayout_2.setViewPager2(viewPager2, mTitles);
        tabLayout_2.setOnTabSelectListener(this);
        tabLayout_3.setViewPager2(viewPager2, mTitles);
        tabLayout_4.setViewPager2(viewPager2, mTitles);
        tabLayout_5.setViewPager2(viewPager2, mTitles);
        tabLayout_6.setViewPager2(viewPager2, mTitles);
        tabLayout_7.setViewPager2(viewPager2, mTitles);
        tabLayout_8.setViewPager2(viewPager2, mTitles);
        tabLayout_9.setViewPager2(viewPager2, mTitles);
        tabLayout_10.setViewPager2(viewPager2, mTitles);

        viewPager2.setCurrentItem(4);

        tabLayout_1.showDot(4);
        tabLayout_3.showDot(4);
        tabLayout_2.showDot(4);

        tabLayout_2.showMsg(3, 5);
        tabLayout_2.setMsgMargin(3, 0, 10);
        MsgView rtv_2_3 = tabLayout_2.getMsgView(3);
        if (rtv_2_3 != null) {
            rtv_2_3.setBackgroundColor(Color.parseColor("#6D8FB0"));
        }

        tabLayout_2.showMsg(5, 5);
        tabLayout_2.setMsgMargin(5, 0, 10);
    }

    @Override
    public void onSelected(int position) {
        Toast.makeText(this, "onTabSelect&position--->" + position, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onUnselected(int position) {
        Toast.makeText(this, "onTabReselect&position--->" + position, Toast.LENGTH_SHORT).show();
    }

    private class MyPagerAdapter extends FragmentStateAdapter {

        public MyPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        public MyPagerAdapter(@NonNull Fragment fragment) {
            super(fragment);
        }

        public MyPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
            super(fragmentManager, lifecycle);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            return mFragments.get(position);
        }

        @Override
        public int getItemCount() {
            return mFragments.size();
        }
    }
}
