package com.ahmetbostanciklioglu.passfragmettofragment.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ahmetbostanciklioglu.passfragmettofragment.databinding.FragmentOneBinding

class FragmentOne : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val bind = FragmentOneBinding.inflate(layoutInflater)
        bind.fragmentOneButton.setOnClickListener {
            replace(FragmentTwo())
        }

        return bind.root
    }


}