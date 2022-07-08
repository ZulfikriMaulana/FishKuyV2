package com.example.fishkuy.data.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiResponse {
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://mbkmfish.artahu.shop/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public ApiServices apiInstance(){
        return retrofit.create(ApiServices.class);
    }

}
