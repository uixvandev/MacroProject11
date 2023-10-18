package com.mobile.macroprojectkelompok11

import android.content.res.ColorStateList
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.mobile.macroprojectkelompok11.databinding.ActivityInfoInformasiBinding
import com.mobile.macroprojectkelompok11.databinding.ActivityInformasiaqidanpm25Binding

class Informasiaqidanpm25_Activity : AppCompatActivity() {

    lateinit var binding: ActivityInformasiaqidanpm25Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInformasiaqidanpm25Binding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(Fragment_Informasi_AQI())

        binding.buttonfragmentaqi.setOnClickListener{
            val informasiaqidanpm25Screen = binding.Informasiaqidanpm25Screen

            informasiaqidanpm25Screen.bringChildToFront(binding.buttonfragmentaqi)
            binding.buttonfragmentaqi.backgroundTintList = ColorStateList.valueOf(ContextCompat.getColor(this,R.color.biru_cyan))
            binding.buttonfragmentaqi.setTextColor(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.white)))

            binding.buttonfragmentpm25.backgroundTintList = ColorStateList.valueOf(ContextCompat.getColor(this,R.color.button_abu))
            binding.buttonfragmentpm25.setTextColor(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.black50percent)))
            replaceFragment(Fragment_Informasi_AQI())
        }

        binding.buttonfragmentpm25.setOnClickListener{
            val informasiaqidanpm25Screen = binding.Informasiaqidanpm25Screen

            informasiaqidanpm25Screen.bringChildToFront(binding.buttonfragmentpm25)
            binding.buttonfragmentpm25.backgroundTintList = ColorStateList.valueOf(ContextCompat.getColor(this, R.color.biru_cyan))
            binding.buttonfragmentpm25.setTextColor(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.white)))

            binding.buttonfragmentaqi.backgroundTintList = ColorStateList.valueOf(ContextCompat.getColor(this,R.color.button_abu))
            binding.buttonfragmentaqi.setTextColor(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.black50percent)))
            replaceFragment(Fragment_Informasi_PM25())
        }


        binding.textView2.setOnClickListener {
            finish() // menutup halaman informasiAQIdanPM2.5
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentcontainer, fragment)
        fragmentTransaction.commit()
    }
}