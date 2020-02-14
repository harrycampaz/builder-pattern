package com.dezzapps.builderpattern.builder;

import android.view.ViewGroup;

import com.dezzapps.builderpattern.R;

public class DetailedContent extends Content {
    @Override
    public int textSize() {
        return 14;
    }

    @Override
    public int content() {
        return R.string.long_text;
    }

    @Override
    public int[] padding() {
        return new int[] {16, 16,16, 16};
    }

    @Override
    public ViewGroup.LayoutParams layoutParams() {
        final int width = ViewGroup.LayoutParams.MATCH_PARENT;
        final int height = ViewGroup.LayoutParams.WRAP_CONTENT;
        return new ViewGroup.LayoutParams(width, height);
    }
}
