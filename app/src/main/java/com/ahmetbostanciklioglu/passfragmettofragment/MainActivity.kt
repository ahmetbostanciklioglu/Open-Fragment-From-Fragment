package com.ahmetbostanciklioglu.passfragmettofragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.ahmetbostanciklioglu.passfragmettofragment.fragments.HomeFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeFragment = HomeFragment()
        val fragment: Fragment? =
            supportFragmentManager.findFragmentByTag(HomeFragment::class.java.simpleName)

        if (fragment !is HomeFragment) {
            supportFragmentManager.beginTransaction()
                .add(R.id.container_fragment, homeFragment, HomeFragment::class.java.simpleName)
                .commit()
        }
    }
}