package com.csci38004.assignment5.domain;

import android.os.AsyncTask;

import com.csci38004.assignment5.data.ServiceHelper;
import com.csci38004.assignment5.data.model.CategoriesResponseModel;
import com.csci38004.assignment5.data.model.CategoryItem;
import com.csci38004.assignment5.presentation.model.PresentationCategory;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Response;

public class GetCategoriesTask extends AsyncTask<Void, Void, List<PresentationCategory>> {

    private final ServiceHelper serviceHelper;
    private final Listener listener;

    GetCategoriesTask(ServiceHelper serviceHelper,
                      Listener listener) {
        this.serviceHelper = serviceHelper;
        this.listener = listener;
    }

    public interface Listener {
        void updateUI(List<PresentationCategory> presentationCategories);
    }

    @Override
    protected List<PresentationCategory> doInBackground(Void... voids) {
        final Response<CategoriesResponseModel> response = serviceHelper.getCategoriesResponse();
        if (response.isSuccessful()) {
            final List<CategoryItem> items = response.body().getCategories().getItems();
            final List<PresentationCategory> presentationCategories = new ArrayList<>();
            for (CategoryItem item : items) {
                final PresentationCategory presentationCategory = new PresentationCategory(item.getName(), CategoryItemUtil.getRandomCategoryIconUrl(item));
                presentationCategories.add(presentationCategory);
            }
            return presentationCategories;
        }

        return new ArrayList<>();
    }

    @Override
    protected void onPostExecute(List<PresentationCategory> presentationCategories) {
        listener.updateUI(presentationCategories);
    }
}
