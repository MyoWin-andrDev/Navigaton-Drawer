package com.learning.nagivationdrawer.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.learning.nagivationdrawer.R
import com.learning.nagivationdrawer.databinding.FragmentProfileBinding

class ProfileFragment : Fragment(R.layout.fragment_profile) {
    private val binding by lazy { FragmentProfileBinding.bind(requireView()) }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}