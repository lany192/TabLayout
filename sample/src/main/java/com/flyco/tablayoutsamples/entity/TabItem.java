package com.flyco.tablayoutsamples.entity;

import com.flyco.tablayout.listener.TabEntity;

public class TabItem implements TabEntity {
    protected CharSequence title;
    protected int selectedIcon;
    protected int unSelectedIcon;

    public TabItem(CharSequence title, int selectedIcon, int unSelectedIcon) {
        this.title = title;
        this.selectedIcon = selectedIcon;
        this.unSelectedIcon = unSelectedIcon;
    }

    @Override
    public CharSequence getTabTitle() {
        return title;
    }

    @Override
    public int getTabSelectedIcon() {
        return selectedIcon;
    }

    @Override
    public int getTabUnselectedIcon() {
        return unSelectedIcon;
    }
}
