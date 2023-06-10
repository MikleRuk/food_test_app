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
import com.squareup.picasso.Request
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val categoriesApi = RetrofitHelper.getInstance().create(CategoriesApi::class.java)

        lifecycleScope.launch {
            val result = categoriesApi.getCategories()
            if (result != null) {
                Log.d("ayush: ", result.body().toString())
            } else {
                Log.d("ayush1: ", "НИЧЕГО")
            }
        }




    }


    fun go_to_the_categories(view: View) {
        val intent = Intent(this, categories_activity::class.java)
        startActivity(intent)
    }

}




