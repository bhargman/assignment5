package com.csci38004.assignment5.domain;

import com.csci38004.assignment5.data.model.CategoryIcon;
import com.csci38004.assignment5.data.model.CategoryItem;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CategoryItemUtilTest {

    @Test
    public void categoryItem_withNoCategoryIcon_returnEmptyUrlString() {
        final CategoryItem item = new CategoryItem();

        // Note how we can create a {@link CategoryItem} as we like in order to test
        // {@link CategoryItemUtil#getRandomCategoryIconUrl(CategoryItem)}'s behavior.
        // When we send a {@link CategoryItem} with no icons, we expect an empty String.
        assertEquals("", CategoryItemUtil.getRandomCategoryIconUrl(item));
    }

    @Test
    public void categoryItem_withOneCategoryIcon_returnsNonEmptyUrlString() {
        final CategoryItem item = new CategoryItem();
        final CategoryIcon icon = new CategoryIcon();
        icon.setUrl("url");
        final List<CategoryIcon> icons = new ArrayList<>();
        icons.add(icon);
        item.setIcons(icons);

        // Assert that {@link CategoryItemUtil#getRandomCategoryIconUrl(CategoryItem)} returns a
        // String equal to "url" when passing the above {@link CategoryItem}, which has one icon.
    }
}