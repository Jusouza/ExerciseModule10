package com.example.exercisemodule10

import androidx.recyclerview.widget.RecyclerView
import com.example.exercisemodule10.databinding.ContactInfoItemBinding

class ContactItemViewHolder(binding: ContactInfoItemBinding)
    : RecyclerView.ViewHolder(binding.root) {

    var name = binding.txtName
    var phone = binding.txtPhone
    var root = binding.root
}