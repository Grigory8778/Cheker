package com.pgh.cheker

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.ImageView
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val img = findViewById<ImageView>(R.id.rec_image)
        val toolbar = findViewById<Toolbar>(R.id.tobar)
        setSupportActionBar(toolbar)
        val rs = findViewById<RecyclerView>(R.id.res)
        val layoutManager = LinearLayoutManager(this)
        val adapter = StAdapter(
            listOf(
                StResult(
                    "dsadasd",
                    "https://ribalych.ru/wp-content/uploads/2020/03/smeshnye-kartinki-nastroenie_001-1.jpg"
                ),
                StResult(
                    "aaaaaaaaaaaaaaa",
                    "https://i.pinimg.com/736x/d9/86/a9/d986a9476263f1e9399e2f0f6020f6da.jpg"
                ),
                StResult(
                    "ghhjaaaa",
                    "https://the-flow.ru/uploads/images/resize/830x0/adaptiveResize/15/77/94/35/48/bb23aed40cd7.jpg"
                )
            )
        )
        rs.layoutManager = layoutManager
        rs.adapter = adapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }
}
