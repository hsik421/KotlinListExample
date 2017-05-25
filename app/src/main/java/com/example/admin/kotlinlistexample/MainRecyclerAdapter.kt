package com.example.admin.kotlinlistexample

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


open class MainRecyclerAdapter(datas: ArrayList<String>): RecyclerView.Adapter<MainRecyclerAdapter.ViewHolder>() {
    private var datas: ArrayList<String> = datas

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder!!.ItemText.setText(datas.get(position))
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_main,parent,false))
    }

    override fun getItemCount(): Int = datas.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var ItemText: TextView = view.findViewById(R.id.item_main_text) as TextView
    }

}
