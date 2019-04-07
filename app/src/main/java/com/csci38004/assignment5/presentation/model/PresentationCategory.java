package com.csci38004.assignment5.presentation.model;

public class PresentationCategory {
    private final String name;
    private final String imageUrl;

    public PresentationCategory(String name, String imageUrl) {
        this.name = name;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
