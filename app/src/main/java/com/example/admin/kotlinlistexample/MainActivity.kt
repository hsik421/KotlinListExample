package com.example.admin.kotlinlistexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerview: RecyclerView = findViewById(R.id.recyclerview)!! as RecyclerView
        val adapter: MainRecyclerAdapter = MainRecyclerAdapter(dummyData())
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.adapter = adapter
        adapter.setOnClickListener { i -> Log.i("hsik","onClick = "+i) }

    }

    fun dummyData(): ArrayList<String>{
        val datas: ArrayList<String> = ArrayList()
        for (num in 1..50){
            datas.add(num.toString())
        }
        return datas
    }
}
