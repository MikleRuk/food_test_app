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

        val windowId = intent.getIntExtra("windowId", 1)
        val id = intent.getIntExtra("id", 1)
        val name = intent.getStringExtra("name")
        val imageUrl = intent.getStringExtra("imageUrl")
        val weight = intent.getIntExtra("weight", 0)
        val price = intent.getIntExtra("price", 0)
        val description = intent.getStringExtra("description")

        binding.tVFWName.text = name
        binding.tVFWPriceWeight.text = "$price" + "Р" + " $weight" + "г"
        binding.tVFWDescription.text = description
        Picasso.get().load(imageUrl).into(binding.imVFW)


    }


    fun close_food_window_activity(view: View) {
        val intent = Intent(this, categories_activity::class.java)
        startActivity(intent)
    }


}


