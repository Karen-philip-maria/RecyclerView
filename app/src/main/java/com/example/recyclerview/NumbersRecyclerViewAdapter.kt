package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class NumbersRecyclerViewAdapter(var numbers: MutableList<BigInteger>):RecyclerView.Adapter<NumbersViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
        val numberView = LayoutInflater.from(parent.context)
            .inflate(R.layout.numbers_list_item,parent,false)
        return NumbersViewHolder(numberView)
    }

    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
        holder.tvNumber.text = numbers[position].toString()

    }

    override fun getItemCount(): Int {
        return numbers.size
    }

}

class NumbersViewHolder(numberView:View):RecyclerView.ViewHolder(numberView){
    val tvNumber = numberView.findViewById<TextView>(R.id.tvNumbers)
}