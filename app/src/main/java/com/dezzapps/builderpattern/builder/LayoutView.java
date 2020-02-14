package com.dezzapps.builderpattern.builder;

import android.view.ViewGroup;

public interface LayoutView {

    int textSize();
    int content();
    Shading shading();
    int [] padding();

    ViewGroup.LayoutParams layoutParams();
}
