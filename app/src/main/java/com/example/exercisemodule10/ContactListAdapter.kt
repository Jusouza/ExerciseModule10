package com.example.exercisemodule10

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.exercisemodule10.databinding.ContactInfoItemBinding

class ContactListAdapter(
    val listItems: MutableList<ContactInfo>,
    val listener: ContactListAdapterListener
) : RecyclerView.Adapter<ContactItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactItemViewHolder {
        return ContactItemViewHolder(
            ContactInfoItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return listItems.size
    }

    override fun onBindViewHolder(holder: ContactItemViewHolder, position: Int) {
        val item = listItems[position]
        holder.name.text = item.name
        holder.phone.text = item.phone

        holder.root.setOnClickListener {
            listener.onItemClicked(item.name)
        }
    }

    interface ContactListAdapterListener {
        fun onItemClicked(content: String)
    }
}