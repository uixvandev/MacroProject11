package com.mobile.macroprojectkelompok11

import android.content.Intent
import android.content.res.ColorStateList
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.mobile.macroprojectkelompok11.databinding.ActivityDetailDataLokasiBinding

class DetailDataLokasiActivity : AppCompatActivity() {

    lateinit var binding : ActivityDetailDataLokasiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityDetailDataLokasiBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(Fragment_Riwayat_Jam())

        binding.imageshare.setOnClickListener{
            val message = "Kualitas udara saat ini di Condet adalah PM2.5 sebesar 72 dan AQI mencapai 157. Jika anda berada didaerah ini, jaga kesehatan Anda dan hindari aktivitas di luar ruangan jika memungkinkan."
            intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_TEXT, message)
            startActivity(intent)
        }

        binding.textView21.setOnClickListener{
            binding.textView21.backgroundTintList = ColorStateList.valueOf(ContextCompat.getColor(this,R.color.biru_cyan))
            binding.textView21.setTextColor(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.white)))

            binding.textView29.backgroundTintList = ColorStateList.valueOf(ContextCompat.getColor(this,R.color.button_abu))
            binding.textView29.setTextColor(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.black50percent)))
            replaceFragment(Fragment_Riwayat_Jam())
        }

        binding.textView29.setOnClickListener{

            binding.textView29.backgroundTintList = ColorStateList.valueOf(ContextCompat.getColor(this, R.color.biru_cyan))
            binding.textView29.setTextColor(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.white)))

            binding.textView21.backgroundTintList = ColorStateList.valueOf(ContextCompat.getColor(this,R.color.button_abu))
            binding.textView21.setTextColor(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.black50percent)))
            replaceFragment(Fragment_Riwayat_Hari())
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainerDetailLokasi, fragment)
        fragmentTransaction.commit()
    }
}