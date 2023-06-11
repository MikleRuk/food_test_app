package Categories

import com.google.gson.annotations.SerializedName

@kotlinx.serialization.Serializable
data class DataClassCategories(

    @SerializedName("сategories" ) var сategories : ArrayList<CategoriesListItem> = arrayListOf()



)

@kotlinx.serialization.Serializable
data class CategoriesListItem(



    @SerializedName("id"        ) var id       : Int?    = null,
    @SerializedName("name"      ) var name     : String? = null,
    @SerializedName("image_url" ) var imageUrl : String? = null

)





