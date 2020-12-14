package com.muhammaduzaer.recyclerviewprojecttwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.muhammaduzaer.recyclerviewprojecttwo.adapter.ToDoAdapter
import com.muhammaduzaer.recyclerviewprojecttwo.models.ToDo
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val todoList = mutableListOf(
            ToDo("Complete Work", false),
            ToDo("Head to gym at 8", true),
            ToDo("Buy Groceries", true),
            ToDo("Complete Task", false),
            ToDo("Feed the cat", false),
            ToDo("Iron the clothes", true),
            ToDo("Water the plants", false),
            ToDo("Purchase gym clothes", false),
            ToDo("Commit the code", false),
        )

        val adapter = ToDoAdapter(todoList)
        recyclerViewItemList.adapter = adapter
        recyclerViewItemList.layoutManager = LinearLayoutManager(this)
    }
}