package com.aseprojali.faqpresiden.io;

import com.aseprojali.faqpresiden.io.constant.ApiConstant;
import com.aseprojali.faqpresiden.io.converter.StringConverter;

import retrofit.RestAdapter;
import retrofit.client.OkClient;

/**
 * Created by avew on 3/6/15.
 */
public class RestClient {

    private static Api REST_CLIENT;

    static {
        setUpRestClient();
    }

    private RestClient() {
    }

    public static Api get() {
        return REST_CLIENT;
    }

    private static void setUpRestClient() {
        RestAdapter.Builder builder = new RestAdapter.Builder()
                .setEndpoint(ApiConstant.BASE_URL)
                .setClient(new OkClient())
                .setConverter(new StringConverter())
                .setLogLevel(RestAdapter.LogLevel.FULL);

        RestAdapter restAdapter = builder.build();
        REST_CLIENT = restAdapter.create(Api.class);
    }
}
