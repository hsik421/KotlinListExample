package com.example.admin.kotlinlistexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainAdapter = MainRecyclerAdapter()
        recyclerview.apply {
            adapter = mainAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)
            addItemDecoration(DividerItemDecoration(this@MainActivity,LinearLayoutManager.VERTICAL))
        }
        mainAdapter.setOnClickListener { i -> Log.i("hsik","onClick = $i") }
        mainAdapter.addData(dummyData())
    }

    fun dummyData(): ArrayList<String>{
        val datas: ArrayList<String> = ArrayList()
        (1..50).mapTo(datas) { it.toString() }
        return datas
    }
}
