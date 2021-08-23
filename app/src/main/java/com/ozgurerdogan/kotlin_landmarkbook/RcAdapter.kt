package com.ozgurerdogan.kotlin_landmarkbook

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.ozgurerdogan.kotlin_landmarkbook.databinding.RecyclerRowBinding
import java.util.ArrayList

class RcAdapter(val arrays: ArrayList<Landmark>, val context: Context) :
    RecyclerView.Adapter<RcAdapter.RcHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RcHolder {
        val binding=RecyclerRowBinding.inflate(LayoutInflater.from(context),parent,false)
        return RcHolder(binding)
    }


    override fun onBindViewHolder(holder: RcHolder, position: Int) {
        holder.binding.recyclerText.text=arrays.get(position).name

        holder.itemView.setOnClickListener {
            val intent= Intent(holder.itemView.context,ShowActivity::class.java)
            intent.putExtra("landmark",arrays.get(position))
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return arrays.size
    }


    class RcHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root) {

    }
}