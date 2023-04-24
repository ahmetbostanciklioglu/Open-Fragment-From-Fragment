package com.ahmetbostanciklioglu.passfragmettofragment.fragments

import androidx.fragment.app.Fragment
import com.ahmetbostanciklioglu.passfragmettofragment.R


fun Fragment.replace(fragment: Fragment) {

    parentFragmentManager.beginTransaction().apply {
        replace(R.id.container_fragment, fragment).addToBackStack(null).commit()
    }
}
