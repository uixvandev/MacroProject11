package com.mobile.macroprojectkelompok11

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity



class SignInActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var editusername : EditText
    private lateinit var editpassword : EditText
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        //mendapatkan data username dan password dari register
        editusername = findViewById(R.id.edt_username)
        editpassword = findViewById(R.id.edt_reg_password)
        val bundle = intent.extras
        if(bundle !=null){
            editusername.setText(bundle.getString("username"))
            editpassword.setText(bundle.getString("password"))
        }

        val btnSignIn : Button = findViewById(R.id.btn_signin)
        btnSignIn.setOnClickListener(this)

        val signUpTextView = findViewById<TextView>(R.id.linkto_signup)
        signUpTextView.setOnClickListener {

            val myIntent = Intent(this, SignUpActivity::class.java)
            startActivity(myIntent)

            signUpTextView.movementMethod = LinkMovementMethod.getInstance()

        }


    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.btn_signin -> {
                val intent = Intent(this@SignInActivity, Izin::class.java)
                startActivity(intent)
            }

        }
    }
}