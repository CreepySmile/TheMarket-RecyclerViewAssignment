package com.myanmaritc.themarket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val productList = ArrayList<Product>()
        productList.add(Product(R.drawable.sugar,"Fine Grain Sugar", 30.0,50))
        productList.add(Product(R.drawable.peanuts,"Peanuts", 60.0,25))
        productList.add(Product(R.drawable.rice,"Rice", 120.0,175))

        recycler_view.adapter = ProductAdapter(productList)
        recycler_view.layoutManager = LinearLayoutManager(this)
    }
}