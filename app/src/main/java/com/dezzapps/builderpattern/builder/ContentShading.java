package com.dezzapps.builderpattern.builder;

import com.dezzapps.builderpattern.R;

public class ContentShading implements Shading {
    @Override
    public int shade() {
        return R.color.text_secondary_dark;
    }

    @Override
    public int background() {
        return R.color.text_content_dark;
    }
}
