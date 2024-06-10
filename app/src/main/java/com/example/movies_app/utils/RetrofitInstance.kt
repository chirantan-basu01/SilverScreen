package com.example.movies_app.utils

import com.example.movies_app.domain.ApiInterface
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    val api: ApiInterface by lazy {
        Retrofit.Builder().baseUrl(Util.Base).addConverterFactory(GsonConverterFactory.create())
            .build().create(ApiInterface::class.java)
    }
}

