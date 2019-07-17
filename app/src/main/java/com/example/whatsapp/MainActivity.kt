package com.example.whatsapp

import android.content.res.Resources
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.NotificationCompat
import android.support.v4.view.ViewPager
import android.text.style.StyleSpan
import android.view.Menu
import android.view.MenuInflater
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        constructMainViewPager(viewPager)
        tabLayout.setupWithViewPager(viewPager)
        setSupportActionBar(toolBar)
    }

    private fun constructMainViewPager(viewPager:ViewPager){
        val mainPagerAdapter = MainPagerAdapter(supportFragmentManager)
        mainPagerAdapter.addFragment(CameraFragment(),"Camera")
        mainPagerAdapter.addFragment(ChatsFragment(),"CHATS")
        mainPagerAdapter.addFragment(StatusFragment(),"STATUS")
        mainPagerAdapter.addFragment(CallsFragment(),"CALLS")
        viewPager.adapter = mainPagerAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        val menuInflater = menuInflater
        menuInflater.inflate(R.menu.options_menu,menu)


        return true
    }
}
