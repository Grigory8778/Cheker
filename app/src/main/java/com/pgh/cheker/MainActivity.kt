package com.pgh.cheker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity(), interfAdd {
    private val recFragment = RecFragment()
    private val addBut = AddFragment()
    private var bool: Boolean = false
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

    fun exit() {
        if (bool) {
            finish()
        } else {
            bool = true
            Toast.makeText(this, "Нажмите повторно для выхода ", Toast.LENGTH_SHORT).show()
        }
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

    override fun ToastData(str: String) {
        supportFragmentManager.beginTransaction()//запускает указанный фрагмент
            .show(recFragment)//выбор фрагмента
            .hide(addBut)
            .commit()
        recFragment.click(str)
    }

}

