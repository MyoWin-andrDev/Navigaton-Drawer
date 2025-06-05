package com.learning.nagivationdrawer.util

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import com.learning.nagivationdrawer.R

fun FragmentActivity.replaceFragment(fragment : Fragment){
    supportFragmentManager.beginTransaction().replace(R.id.fcHome, fragment).addToBackStack("").commit()
}