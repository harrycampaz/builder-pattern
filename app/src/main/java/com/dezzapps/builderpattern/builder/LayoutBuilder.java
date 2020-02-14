package com.dezzapps.builderpattern.builder;

import java.util.ArrayList;
import java.util.List;

public class LayoutBuilder {


    public List<LayoutView> displaySimple(){
        List<LayoutView> views = new ArrayList<LayoutView>();
        views.add(new HeadLine());
        views.add(new SimpleContent());

        return views;
    }

    public List<LayoutView> displayDetailed(){
        List<LayoutView> views = new ArrayList<LayoutView>();
        views.add(new HeadLine());
        views.add(new SubHeadLine());
        views.add(new DetailedContent());

        return views;
    }

}
