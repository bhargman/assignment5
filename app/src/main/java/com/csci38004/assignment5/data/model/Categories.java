package com.csci38004.assignment5.data.model;

import java.util.ArrayList;
import java.util.List;

public class Categories {

    public void setItems(List<CategoryItem> items) {
        this.items = items;
    }

    private List<CategoryItem> items;

    public List<CategoryItem> getItems() {
        return items == null ?
                new ArrayList<>() : new ArrayList<>(items);
    }
}
