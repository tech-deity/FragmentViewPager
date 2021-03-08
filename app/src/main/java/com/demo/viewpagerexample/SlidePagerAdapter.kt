package com.demo.viewpagerexample

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

@Suppress("DEPRECATION")
class SlidePagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 3;

    }

    override fun getItem(position: Int): Fragment {

        when (position) {
            0 -> {return Pager1()}

            1 -> { return Pager2()}

            2 -> {return Pager3()}

            else -> return null!!
        }


    }


}