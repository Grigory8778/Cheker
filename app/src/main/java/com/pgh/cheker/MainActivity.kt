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
        val rs = findViewById<RecyclerView>(R.id.resyc)
        val layoutManager = LinearLayoutManager(this)
        val adapter = StAdapter(
                listOf(
                        StResult("dsadasd"),
                        StResult("aaaaaaaaaaaaaaa"),
                        StResult("ghhjaaaa")
                )
        )
        rs.layoutManager=layoutManager
        rs.adapter=adapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }
}
