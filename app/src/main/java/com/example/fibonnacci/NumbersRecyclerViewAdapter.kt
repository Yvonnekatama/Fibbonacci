package com.example.fibonnacci

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class NumbersRecyclerViewsAdapter(var numberList:List<BigInteger>):RecyclerView.Adapter<NumbersViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
        var numberView=LayoutInflater.from(parent.context).inflate(R.layout.numbers_list_item,parent,false)
        return NumbersViewHolder(numberView)

    }
    //displays the current item in the list
    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
        holder.tvnumbers.text=numberList.get(position).toString()
    }

    override fun getItemCount(): Int {
        return numberList.size

    }
}

class NumbersViewHolder(val numberView: View): RecyclerView.ViewHolder(numberView){
    var tvnumbers=itemView.findViewById<TextView>(R.id.tvnumbers)
}


