package com.example.foodtestapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.android.volley.Request.Method.GET
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.foodtestapp.databinding.ActivityMainBinding
import com.google.gson.Gson
import com.squareup.picasso.Request
import kotlinx.coroutines.launch
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import retrofit2.Response


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val categoriesApi = RetrofitHelper.getInstance().create(CategoriesApi::class.java)

        lifecycleScope.launch {
//            val result = categoriesApi.getCategories()
//            if (result != null)
//                Log.d("ayush: ", result.body().toString())

            val response: Response<DataClassCategories> = categoriesApi.getCategories()
            val dataClassCategories: DataClassCategories? = response.body()
            val categoriesList = dataClassCategories?.сategories
            val categoriesJson = Json.encodeToString(categoriesList)
            val deserializedCategoriesList =
                Json.decodeFromString<List<CategoriesListItem>>(categoriesJson)
            for (i in 0 until deserializedCategoriesList.size) {
                when (i) {
                    0 -> {
                        val category = deserializedCategoriesList[i]
                        val id: Int? = category.id
                        val name: String? = category.name
                        val image_url: String? = category.imageUrl
                        binding.tvImb1.text = name
                    }
                    1 -> {
                        val category = deserializedCategoriesList[i]
                        val id: Int? = category.id
                        val name: String? = category.name
                        val image_url: String? = category.imageUrl
                        binding.tvImb2.text = name
                    }
                    2 -> {
                        val category = deserializedCategoriesList[i]
                        val id: Int? = category.id
                        val name: String? = category.name
                        val image_url: String? = category.imageUrl
                        binding.tvImb3.text = name
                    }
                    3 -> {val category = deserializedCategoriesList[i]
                        val id: Int? = category.id
                        val name: String? = category.name
                        val image_url: String? = category.imageUrl
                        binding.tvImb4.text = name}
                }
            }
        }
    }


    fun go_to_the_categories(view: View) {
        val intent = Intent(this, categories_activity::class.java)
        startActivity(intent)
    }


}




