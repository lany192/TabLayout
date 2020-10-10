package com.flyco.tablayout.utils;

import android.text.SpannableString;

public class Utils {

    public static SpannableString[] convert(String[] titles) {
        SpannableString[] items = new SpannableString[titles.length];
        for (int i = 0; i < titles.length; i++) {
            items[i] = new SpannableString(titles[i]);
        }
        return items;
    }
}
