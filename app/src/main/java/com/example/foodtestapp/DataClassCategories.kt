package com.example.foodtestapp

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable


@Serializable
data class DataClassCategories(
    val id: Int,
    val name: String,
    @SerializedName("image_url")
    val image_url: String
)

