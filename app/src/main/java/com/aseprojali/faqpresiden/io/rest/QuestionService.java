package com.aseprojali.faqpresiden.io.rest;

import android.content.Context;
import android.util.Log;

import com.aseprojali.faqpresiden.io.RestClient;
import com.aseprojali.faqpresiden.io.constant.ApiConstant;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by avew on 3/6/15.
 */
public class QuestionService {

    private Context context;

    public QuestionService(Context context) {
        this.context = context;
    }

    public void getAll() {
        RestClient.get().getQuestions(ApiConstant.API_KEY, new Callback<String>() {
            @Override
            public void success(String s, Response response) {
                Log.d("Responya adalah ", s);
            }

            @Override
            public void failure(RetrofitError error) {

            }
        });
    }
}
