package com.mobile.macroprojectkelompok11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mobile.macroprojectkelompok11.databinding.ActivityIzinBinding

class Izin : AppCompatActivity() {

    private lateinit var binding: ActivityIzinBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIzinBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnsayasetuju.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}