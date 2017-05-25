package com.example.admin.kotlinlistexample

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


open class MainRecyclerAdapter(var datas: ArrayList<String>): RecyclerView.Adapter<MainRecyclerAdapter.ViewHolder>() {

    var clickListener: OnClickListener? = null
    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder!!.ItemText.setText(datas.get(position))
        holder.itemView.setOnClickListener({ v -> clickListener?.onClick(position)})
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_main,parent,false))
    }

    override fun getItemCount(): Int = datas.size

    fun setOnClickListener(listener: (Int) -> Unit){
        this.clickListener = object: OnClickListener{
            override fun onClick(position: Int) {
                listener(position)
            }
        }
    }
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var ItemText: TextView = view.findViewById(R.id.item_main_text) as TextView
    }
    interface OnClickListener{
        fun onClick(position: Int)
    }
}
