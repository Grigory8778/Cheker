package com.pgh.cheker

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StAdapter(private val list: List<StResult>) : RecyclerView.Adapter<StAdapter.StViewHonder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StViewHonder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return StViewHonder(view)
    }

    override fun onBindViewHolder(holder: StViewHonder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size

    class StViewHonder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(model: StResult) {
            val tx = itemView.findViewById<TextView>(R.id.txt1)
            tx.text = model.name
        }
    }
}