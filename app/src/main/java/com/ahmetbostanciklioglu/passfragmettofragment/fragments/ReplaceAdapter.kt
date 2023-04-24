package com.ahmetbostanciklioglu.passfragmettofragment.fragments

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.ahmetbostanciklioglu.passfragmettofragment.R


fun AppCompatActivity.replace(fragment: Fragment) {
    supportFragmentManager.beginTransaction().apply {
        replace(R.id.container_fragment, fragment).addToBackStack(null).commit()
    }
}

fun Fragment.replace(fragment: Fragment) {

    parentFragmentManager.beginTransaction().apply {
        replace(R.id.container_fragment, fragment).addToBackStack(null).commit()
    }
}
