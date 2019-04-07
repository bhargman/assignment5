package com.csci38004.assignment5.data;

import com.csci38004.assignment5.data.model.CategoriesResponseModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface SpotifyService {

    /**
     * NOTE: Your API_KEY will expire every hour, so if you get a '401 Unauthorized' response error,
     * then make sure to generate a new API_KEY following the steps in Part 1 of the readme file!
     */
    String API_KEY = "";

    @Headers("Authorization: Bearer " + API_KEY)
    @GET("/v1/browse/categories")
    Call<CategoriesResponseModel> getCategories();
}
