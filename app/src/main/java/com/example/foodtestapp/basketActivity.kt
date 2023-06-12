package com.example.foodtestapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import busket.ListAdapter
import busket.ListItem
import com.example.foodtestapp.databinding.ActivityBasketBinding

lateinit var binding: ActivityBasketBinding

class basketActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBasketBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val itemList: MutableList<ListItem> = mutableListOf()
        val adapter = ListAdapter(itemList)
        binding.RecyclerVew.layoutManager = LinearLayoutManager(this)
        binding.RecyclerVew.adapter = adapter

    }

    fun goHome(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}