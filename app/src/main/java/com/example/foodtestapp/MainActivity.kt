package com.example.foodtestapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.lifecycleScope
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.foodtestapp.databinding.ActivityMainBinding
import kotlinx.coroutines.launch
import retrofit2.await
import com.squareup.picasso.Picasso
import com.squareup.picasso.Request
import kotlinx.serialization.json.Json
import org.json.JSONObject


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        lifecycleScope.launch {
            val categories = CategoriesApp().configureRetrofit()

        }

    }


    fun go_to_the_categories(view: View) {
        val intent = Intent(this, categories_activity::class.java)
        startActivity(intent)
    }
}
