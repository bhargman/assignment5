package com.csci38004.assignment5.domain;

import com.csci38004.assignment5.data.model.CategoryItem;

import java.util.Random;

class CategoryItemUtil {

    static String getRandomCategoryIconUrl(CategoryItem categoryItem) {
        final Random random = new Random();
        return categoryItem.getIcons().isEmpty() ?
                "" :
                categoryItem.getIcons().get(random.nextInt(categoryItem.getIcons().size())).getUrl();
    }
}
