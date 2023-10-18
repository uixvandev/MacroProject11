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

class SignUpActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var editusername : EditText
    private lateinit var editpassword : EditText
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        editusername = findViewById(R.id.edt_username)
        editpassword = findViewById(R.id.edt_reg_password)
        val bundle = intent.extras
        if(bundle != null){
            editusername.setText(bundle.getString("username"))
            editpassword.setText(bundle.getString("password"))
        }

        val btnRegister: Button = findViewById(R.id.btn_regist)
        btnRegister.setOnClickListener(this)

        val signInTextView = findViewById<TextView>(R.id.linkto_signin)
        signInTextView.setOnClickListener {

            val myIntent = Intent(this, SignInActivity::class.java)
            startActivity(myIntent)

            signInTextView.movementMethod = LinkMovementMethod.getInstance()

        }
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_regist-> {
                val bundle = Bundle()
                bundle.putString("username", editusername.text.toString())
                bundle.putString("password", editpassword.text.toString())

                val intent = Intent(this@SignUpActivity, SignInActivity::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
            }
        }
    }
}