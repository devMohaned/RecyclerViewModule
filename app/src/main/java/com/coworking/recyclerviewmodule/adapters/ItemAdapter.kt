package com.coworking.recyclerviewmodule.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.coworking.recyclerviewmodule.R
import com.coworking.recyclerviewmodule.models.Item

class ItemAdapter(private val context: Context, private val dataset : List<Item>)
    : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view)
    {
        val imageView : ImageView = view.findViewById(R.id.list_item_image_view)
        val textView : TextView = view.findViewById(R.id.list_item_text_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item,parent,false)
        return ItemViewHolder(adapterLayout)

    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.imageView.setImageResource(item.itemImageResource)
        holder.textView.text = item.itemName;
    }

    override fun getItemCount(): Int = dataset.size

}