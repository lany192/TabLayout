package com.flyco.tablayoutsamples.entity;

import android.text.SpannableString;

import com.flyco.tablayout.listener.TabEntity;

public class TabItem implements TabEntity {
    protected SpannableString title;
    protected int selectedIcon;
    protected int unSelectedIcon;

    public TabItem(String title, int selectedIcon, int unSelectedIcon) {
        this.title = new SpannableString(title);
        this.selectedIcon = selectedIcon;
        this.unSelectedIcon = unSelectedIcon;
    }

    public TabItem(CharSequence title, int selectedIcon, int unSelectedIcon) {
        this.title = new SpannableString(title);
        this.selectedIcon = selectedIcon;
        this.unSelectedIcon = unSelectedIcon;
    }

    public TabItem(SpannableString title, int selectedIcon, int unSelectedIcon) {
        this.title = title;
        this.selectedIcon = selectedIcon;
        this.unSelectedIcon = unSelectedIcon;
    }

    @Override
    public SpannableString getTabTitle() {
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
