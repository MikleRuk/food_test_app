package com.example.foodtestapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import com.example.foodtestapp.databinding.ActivityFoodWindowBinding

class food_window_activity : AppCompatActivity() {

    lateinit var binding: ActivityFoodWindowBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFoodWindowBinding.inflate(layoutInflater)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(binding.root)
        supportActionBar?.hide()
    }

    fun close_food_window_activity(view: View) {
        val intent = Intent(this, categories_activity::class.java)
        startActivity(intent)
    }
}