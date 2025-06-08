package com.learning.nagivationdrawer

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.learning.nagivationdrawer.databinding.ActivityMainBinding
import com.learning.nagivationdrawer.fragment.ProfileFragment
import com.learning.nagivationdrawer.fragment.SettingFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupToolbar()
        replaceFragment(ProfileFragment())
        setHeaderTitle()
        handleNavigationClicks()
    }

    private fun setHeaderTitle() = with(binding) {
        val headerView = binding.nvMain.getHeaderView(0)
        val tvUsername = headerView.findViewById<TextView>(R.id.tvName)
        tvUsername.text = "Ezekiel"
    }

    private fun setupToolbar() = with(binding) {
        tbMain.apply {
            title = "Sample"
            setNavigationIcon(R.drawable.ic_menu)
            setOnClickListener { dlMain.open() }
        }
    }


    private fun handleNavigationClicks() = with(binding) {
        nvMain.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.menu_profile -> {
                    replaceFragment(ProfileFragment())
                    dlMain.close()
                }

                R.id.menu_setting -> {
                    replaceFragment(SettingFragment())
                    dlMain.close()
                }

                R.id.menu_logout -> {
                    finishAffinity()
                }
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fcHome, fragment)
            .addToBackStack(null)
            .commit()
    }
}
