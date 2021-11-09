package com.example.referencial

import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import java.util.function.Predicate

class ActivityFavoritos : AppCompatActivity() {

    companion object {
    val favoritos = mutableListOf<String>()

    fun add(texto: String) {
        favoritos.add(texto)
    }

    @RequiresApi(Build.VERSION_CODES.N)
    fun remove(texto: String) {
        val teste = Predicate { t: String -> t == texto }
        favoritos.removeIf { x: String -> teste.test(x) }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favoritos)

        val arrayAdapter: ArrayAdapter<*>

        var lista = findViewById<ListView>(R.id.lista)
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayOf(favoritos))
        lista.adapter = arrayAdapter

        Log.i("INFO", "LISTA +++++++++++++++++++++++++++++")
        for (texto in favoritos) {
            Log.i("INFO", texto)
        }

    }

}