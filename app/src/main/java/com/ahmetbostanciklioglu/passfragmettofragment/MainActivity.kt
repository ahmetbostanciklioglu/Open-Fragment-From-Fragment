package com.ahmetbostanciklioglu.passfragmettofragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ahmetbostanciklioglu.passfragmettofragment.fragments.HomeFragment
import com.ahmetbostanciklioglu.passfragmettofragment.fragments.replace

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        replace(HomeFragment())
    }
}