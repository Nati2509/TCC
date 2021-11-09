package com.example.referencial

import android.content.ClipData
import android.content.ClipboardManager
import android.content.ContentValues
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Spinner
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton


class ActivityAdicionarNotas : AppCompatActivity() {
//    val dbTable="Notes"


    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var texto: TextView
        lateinit var menu: Spinner
        lateinit var botao: Button

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adicionar_notas)

        //spinner
        texto = findViewById(R.id.editText2)
        menu = findViewById(R.id.spinner_op)
        botao = findViewById(R.id.button_add)
        var opcoes = arrayOf("Cultura","Economia","Educação","Juventude","Meio Ambiente","Política","Preconceito","Saúde","Sociedade","Tecnologia","Violência")

        menu.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, opcoes)

        // add notes


        }
}