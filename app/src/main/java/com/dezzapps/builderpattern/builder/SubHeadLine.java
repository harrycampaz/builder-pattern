package com.dezzapps.builderpattern.builder;

import android.view.ViewGroup;

import com.dezzapps.builderpattern.R;

public class SubHeadLine extends Header {
    @Override
    public int textSize() {
        return 18;
    }

    @Override
    public int content() {
        return R.string.subheadline;
    }

    @Override
    public int[] padding() {
        return new int[]{32, 8,16,8};
    }

    @Override
    public ViewGroup.LayoutParams layoutParams() {
        final int width = ViewGroup.LayoutParams.MATCH_PARENT;
        final int height = ViewGroup.LayoutParams.WRAP_CONTENT;
        return new ViewGroup.LayoutParams(width, height);
    }
}
