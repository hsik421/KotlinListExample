package com.example.admin.kotlinlistexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerview = findViewById(R.id.recyclerview) as RecyclerView
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.adapter = MainRecyclerAdapter(dummyData())
    }
    fun dummyData(): ArrayList<String>{
        val datas: ArrayList<String> = ArrayList()
        for (num in 1..50){
            datas.add(num.toString())
        }
        return datas
    }
}
