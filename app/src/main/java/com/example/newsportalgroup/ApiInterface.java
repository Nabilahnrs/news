package com.example.newsportalgroup;

import android.app.DownloadManager;

public class ApiInterface {
    String BASE_URL="https://newsapi.org/v2/";

    @GET("top-headlines")
    Call<mainnews> getNews(
        @Query("country") String country,
        @Query("pageSize") int pagesize,
        @Query("apikey") String apikey

    );
    @GET("top-headlines")
    Call<mainnews> getCategoryNews(
            @Query("country") String country,
            @Query("category") String category,
            @Query("pageSize") int pagesize,
            @Query("apikey") String apikey

            );
}
