package com.mobile.macroprojectkelompok11

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val splashTime: Long = 2000 // lama splashscreen berjalan

        // Menggunakan Handler untuk menunda perpindahan ke MainActivity
        Handler().postDelayed({
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent) // Pindah ke Home Activity setelah 3 detik
            finish()
        }, splashTime)
    }
}