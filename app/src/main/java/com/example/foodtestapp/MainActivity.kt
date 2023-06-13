package com.example.foodtestapp

import Categories.CategoriesApi
import Categories.CategoriesListItem
import Categories.DataClassCategories
import Categories.RetrofitHelper
import DayMonth.DateUtils
import android.Manifest.permission.ACCESS_FINE_LOCATION
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.lifecycle.lifecycleScope
import com.example.foodtestapp.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso
import kotlinx.coroutines.launch
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import location.GeoLocationManager
import retrofit2.Response


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //день месяц

        val dateAndMonth = DateUtils.getCurrentDateAndMonth()

        binding.tvDayMonthYear.text = dateAndMonth

        //геоданные

        val geoLocationManager = GeoLocationManager(this)
        geoLocationManager.requestCity(object : GeoLocationManager.OnCityReceivedListener {
            override fun onCityReceived(city: String) {
                // Выводим город на экран, но не выводим
                binding.tvSityLocationMain.text = city
            }

            override fun onCityRequestFailed() {
                //тут должен быть Toast, но его нет
            }
        })


        val categoriesApi = RetrofitHelper.getInstance().create(CategoriesApi::class.java)

        lifecycleScope.launch {

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
                        val name: String? = category.name
                        val image_url: String? = category.imageUrl
                        binding.tvImb1.text = name
                        Picasso.get().load(image_url).into(binding.imageButtonCategories1)

                    }
                    1 -> {
                        val category = deserializedCategoriesList[i]
                        val name: String? = category.name
                        val image_url: String? = category.imageUrl
                        binding.tvImb2.text = name
                        Picasso.get().load(image_url).into(binding.imageButtonCategories2)

                    }
                    2 -> {
                        val category = deserializedCategoriesList[i]
                        val name: String? = category.name
                        val image_url: String? = category.imageUrl
                        binding.tvImb3.text = name
                        Picasso.get().load(image_url).into(binding.imageButtonCategories3)


                    }
                    3 -> {
                        val category = deserializedCategoriesList[i]
                        val name: String? = category.name
                        val image_url: String? = category.imageUrl
                        binding.tvImb4.text = name
                        Picasso.get().load(image_url).into(binding.imageButtonCategories4)
                    }
                }
            }
        }

        binding.imageButtonCategories1.setOnClickListener {
            lifecycleScope.launch {
                val response: Response<DataClassCategories> = categoriesApi.getCategories()
                val dataClassCategories: DataClassCategories? = response.body()
                val categoriesList = dataClassCategories?.сategories
                val categoriesJson = Json.encodeToString(categoriesList)
                val deserializedCategoriesList =
                    Json.decodeFromString<List<CategoriesListItem>>(categoriesJson)
                val category = deserializedCategoriesList[0]
                val name: String? = category.name
                val image_url: String? = category.imageUrl

                go_to_the_categories("$name")
            }}

            binding.imageButtonCategories2.setOnClickListener {
                lifecycleScope.launch {
                    val response: Response<DataClassCategories> = categoriesApi.getCategories()
                    val dataClassCategories: DataClassCategories? = response.body()
                    val categoriesList = dataClassCategories?.сategories
                    val categoriesJson = Json.encodeToString(categoriesList)
                    val deserializedCategoriesList =
                        Json.decodeFromString<List<CategoriesListItem>>(categoriesJson)
                    val category = deserializedCategoriesList[1]
                    val name: String? = category.name
                    val image_url: String? = category.imageUrl
                    go_to_the_categories("$name")
                }
            }
            binding.imageButtonCategories3.setOnClickListener {
                lifecycleScope.launch {
                    val response: Response<DataClassCategories> = categoriesApi.getCategories()
                    val dataClassCategories: DataClassCategories? = response.body()
                    val categoriesList = dataClassCategories?.сategories
                    val categoriesJson = Json.encodeToString(categoriesList)
                    val deserializedCategoriesList =
                        Json.decodeFromString<List<CategoriesListItem>>(categoriesJson)
                    val category = deserializedCategoriesList[2]
                    val name: String? = category.name
                    val image_url: String? = category.imageUrl
                    go_to_the_categories("$name")
                }
            }
            binding.imageButtonCategories4.setOnClickListener {
                lifecycleScope.launch {
                    val response: Response<DataClassCategories> = categoriesApi.getCategories()
                    val dataClassCategories: DataClassCategories? = response.body()
                    val categoriesList = dataClassCategories?.сategories
                    val categoriesJson = Json.encodeToString(categoriesList)
                    val deserializedCategoriesList =
                        Json.decodeFromString<List<CategoriesListItem>>(categoriesJson)
                    val category = deserializedCategoriesList[3]
                    val name: String? = category.name
                    val image_url: String? = category.imageUrl
                    go_to_the_categories("$name")
                }
            }
        }



    fun go_to_the_categories(name: String) {
        val intent = Intent(this, categories_activity::class.java)
        intent.putExtra("name", name)
        startActivity(intent)
    }

    fun goToTheBusket(view: View) {
        val intent = Intent(this, basketActivity::class.java)
        startActivity(intent)
    }


}




