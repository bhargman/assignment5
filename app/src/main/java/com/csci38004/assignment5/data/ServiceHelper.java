package com.csci38004.assignment5.data;


import com.csci38004.assignment5.data.model.CategoriesResponseModel;

import java.io.IOException;

import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceHelper {

    private static SpotifyService getSpotifyService() {
        return new Retrofit.Builder()
                .baseUrl("https://api.spotify.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(SpotifyService.class);
    }

    public Response<CategoriesResponseModel> getCategoriesResponse() {
        try {
            return getSpotifyService()
                    .getCategories()
                    .execute();
        } catch (IOException e) {
            return null;
        }
    }
}
