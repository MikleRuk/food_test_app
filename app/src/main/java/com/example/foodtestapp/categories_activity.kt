package com.example.foodtestapp

import Categories.CategoriesApi
import Categories.CategoriesListItem
import Categories.DataClassCategories
import Categories.RetrofitHelper
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.lifecycleScope
import com.example.foodtestapp.databinding.ActivityCategoriesBinding
import com.example.foodtestapp.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso
import dishes.DataClassDishes
import dishes.Dishes
import dishes.DishesApi
import kotlinx.coroutines.launch
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import retrofit2.Response

class categories_activity : AppCompatActivity() {

    lateinit var binding: ActivityCategoriesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategoriesBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val categoriesApi = RetrofitHelper.getInstance().create(DishesApi::class.java)

        lifecycleScope.launch {
            val response: Response<DataClassDishes> = categoriesApi.getDishes()
            val dataClassDishes: DataClassDishes? = response.body()
            val dishesList = dataClassDishes?.dishes
            val dishesJson = Json.encodeToString(dishesList)
            val json = Json { ignoreUnknownKeys = true }
            val deserializedDishesList =
                json.decodeFromString<List<Dishes>>(dishesJson)
            for (i in 0 until deserializedDishesList.size) {
                when (i) {
                    0 -> {
                        val category = deserializedDishesList[i]
                        val name: String? = category.name
                        val image_url: String? = category.imageUrl
                        binding.tvImbDish1.text = name
                        Picasso.get().load(image_url).into(binding.imBtnDish1)
                    }
                    1 -> {
                        val category = deserializedDishesList[i]
                        val name: String? = category.name
                        val image_url: String? = category.imageUrl
                        binding.tvImbDish2.text = name
                        Picasso.get().load(image_url).into(binding.imBtnDish2)
                    }
                    2 -> {
                        val category = deserializedDishesList[i]
                        val name: String? = category.name
                        val image_url: String? = category.imageUrl
                        binding.tvImbDish3.text = name
                        Picasso.get().load(image_url).into(binding.imBtnDish3)
                    }
                    3 -> {
                        val category = deserializedDishesList[i]
                        val name: String? = category.name
                        val image_url: String? = category.imageUrl
                        binding.tvImbDish4.text = name
                        Picasso.get().load(image_url).into(binding.imBtnDish4)
                    }
                    4 -> {
                        val category = deserializedDishesList[i]
                        val name: String? = category.name
                        val image_url: String? = category.imageUrl
                        binding.tvImbDish5.text = name
                        Picasso.get().load(image_url).into(binding.imBtnDish5)
                    }
                    5 -> {
                        val category = deserializedDishesList[i]
                        val name: String? = category.name
                        val image_url: String? = category.imageUrl
                        binding.tvImbDish6.text = name
                        Picasso.get().load(image_url).into(binding.imBtnDish6)
                    }
                    6 -> {
                        val category = deserializedDishesList[i]
                        val name: String? = category.name
                        val image_url: String? = category.imageUrl
                        binding.tvImbDish7.text = name
                        Picasso.get().load(image_url).into(binding.imBtnDish7)
                    }
                    7 -> {
                        val category = deserializedDishesList[i]
                        val name: String? = category.name
                        val image_url: String? = category.imageUrl
                        binding.tvImbDish8.text = name
                        Picasso.get().load(image_url).into(binding.imBtnDish8)
                    }
                    8 -> {
                        val category = deserializedDishesList[i]
                        val name: String? = category.name
                        val image_url: String? = category.imageUrl
                        binding.tvImbDish9.text = name
                        Picasso.get().load(image_url).into(binding.imBtnDish9)
                    }
                    9 -> {
                        val category = deserializedDishesList[i]
                        val name: String? = category.name
                        val image_url: String? = category.imageUrl
                        binding.tvImbDish10.text = name
                        Picasso.get().load(image_url).into(binding.imBtnDish10)
                    }
                    10 -> {
                        val category = deserializedDishesList[i]
                        val name: String? = category.name
                        val image_url: String? = category.imageUrl
                        binding.tvImbDish11.text = name
                        Picasso.get().load(image_url).into(binding.imBtnDish11)
                    }
                    11 -> {
                        val category = deserializedDishesList[i]
                        val name: String? = category.name
                        val image_url: String? = category.imageUrl
                        binding.tvImbDish12.text = name
                        Picasso.get().load(image_url).into(binding.imBtnDish12)
                    }


                }
            }
        }


    }


    fun go_back_to_the_main_activity(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun go_to_the_food_window_activity(view: View) {
        val intent = Intent(this, food_window_activity::class.java)
        startActivity(intent)
    }
}