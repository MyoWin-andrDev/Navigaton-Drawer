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

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.apply {
            setContentView(root)
            //Setting as Default Fragment
            var fragment : Fragment = ProfileFragment()
            supportFragmentManager.beginTransaction().replace(R.id.fcHome, fragment).addToBackStack("").commit()
            tbMain.apply {
                title = "Sample"
                setNavigationIcon(R.drawable.ic_menu)
                //Toggle Listener
                setOnClickListener { dlMain.open() }
                //Nav Item Listener
                nvMain.setNavigationItemSelectedListener {
                    when(it.itemId){
                        R.id.menu_profile -> {
                            fragment = ProfileFragment()
                            dlMain.close()
                        }
                        R.id.menu_setting -> {
                            fragment = SettingFragment()
                            dlMain.close()
                        }
                        R.id.menu_logout -> {
                            fragment = LogoutFragment()
                            dlMain.close()
                        }
                    }
                    replaceFragment(fragment)
                    true
                }
            }
        }
    }
    private fun replaceFragment(fragment : Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.fcHome, fragment).addToBackStack("").commit()
    }
}