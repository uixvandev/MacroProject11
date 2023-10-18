package com.mobile.macroprojectkelompok11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mobile.macroprojectkelompok11.databinding.ActivityIzinBinding
import com.mobile.macroprojectkelompok11.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageback.setOnClickListener{
            //val intent = Intent(this, MainActivity::class.java)
                finish() // menutup halaman profile
            //startActivity(intent)
        }

    }
}