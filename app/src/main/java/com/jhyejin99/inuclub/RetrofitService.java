package com.jhyejin99.inuclub;

import com.jhyejin99.inuclub.Settings.Login;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
public interface RetrofitService {

    @FormUrlEncoded
    @POST("/login/")
    Call<Login> login(@Field("userId") String userId, @Field("password") String password);
}
