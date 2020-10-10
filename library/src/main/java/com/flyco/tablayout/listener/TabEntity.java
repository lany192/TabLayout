package com.flyco.tablayout.listener;

import androidx.annotation.DrawableRes;

public interface TabEntity {
    /**
     * 标题
     */
    CharSequence getTabTitle();

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