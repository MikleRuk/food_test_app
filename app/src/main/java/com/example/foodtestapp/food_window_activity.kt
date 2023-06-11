package com.example.foodtestapp

import Categories.CategoriesListItem
import Categories.RetrofitHelper
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import androidx.lifecycle.lifecycleScope
import com.example.foodtestapp.databinding.ActivityFoodWindowBinding
import com.squareup.picasso.Picasso
import dishes.DataClassDishes
import dishes.Dishes
import dishes.DishesApi
import kotlinx.coroutines.launch
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import retrofit2.Response

class food_window_activity : AppCompatActivity() {

    lateinit var binding: ActivityFoodWindowBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFoodWindowBinding.inflate(layoutInflater)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(binding.root)
        supportActionBar?.hide()

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
                        val weight : Int? = category.weight
                        val price : Int? = category.price
                        val description : String? = category.description
                        binding.tVFWName.text = name
                        binding.tVFWPriceWeight.text = "$price" +  "Р " +"$weight" + "г"
                        binding.tVFWDescription.text = description
                        Picasso.get().load(image_url).into(binding.imVFW)
                    }
                    1 -> {
                        val category = deserializedDishesList[i]
                        val name: String? = category.name
                        val image_url: String? = category.imageUrl
                        val weight : Int? = category.weight
                        val price : Int? = category.price
                        binding.tVFWName.text = name
                        binding.tVFWPriceWeight.text = "$price" +  "Р " +"$weight" + "г"
                        Picasso.get().load(image_url).into(binding.imVFW)
                    }
                    2 -> {
                        val category = deserializedDishesList[i]
                        val name: String? = category.name
                        val image_url: String? = category.imageUrl
                        val weight : Int? = category.weight
                        val price : Int? = category.price
                        binding.tVFWName.text = name
                        binding.tVFWPriceWeight.text = "$price" +  "Р " +"$weight" + "г"
                        Picasso.get().load(image_url).into(binding.imVFW)
                    }
                    3 -> {
                        val category = deserializedDishesList[i]
                        val name: String? = category.name
                        val image_url: String? = category.imageUrl
                        val weight : Int? = category.weight
                        val price : Int? = category.price
                        binding.tVFWName.text = name
                        binding.tVFWPriceWeight.text ="$price" +  "Р " +"$weight" + "г"
                        Picasso.get().load(image_url).into(binding.imVFW)
                    }
                    4 -> {
                        val category = deserializedDishesList[i]
                        val name: String? = category.name
                        val image_url: String? = category.imageUrl
                        val weight : Int? = category.weight
                        val price : Int? = category.price
                        binding.tVFWName.text = name
                        binding.tVFWPriceWeight.text ="$price" +  "Р " +"$weight" + "г"
                        Picasso.get().load(image_url).into(binding.imVFW)
                    }
                    5 -> {
                        val category = deserializedDishesList[i]
                        val name: String? = category.name
                        val image_url: String? = category.imageUrl
                        val weight : Int? = category.weight
                        val price : Int? = category.price
                        binding.tVFWName.text = name
                        binding.tVFWPriceWeight.text ="$price" +  "Р " +"$weight" + "г"
                        Picasso.get().load(image_url).into(binding.imVFW)
                    }
                    6 -> {
                        val category = deserializedDishesList[i]
                        val name: String? = category.name
                        val image_url: String? = category.imageUrl
                        val weight : Int? = category.weight
                        val price : Int? = category.price
                        binding.tVFWName.text = name
                        binding.tVFWPriceWeight.text = "$price" +  "Р " +"$weight" + "г"
                        Picasso.get().load(image_url).into(binding.imVFW)
                    }
                    7 -> {
                        val category = deserializedDishesList[i]
                        val name: String? = category.name
                        val image_url: String? = category.imageUrl
                        val weight : Int? = category.weight
                        val price : Int? = category.price
                        binding.tVFWName.text = name
                        binding.tVFWPriceWeight.text = "$price" +  "Р " +"$weight" + "г"
                        Picasso.get().load(image_url).into(binding.imVFW)
                    }
                    8 -> {
                        val category = deserializedDishesList[i]
                        val name: String? = category.name
                        val image_url: String? = category.imageUrl
                        val weight : Int? = category.weight
                        val price : Int? = category.price
                        binding.tVFWName.text = name
                        binding.tVFWPriceWeight.text = "$price" +  "Р " +"$weight" + "г"
                        Picasso.get().load(image_url).into(binding.imVFW)
                    }
                    9 -> {
                        val category = deserializedDishesList[i]
                        val name: String? = category.name
                        val image_url: String? = category.imageUrl
                        val weight : Int? = category.weight
                        val price : Int? = category.price
                        binding.tVFWName.text = name
                        binding.tVFWPriceWeight.text = "$price" +  "Р " +"$weight" + "г"
                        Picasso.get().load(image_url).into(binding.imVFW)
                    }
                    10 -> {
                        val category = deserializedDishesList[i]
                        val name: String? = category.name
                        val image_url: String? = category.imageUrl
                        val weight : Int? = category.weight
                        val price : Int? = category.price
                        binding.tVFWName.text = name
                        binding.tVFWPriceWeight.text = "$price" +  "Р " +"$weight" + "г"
                        Picasso.get().load(image_url).into(binding.imVFW)
                    }
                    11 -> {
                        val category = deserializedDishesList[i]
                        val name: String? = category.name
                        val image_url: String? = category.imageUrl
                        val weight : Int? = category.weight
                        val price : Int? = category.price
                        binding.tVFWName.text = name
                        binding.tVFWPriceWeight.text = "$price" +  "Р " +"$weight" + "г"
                        Picasso.get().load(image_url).into(binding.imVFW)
                    }


                }


            }

        }








    }

    fun close_food_window_activity(view: View) {
        val intent = Intent(this, categories_activity::class.java)
        startActivity(intent)
    }
}