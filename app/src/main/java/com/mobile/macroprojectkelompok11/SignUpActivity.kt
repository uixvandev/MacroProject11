package com.mobile.macroprojectkelompok11

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        val btnRegister: Button = findViewById(R.id.btn_regist)
        btnRegister.setOnClickListener(this)

        val signInTextView = findViewById<TextView>(R.id.link_signIn)
        signInTextView.setOnClickListener {

            val myIntent = Intent(this, SignInActivity::class.java)
            startActivity(myIntent)

            signInTextView.movementMethod = LinkMovementMethod.getInstance()

        }
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_regist-> {
                val intent = Intent(this@SignUpActivity, SignInActivity::class.java)
                startActivity(intent)
            }
        }
    }
}