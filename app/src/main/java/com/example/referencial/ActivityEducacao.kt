package com.example.referencial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.referencial.pagesEducacao.CitacoesEducacao
import com.example.referencial.pagesEducacao.DadosEducacao
import com.example.referencial.pagesEducacao.ReferencialEducacao

class ActivityEducacao : AppCompatActivity() {

    lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_educacao)

        viewPager = findViewById(R.id.view_pager)

        val fragments: ArrayList<Fragment> = arrayListOf(
            CitacoesEducacao(),
            DadosEducacao(),
            ReferencialEducacao()
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