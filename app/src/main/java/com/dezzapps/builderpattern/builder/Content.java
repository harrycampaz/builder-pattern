package com.dezzapps.builderpattern.builder;

public abstract class Content  implements LayoutView{

    @Override
    public Shading shading() {
        return new ContentShading();
    }
}
