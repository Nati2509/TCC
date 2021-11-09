package com.example.referencial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.referencial.pagesViolencia.CitacoesViolencia
import com.example.referencial.pagesViolencia.DadosViolencia
import com.example.referencial.pagesViolencia.ReferencialViolencia

class ActivityViolencia : AppCompatActivity() {

    lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_violencia)

        viewPager = findViewById(R.id.view_pager)

        val fragments: ArrayList<Fragment> = arrayListOf(
            CitacoesViolencia(),
            DadosViolencia(),
            ReferencialViolencia()
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