package com.example.foodtestapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


interface ApiService {
    @GET("v3/058729bd-1402-4578-88de-265481fd7d54")
    suspend fun getDataClassForCategories(): DataClassCategories

}

    var retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://run.mocky.io/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    var restCategoriesApi =  retrofit.create(ApiService::class.java)


