package com.csci38004.assignment5.domain;

import com.csci38004.assignment5.data.ServiceHelper;
import com.csci38004.assignment5.data.model.Categories;
import com.csci38004.assignment5.data.model.CategoriesResponseModel;
import com.csci38004.assignment5.data.model.CategoryIcon;
import com.csci38004.assignment5.data.model.CategoryItem;
import com.csci38004.assignment5.presentation.model.PresentationCategory;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import okhttp3.MediaType;
import okhttp3.ResponseBody;
import retrofit2.Response;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GetCategoriesTaskTest {

    @Mock
    private ServiceHelper serviceHelper;
    @Mock
    private GetCategoriesTask.Listener listener;

    private GetCategoriesTask task;

    @Before
    public void setUp() {
        task = new GetCategoriesTask(serviceHelper, listener);
    }

    @Test
    public void doInBackground_returnsEmptyList_onUnsuccessfulResponse() {
        final ResponseBody body = ResponseBody.create(MediaType.parse("application/json"), "");
        final Response<CategoriesResponseModel> response = Response.error(404, body);
        when(serviceHelper.getCategoriesResponse()).thenReturn(response);

        final List<PresentationCategory> presentationCategories = task.doInBackground(null);

        // Note how we can create a {@link Response<CategoriesResponseModel>} as we like
        // in order to test {@link GetCategoriesTask#doInBackground(Void...)}'s behavior.
        // When serviceHelper.getCategoriesResponse() gets called, we mock it to return our fake Response.
        // When we have an unsuccessful response, we expect an empty list.

        // Assert that the list above is empty.
    }

    @Test
    public void doInBackground_returnsEmptyList_onNoCategoryItems() {
        final CategoriesResponseModel responseModel = new CategoriesResponseModel();
        final Categories categories = new Categories();
        responseModel.setCategories(categories);
        final Response<CategoriesResponseModel> response = Response.success(responseModel);
        when(serviceHelper.getCategoriesResponse()).thenReturn(response);

        final List<PresentationCategory> presentationCategories = task.doInBackground(null);

        // When we have a successful response, but with no category items, we expect an empty list.

        // Assert that the list above is empty.
    }

    @Test
    public void doInBackground_returnsPresentationCategories_onCategoryItems() {
        final CategoriesResponseModel responseModel = new CategoriesResponseModel();
        final Categories categories = new Categories();
        final CategoryItem item = new CategoryItem();
        final CategoryIcon icon = new CategoryIcon();
        icon.setUrl("url");
        final List<CategoryIcon> icons = new ArrayList<>();
        icons.add(icon);
        item.setName("name");
        item.setIcons(icons);
        final List<CategoryItem> items = new ArrayList<>();
        items.add(item);
        categories.setItems(items);
        responseModel.setCategories(categories);
        final Response<CategoriesResponseModel> response = Response.success(responseModel);
        when(serviceHelper.getCategoriesResponse()).thenReturn(response);

        final List<PresentationCategory> presentationCategories = task.doInBackground(null);

        // When we have a successful response with one category item, we expect a list of
        // {@link PresentationCategory}'s with one item, with getName() equal to "name", and
        // getImageUrl() equal to "url".

        // Assert the following:
        //      - the list above is has one item
        //      - the one item's getName() method returns a String equal to "name"
        //      - the one item's getImageUrl() method returns a String equal to "url"
    }

}