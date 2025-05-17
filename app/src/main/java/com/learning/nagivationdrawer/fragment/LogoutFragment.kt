package com.learning.nagivationdrawer.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.learning.nagivationdrawer.R
import com.learning.nagivationdrawer.databinding.FragmentLogoutBinding

class LogoutFragment : Fragment(R.layout.fragment_logout){
    private lateinit var binding : FragmentLogoutBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentLogoutBinding.bind(view)
        binding.btLogout.setOnClickListener {
            requireActivity().finish()
        }
    }
}