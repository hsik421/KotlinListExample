package com.example.admin.kotlinlistexample

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_main.view.*


open class MainRecyclerAdapter: RecyclerView.Adapter<MainRecyclerAdapter.ViewHolder>() {
    private var datas: ArrayList<String>? = null
    var clickListener: OnClickListener? = null
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.item_main_text.text = datas?.get(position)?:"null"
        holder.itemView.setOnClickListener({ v -> clickListener?.onClick(position)})
        Glide.with(holder.itemView.context).load("http://www.reactiongifs.com/r/hsk.gif").into(holder.itemView.item_main_img)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_main,parent,false))
    }

    override fun getItemCount(): Int = datas?.size?:0

    fun setOnClickListener(listener: (Int) -> Unit){
        this.clickListener = object: OnClickListener{
            override fun onClick(position: Int) {
                listener(position)
            }
        }
    }
    fun addData(datas :ArrayList<String>){
        this.datas = datas
        notifyDataSetChanged()
    }
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)

    interface OnClickListener{
        fun onClick(position: Int)
    }
}
