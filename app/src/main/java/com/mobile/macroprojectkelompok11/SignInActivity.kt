package com.mobile.macroprojectkelompok11

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity



class SignInActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val btnSignIn : Button = findViewById(R.id.btn_signin)
        btnSignIn.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.btn_signin -> {
                val intent = Intent(this@SignInActivity, MainActivity::class.java)
                startActivity(intent)
            }

        }
    }
}