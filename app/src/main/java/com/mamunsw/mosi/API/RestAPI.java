package com.mamunsw.mosi.API;

import com.mamunsw.mosi.Model.SinopsisModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RestAPI {

    @GET("Sinopsis/getdata")
    Call<SinopsisModel> getdataAll();

}
