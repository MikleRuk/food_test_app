package com.example.foodtestapp

import com.google.gson.annotations.SerializedName


data class DataClassCategories(val categories : List<CategoriesListItem>)


data class CategoriesListItem(
    @SerializedName("image_url")
    val id: Int,
    @SerializedName("image_url")
    val name: String,
    @SerializedName("image_url")
    val image_url: String
)

