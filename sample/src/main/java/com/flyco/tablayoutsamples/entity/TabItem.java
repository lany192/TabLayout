package com.flyco.tablayoutsamples.entity;

import com.flyco.tablayout.listener.TabEntity;

public class TabItem implements TabEntity {
    public String title;
    public int selectedIcon;
    public int unSelectedIcon;

    public TabItem(String title, int selectedIcon, int unSelectedIcon) {
        this.title = title;
        this.selectedIcon = selectedIcon;
        this.unSelectedIcon = unSelectedIcon;
    }

    @Override
    public String getTabTitle() {
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
