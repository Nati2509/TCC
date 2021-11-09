package com.example.referencial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.referencial.pagesEconomia.CitacoesEconomia
import com.example.referencial.pagesEconomia.DadosEconomia
import com.example.referencial.pagesEconomia.ReferencialEconomia

class ActivityEconomia : AppCompatActivity() {

    lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_economia)

        viewPager = findViewById(R.id.view_pager)

        val fragments: ArrayList<Fragment> = arrayListOf(
            CitacoesEconomia(),
            DadosEconomia(),
            ReferencialEconomia()
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