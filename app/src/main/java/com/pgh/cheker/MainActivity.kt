package com.pgh.cheker

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<Toolbar>(R.id.tobar)
        setSupportActionBar(toolbar)
        val rec = findViewById<RecyclerView>(R.id.recyc)
        val layoutManager = LinearLayoutManager(this)
        val adapter = ChekAdapter(listOf(ChekModel(name = "121212312312"), ChekModel("dasssssssssssssssssss")))
        rec.layoutManager = layoutManager
        rec.adapter = adapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }
}
