package com.learning.nagivationdrawer.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.learning.nagivationdrawer.R
import com.learning.nagivationdrawer.databinding.FragmentSettingBinding

class SettingFragment : Fragment(R.layout.fragment_setting){
    private lateinit var binding : FragmentSettingBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSettingBinding.bind(view)
    }
}