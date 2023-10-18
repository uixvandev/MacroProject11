package com.mobile.macroprojectkelompok11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mobile.macroprojectkelompok11.databinding.ActivityInfoInformasiBinding

class InfoInformasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityInfoInformasiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.kembali.setOnClickListener {
            finish() // menutup InfoInformasi Activity dan kembali ke FragmentWawasanInformasi
        }

    }
}