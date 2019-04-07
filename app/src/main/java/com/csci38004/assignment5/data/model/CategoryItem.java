package com.csci38004.assignment5.data.model;

import java.util.ArrayList;
import java.util.List;

public class CategoryItem {

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIcons(List<CategoryIcon> icons) {
        this.icons = icons;
    }

    private String id;
    private String name;
    private List<CategoryIcon> icons;

    public String getName() {
        return name;
    }

    public List<CategoryIcon> getIcons() {
        return icons == null ?
                new ArrayList<>() : new ArrayList<>(icons);
    }

    public String getId() {
        return id;
    }
}
