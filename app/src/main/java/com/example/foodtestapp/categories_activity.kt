package com.example.foodtestapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.foodtestapp.databinding.ActivityCategoriesBinding
import com.example.foodtestapp.databinding.ActivityMainBinding

class categories_activity : AppCompatActivity() {

    lateinit var binding: ActivityCategoriesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategoriesBinding.inflate(layoutInflater)
        setContentView(binding.root)
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