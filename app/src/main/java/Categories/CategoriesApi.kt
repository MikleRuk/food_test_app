package Categories

import retrofit2.Response
import retrofit2.http.GET

interface CategoriesApi {
    @GET("/v3/058729bd-1402-4578-88de-265481fd7d54")
    suspend fun getCategories() : Response<DataClassCategories>
}