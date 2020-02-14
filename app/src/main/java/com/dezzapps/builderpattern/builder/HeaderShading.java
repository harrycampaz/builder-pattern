package com.dezzapps.builderpattern.builder;

import com.dezzapps.builderpattern.R;

public class HeaderShading implements Shading {
    @Override
    public int shade() {
        return R.color.text_primary_dark;
    }

    @Override
    public int background() {
        return R.color.text_background;
    }
}
