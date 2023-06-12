package com.example.foodtestapp

import Categories.CategoriesApi
import Categories.CategoriesListItem
import Categories.DataClassCategories
import Categories.RetrofitHelper
import android.content.ClipDescription
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowId
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
                        val id: Int? = category.id
                        val name: String? = category.name
                        val image_url: String? = category.imageUrl
                        binding.tvImbDish1.text = name
                        Picasso.get().load(image_url).into(binding.imBtnDish1)
                    }
                    1 -> {
                        val category = deserializedDishesList[i]
                        val id: Int? = category.id
                        val name: String? = category.name
                        val image_url: String? = category.imageUrl
                        val weight: Int? = category.weight
                        val price: Int? = category.price
                        val description: String? = category.description
                        binding.tvImbDish2.text = name
                        Picasso.get().load(image_url).into(binding.imBtnDish2)
                    }
                    2 -> {
                        val category = deserializedDishesList[i]
                        val id: Int? = category.id
                        val name: String? = category.name
                        val image_url: String? = category.imageUrl
                        val weight: Int? = category.weight
                        val price: Int? = category.price
                        val description: String? = category.description
                        binding.tvImbDish3.text = name
                        Picasso.get().load(image_url).into(binding.imBtnDish3)
                    }
                    3 -> {
                        val category = deserializedDishesList[i]
                        val id: Int? = category.id
                        val name: String? = category.name
                        val image_url: String? = category.imageUrl
                        val weight: Int? = category.weight
                        val price: Int? = category.price
                        val description: String? = category.description
                        binding.tvImbDish4.text = name
                        Picasso.get().load(image_url).into(binding.imBtnDish4)
                    }
                    4 -> {
                        val category = deserializedDishesList[i]
                        val id: Int? = category.id
                        val name: String? = category.name
                        val image_url: String? = category.imageUrl
                        val weight: Int? = category.weight
                        val price: Int? = category.price
                        val description: String? = category.description
                        binding.tvImbDish5.text = name
                        Picasso.get().load(image_url).into(binding.imBtnDish5)
                    }
                    5 -> {
                        val category = deserializedDishesList[i]
                        val id: Int? = category.id
                        val name: String? = category.name
                        val image_url: String? = category.imageUrl
                        val weight: Int? = category.weight
                        val price: Int? = category.price
                        val description: String? = category.description
                        binding.tvImbDish6.text = name
                        Picasso.get().load(image_url).into(binding.imBtnDish6)
                    }
                    6 -> {
                        val category = deserializedDishesList[i]
                        val id: Int? = category.id
                        val name: String? = category.name
                        val image_url: String? = category.imageUrl
                        val weight: Int? = category.weight
                        val price: Int? = category.price
                        val description: String? = category.description
                        binding.tvImbDish7.text = name
                        Picasso.get().load(image_url).into(binding.imBtnDish7)
                    }
                    7 -> {
                        val category = deserializedDishesList[i]
                        val id: Int? = category.id
                        val name: String? = category.name
                        val image_url: String? = category.imageUrl
                        val weight: Int? = category.weight
                        val price: Int? = category.price
                        val description: String? = category.description
                        binding.tvImbDish8.text = name
                        Picasso.get().load(image_url).into(binding.imBtnDish8)
                    }
                    8 -> {
                        val category = deserializedDishesList[i]
                        val id: Int? = category.id
                        val name: String? = category.name
                        val image_url: String? = category.imageUrl
                        val weight: Int? = category.weight
                        val price: Int? = category.price
                        val description: String? = category.description
                        binding.tvImbDish9.text = name
                        Picasso.get().load(image_url).into(binding.imBtnDish9)
                    }
                    9 -> {
                        val category = deserializedDishesList[i]
                        val id: Int? = category.id
                        val name: String? = category.name
                        val image_url: String? = category.imageUrl
                        val weight: Int? = category.weight
                        val price: Int? = category.price
                        val description: String? = category.description
                        binding.tvImbDish10.text = name
                        Picasso.get().load(image_url).into(binding.imBtnDish10)
                    }
                    10 -> {
                        val category = deserializedDishesList[i]
                        val id: Int? = category.id
                        val name: String? = category.name
                        val image_url: String? = category.imageUrl
                        val weight: Int? = category.weight
                        val price: Int? = category.price
                        val description: String? = category.description
                        binding.tvImbDish11.text = name
                        Picasso.get().load(image_url).into(binding.imBtnDish11)
                    }
                    11 -> {
                        val category = deserializedDishesList[i]
                        val id: Int? = category.id
                        val name: String? = category.name
                        val image_url: String? = category.imageUrl
                        val weight: Int? = category.weight
                        val price: Int? = category.price
                        val description: String? = category.description
                        binding.tvImbDish12.text = name
                        Picasso.get().load(image_url).into(binding.imBtnDish12)
                    }


                }
            }
        }

        binding.imBtnDish1.setOnClickListener {
        lifecycleScope.launch {
                val response: Response<DataClassDishes> = categoriesApi.getDishes()
                val dataClassDishes: DataClassDishes? = response.body()
                val dishesList = dataClassDishes?.dishes
                val dishesJson = Json.encodeToString(dishesList)
                val json = Json { ignoreUnknownKeys = true }
                val deserializedDishesList =
                    json.decodeFromString<List<Dishes>>(dishesJson)

                val category = deserializedDishesList[0]
                val id: Int? = category.id
                val name: String? = category.name
                val imageUrl: String? = category.imageUrl
                val weight: Int? = category.weight
                val price: Int? = category.price
                val description: String? = category.description

                openWindow(1, id, name,imageUrl, weight, price, description)
            }
        }
        binding.imBtnDish2.setOnClickListener {
            lifecycleScope.launch {
                val response: Response<DataClassDishes> = categoriesApi.getDishes()
                val dataClassDishes: DataClassDishes? = response.body()
                val dishesList = dataClassDishes?.dishes
                val dishesJson = Json.encodeToString(dishesList)
                val json = Json { ignoreUnknownKeys = true }
                val deserializedDishesList =
                    json.decodeFromString<List<Dishes>>(dishesJson)

                val category = deserializedDishesList[1]
                val id: Int? = category.id
                val name: String? = category.name
                val imageUrl: String? = category.imageUrl
                val weight: Int? = category.weight
                val price: Int? = category.price
                val description: String? = category.description

                openWindow(2, id, name, imageUrl, weight, price, description)
            }
        }
        binding.imBtnDish3.setOnClickListener {
            lifecycleScope.launch {
                val response: Response<DataClassDishes> = categoriesApi.getDishes()
                val dataClassDishes: DataClassDishes? = response.body()
                val dishesList = dataClassDishes?.dishes
                val dishesJson = Json.encodeToString(dishesList)
                val json = Json { ignoreUnknownKeys = true }
                val deserializedDishesList =
                    json.decodeFromString<List<Dishes>>(dishesJson)

                val category = deserializedDishesList[2]
                val id: Int? = category.id
                val name: String? = category.name
                val imageUrl: String? = category.imageUrl
                val weight: Int? = category.weight
                val price: Int? = category.price
                val description: String? = category.description

                openWindow(3, id, name,imageUrl , weight, price, description)
            }
        }
        binding.imBtnDish4.setOnClickListener {
            lifecycleScope.launch {
                val response: Response<DataClassDishes> = categoriesApi.getDishes()
                val dataClassDishes: DataClassDishes? = response.body()
                val dishesList = dataClassDishes?.dishes
                val dishesJson = Json.encodeToString(dishesList)
                val json = Json { ignoreUnknownKeys = true }
                val deserializedDishesList =
                    json.decodeFromString<List<Dishes>>(dishesJson)

                val category = deserializedDishesList[3]
                val id: Int? = category.id
                val name: String? = category.name
                val imageUrl: String? = category.imageUrl
                val weight: Int? = category.weight
                val price: Int? = category.price
                val description: String? = category.description

                openWindow(4, id, name, imageUrl, weight, price, description)
            }
        }
        binding.imBtnDish5.setOnClickListener {
            lifecycleScope.launch {
                val response: Response<DataClassDishes> = categoriesApi.getDishes()
                val dataClassDishes: DataClassDishes? = response.body()
                val dishesList = dataClassDishes?.dishes
                val dishesJson = Json.encodeToString(dishesList)
                val json = Json { ignoreUnknownKeys = true }
                val deserializedDishesList =
                    json.decodeFromString<List<Dishes>>(dishesJson)

                val category = deserializedDishesList[4]
                val id: Int? = category.id
                val name: String? = category.name
                val imageUrl: String? = category.imageUrl
                val weight: Int? = category.weight
                val price: Int? = category.price
                val description: String? = category.description

                openWindow(5, id, name, imageUrl, weight, price, description)
            }
        }
        binding.imBtnDish6.setOnClickListener {
            lifecycleScope.launch {
                val response: Response<DataClassDishes> = categoriesApi.getDishes()
                val dataClassDishes: DataClassDishes? = response.body()
                val dishesList = dataClassDishes?.dishes
                val dishesJson = Json.encodeToString(dishesList)
                val json = Json { ignoreUnknownKeys = true }
                val deserializedDishesList =
                    json.decodeFromString<List<Dishes>>(dishesJson)

                val category = deserializedDishesList[5]
                val id: Int? = category.id
                val name: String? = category.name
                val imageUrl: String? = category.imageUrl
                val weight: Int? = category.weight
                val price: Int? = category.price
                val description: String? = category.description

                openWindow(6, id, name, imageUrl, weight, price, description)
            }
        }
        binding.imBtnDish7.setOnClickListener {
            lifecycleScope.launch {
                val response: Response<DataClassDishes> = categoriesApi.getDishes()
                val dataClassDishes: DataClassDishes? = response.body()
                val dishesList = dataClassDishes?.dishes
                val dishesJson = Json.encodeToString(dishesList)
                val json = Json { ignoreUnknownKeys = true }
                val deserializedDishesList =
                    json.decodeFromString<List<Dishes>>(dishesJson)

                val category = deserializedDishesList[6]
                val id: Int? = category.id
                val name: String? = category.name
                val imageUrl: String? = category.imageUrl
                val weight: Int? = category.weight
                val price: Int? = category.price
                val description: String? = category.description

                openWindow(7, id, name, imageUrl, weight, price, description)
            }
        }
        binding.imBtnDish8.setOnClickListener {
            lifecycleScope.launch {
                val response: Response<DataClassDishes> = categoriesApi.getDishes()
                val dataClassDishes: DataClassDishes? = response.body()
                val dishesList = dataClassDishes?.dishes
                val dishesJson = Json.encodeToString(dishesList)
                val json = Json { ignoreUnknownKeys = true }
                val deserializedDishesList =
                    json.decodeFromString<List<Dishes>>(dishesJson)

                val category = deserializedDishesList[7]
                val id: Int? = category.id
                val name: String? = category.name
                val imageUrl: String? = category.imageUrl
                val weight: Int? = category.weight
                val price: Int? = category.price
                val description: String? = category.description

                openWindow(8, id, name, imageUrl, weight, price, description)
            }
        }
        binding.imBtnDish9.setOnClickListener {
            lifecycleScope.launch {
                val response: Response<DataClassDishes> = categoriesApi.getDishes()
                val dataClassDishes: DataClassDishes? = response.body()
                val dishesList = dataClassDishes?.dishes
                val dishesJson = Json.encodeToString(dishesList)
                val json = Json { ignoreUnknownKeys = true }
                val deserializedDishesList =
                    json.decodeFromString<List<Dishes>>(dishesJson)

                val category = deserializedDishesList[8]
                val id: Int? = category.id
                val name: String? = category.name
                val imageUrl: String? = category.imageUrl
                val weight: Int? = category.weight
                val price: Int? = category.price
                val description: String? = category.description

                openWindow(9, id, name, imageUrl, weight, price, description)
            }
        }
        binding.imBtnDish10.setOnClickListener {
            lifecycleScope.launch {
                val response: Response<DataClassDishes> = categoriesApi.getDishes()
                val dataClassDishes: DataClassDishes? = response.body()
                val dishesList = dataClassDishes?.dishes
                val dishesJson = Json.encodeToString(dishesList)
                val json = Json { ignoreUnknownKeys = true }
                val deserializedDishesList =
                    json.decodeFromString<List<Dishes>>(dishesJson)

                val category = deserializedDishesList[9]
                val id: Int? = category.id
                val name: String? = category.name
                val imageUrl: String? = category.imageUrl
                val weight: Int? = category.weight
                val price: Int? = category.price
                val description: String? = category.description

                openWindow(10, id, name, imageUrl, weight, price, description)
            }
        }
        binding.imBtnDish11.setOnClickListener {
            lifecycleScope.launch {
                val response: Response<DataClassDishes> = categoriesApi.getDishes()
                val dataClassDishes: DataClassDishes? = response.body()
                val dishesList = dataClassDishes?.dishes
                val dishesJson = Json.encodeToString(dishesList)
                val json = Json { ignoreUnknownKeys = true }
                val deserializedDishesList =
                    json.decodeFromString<List<Dishes>>(dishesJson)

                val category = deserializedDishesList[10]
                val id: Int? = category.id
                val name: String? = category.name
                val imageUrl: String? = category.imageUrl
                val weight: Int? = category.weight
                val price: Int? = category.price
                val description: String? = category.description

                openWindow(11, id, name, imageUrl, weight, price, description)
            }
        }
        binding.imBtnDish12.setOnClickListener {
            lifecycleScope.launch {
                val response: Response<DataClassDishes> = categoriesApi.getDishes()
                val dataClassDishes: DataClassDishes? = response.body()
                val dishesList = dataClassDishes?.dishes
                val dishesJson = Json.encodeToString(dishesList)
                val json = Json { ignoreUnknownKeys = true }
                val deserializedDishesList =
                    json.decodeFromString<List<Dishes>>(dishesJson)

                val category = deserializedDishesList[11]
                val id: Int? = category.id
                val name: String? = category.name
                val imageUrl: String? = category.imageUrl
                val weight: Int? = category.weight
                val price: Int? = category.price
                val description: String? = category.description

                openWindow(12, id, name, imageUrl, weight, price, description)
            }
        }
    }


    fun go_back_to_the_main_activity(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }


    private fun openWindow(
        windowId: Int,
        id: Int?,
        name: String?,
        imageUrl: String?,
        weight: Int?,
        price: Int?,
        description: String?
    ) {
        val intent = Intent(this, food_window_activity::class.java)
        intent.putExtra("windowId", windowId)
        intent.putExtra("id", id)
        intent.putExtra("name", name)
        intent.putExtra("imageUrl", imageUrl)
        intent.putExtra("weight", weight)
        intent.putExtra("price", price)
        intent.putExtra("description", description)
        startActivity(intent)
    }

    }




