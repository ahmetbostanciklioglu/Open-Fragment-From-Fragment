package com.ahmetbostanciklioglu.passfragmettofragment.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isGone
import androidx.fragment.app.Fragment
import com.ahmetbostanciklioglu.passfragmettofragment.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val bind = FragmentHomeBinding.inflate(layoutInflater)
        bind.fragmentHomeButton.setOnClickListener {
            replace(FragmentOne())

        }
        return bind.root
    }

}