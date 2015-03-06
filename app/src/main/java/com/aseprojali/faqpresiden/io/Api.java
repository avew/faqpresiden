package com.aseprojali.faqpresiden.io;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by avew on 3/6/15.
 */
public interface Api {

    @GET("/faq-presiden/api/questions")
    void getQuestions(
            @Query("apiKey") String apiKey,
            Callback<String> callbackstr);
}
