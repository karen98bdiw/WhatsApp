package com.example.whatsapp

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.ViewPager
import android.util.Log
import android.view.View
import android.view.ViewGroup

class MainPagerAdapter(fm:FragmentManager) : FragmentPagerAdapter(fm) {

    val fragmentList = arrayListOf<Fragment>()
    val fragmentTittleList = arrayListOf<String>()


    override fun getItem(p0: Int): Fragment {
        return fragmentList.get(p0)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return fragmentTittleList.get(position)
    }

    override fun getCount(): Int {
        return fragmentList.size
    }

    fun addFragment(f:Fragment,t:String){
        fragmentList.add(f)
        fragmentTittleList.add(t)
    }





}