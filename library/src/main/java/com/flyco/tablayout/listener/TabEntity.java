package com.flyco.tablayout.listener;

import android.text.SpannableString;

import androidx.annotation.DrawableRes;

public interface TabEntity {
    /**
     * 标题
     */
    SpannableString getTabTitle();

    /**
     * 选中的图标
     */
    @DrawableRes
    int getTabSelectedIcon();

    /**
     * 未选中的图标
     */
    @DrawableRes
    int getTabUnselectedIcon();
}