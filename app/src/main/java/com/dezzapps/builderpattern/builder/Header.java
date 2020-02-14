package com.dezzapps.builderpattern.builder;

public abstract class Header  implements LayoutView{

    @Override
    public Shading shading() {
        return new HeaderShading();
    }
}

