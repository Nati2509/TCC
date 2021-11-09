package com.example.referencial

import android.content.ClipData
import android.content.ClipboardManager
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.referencial.pagesMeioAmbiente.CitacoesMeioAmbiente
import com.example.referencial.pagesMeioAmbiente.DadosMeioAmbiente
import com.example.referencial.pagesMeioAmbiente.ReferencialMeioAmbiente

class ActivityMeioAmbiente : AppCompatActivity() {

    lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meio_ambiente)

        viewPager = findViewById(R.id.view_pager)

        val fragments: ArrayList<Fragment> = arrayListOf(
            CitacoesMeioAmbiente(),
            DadosMeioAmbiente(),
            ReferencialMeioAmbiente()
        )

        val adapter = ViewPagerAdapter(fragments, this)
        viewPager.adapter = adapter
    }

    override fun onBackPressed() {
        if(viewPager.currentItem == 0){
            super.onBackPressed()
        } else {
            viewPager.currentItem = viewPager.currentItem - 1
        }

    }
}