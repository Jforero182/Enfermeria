package com.example.notasenfermeria;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

interface MyApi {
    @FormUrlEncoded
    @POST("https://www.projectionlife.com.co:8446/login/loginUser")
    default Call<LoginActivity> loginUser(
            @Field("User") String user,
            @Field("Password") String password
    ) {
        return null;
    }

    @GET("https://www.projectionlife.com.co:8446/processManager/getAllAlmacenMedicamentos")
    default Call<RegistroMedicamento>getApiData(
    )
    {
        return null;
    }
}