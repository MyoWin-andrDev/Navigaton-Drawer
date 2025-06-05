package com.learning.nagivationdrawer

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.learning.nagivationdrawer.databinding.ActivityMainBinding
import com.learning.nagivationdrawer.fragment.LogoutFragment
import com.learning.nagivationdrawer.fragment.ProfileFragment
import com.learning.nagivationdrawer.fragment.SettingFragment
import com.learning.nagivationdrawer.util.replaceFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupToolbar()
        replaceFragment(ProfileFragment())
            //Setting as Default Fragment
            var fragment : Fragment = ProfileFragment()
            replaceFragment(fragment)
    }

    private fun setupToolbar() = with(binding){
        tbMain.apply {
            title = "Sample"
            setNavigationIcon(R.drawable.ic_menu)
            setNavigationOnClickListener {
                dlMain.open()
            }
        }
    }

    private fun setupNavigationDrawer() = with(binding){
        nvMain.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.menu_profile -> replaceFragment(ProfileFragment())
                R.id.menu_setting -> replaceFragment(SettingFragment())
                R.id.menu_logout -> replaceFragment(LogoutFragment())
            }
            dlMain.close()
            true
        }
    }
}