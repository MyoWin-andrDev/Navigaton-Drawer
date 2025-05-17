package com.learning.nagivationdrawer.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.learning.nagivationdrawer.R
import com.learning.nagivationdrawer.databinding.FragmentProfileBinding

class ProfileFragment : Fragment(R.layout.fragment_profile){
    private lateinit var binding : FragmentProfileBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentProfileBinding.bind(view)
    }
}