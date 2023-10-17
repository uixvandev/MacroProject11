package com.mobile.macroprojectkelompok11

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.mobile.macroprojectkelompok11.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(FragmentHome())

        binding.bottomNav.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.homeItem -> replaceFragment(FragmentHome())
                R.id.mapsItem -> replaceFragment(FragmentMaps())

                else -> {

                }
            }
            true
        }


    }



    //    Memanggil fragment ke frame_layout di activity_main
    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.content, fragment)
        fragmentTransaction.commit()
    }
}