package com.muhammaduzaer.recyclerviewprojecttwo.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.muhammaduzaer.recyclerviewprojecttwo.R
import com.muhammaduzaer.recyclerviewprojecttwo.adapter.viewholder.ToDoViewHolder
import com.muhammaduzaer.recyclerviewprojecttwo.models.ToDo
import kotlinx.android.synthetic.main.todo_items.view.*

class ToDoAdapter (var todos: List<ToDo>) : RecyclerView.Adapter<ToDoViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.todo_items, parent, false)
        return ToDoViewHolder(view)
    }

    override fun onBindViewHolder(holder: ToDoViewHolder, position: Int) {
        holder.itemView.apply {
            textViewTitle.text = todos[position].title
            checkBoxDone.isChecked = todos[position].isChecked
        }
    }

    override fun getItemCount(): Int {
        return todos.size
    }

}