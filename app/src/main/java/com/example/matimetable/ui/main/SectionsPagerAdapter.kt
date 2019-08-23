package com.example.matimetable.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.matimetable.Fragments.*
import com.example.matimetable.R

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment? {

        when(position){

            0 -> { return Wed() }
            1 -> { return Thurs() }
            2 -> { return Fri() }
            3 -> { return Sat() }
            4 -> { return Sun() }
            5 -> { return Mon() }
            else -> return null


        }

    }

    override fun getPageTitle(position: Int): CharSequence? {

        when(position){

            0 -> return "Wed"
            1 -> return "Thur"
            2 -> return "Fri"
            3 -> return "Sat"
            4 -> return "Sun"
            5 -> return "Mon"
        }
        return null
    }

    override fun getCount(): Int {

        return 6
    }
}