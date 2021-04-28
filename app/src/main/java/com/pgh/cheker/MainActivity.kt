package com.pgh.cheker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), Listener {
    private val recFragment = RecFragment()
    private val addBut = AddFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)//Добавляет верстку в активити

        supportFragmentManager.beginTransaction()//запускает указанный фрагмент
            .add(R.id.frame_act, recFragment)//выбор фрагмента
            .add(R.id.frame_act, addBut)
            .hide(addBut)
            .show(recFragment)
            .commit()
    }

    fun back() {
        supportFragmentManager.beginTransaction()//запускает указанный фрагмент
            .show(recFragment)//выбор фрагмента
            .hide(addBut)
            .commit()
    }

    fun secFragment() {
        supportFragmentManager.beginTransaction()//запускает указанный фрагмент
            .show(addBut)//выбор фрагмента
            .hide(recFragment)
            .commit()
    }

    override fun etd(str: String) {
        supportFragmentManager.beginTransaction()//запускает указанный фрагмент
            .show(recFragment)//выбор фрагмента
            .hide(addBut)
            .commit()
        recFragment.click(str)
    }
}

