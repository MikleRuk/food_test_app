package com.example.foodtestapp

import DayMonth.DateUtils
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import busket.ListAdapter
import busket.ListItem
import busket.Product
import com.example.foodtestapp.databinding.ActivityBasketBinding


class basketActivity : AppCompatActivity() {

    lateinit var binding: ActivityBasketBinding

    private lateinit var productList: ArrayList<Product>
    private lateinit var listAdapter: ListAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBasketBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val dateAndMonth = DateUtils.getCurrentDateAndMonth()

        binding.tvDayMonthYear.text = dateAndMonth

        val product = intent.getParcelableExtra<Product>("product")
        product?.let {
            productList.add(it)
        }

        val listItem: MutableList<ListItem> = ArrayList()
        productList = ArrayList()
        productList.forEach {
            listItem.add(ListItem(it, 1))
        }
        listAdapter = ListAdapter(listItem)
        binding.RecyclerView.layoutManager = LinearLayoutManager(this)
        binding.RecyclerView.adapter = listAdapter


    }

    fun goHome(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}