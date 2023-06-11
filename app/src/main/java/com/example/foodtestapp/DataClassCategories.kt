package com.example.foodtestapp

import com.google.gson.annotations.SerializedName

@kotlinx.serialization.Serializable
data class DataClassCategories(
//    val categories: List<CategoriesListItem>
    @SerializedName("сategories" ) var сategories : ArrayList<CategoriesListItem> = arrayListOf()



)

@kotlinx.serialization.Serializable
data class CategoriesListItem(

//    val id: Int,
//    val name: String,
//    val image_url: String


    @SerializedName("id"        ) var id       : Int?    = null,
    @SerializedName("name"      ) var name     : String? = null,
    @SerializedName("image_url" ) var imageUrl : String? = null

)





