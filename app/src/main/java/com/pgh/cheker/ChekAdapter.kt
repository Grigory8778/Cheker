package com.pgh.cheker

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ChekAdapter(val list: List<ChekModel>) : RecyclerView.Adapter<ChekAdapter.ChekHolder>() {
     init {
         notifyDataSetChanged()
     }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChekHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.recycle , parent, false)
        return ChekHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ChekHolder, position: Int) {
      val model = list[position]
        holder.bind(model)
    }

    class ChekHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind (model:ChekModel){
            val tx = itemView.findViewById<TextView>(R.id.rec_txt)
            tx.text = model.name

        }
    }
}