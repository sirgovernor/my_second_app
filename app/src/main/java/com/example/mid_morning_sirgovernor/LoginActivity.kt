package com.example.mid_morning_sirgovernor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    lateinit var texttoregister:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        texttoregister=findViewById(R.id.txt_gotoregister)
        texttoregister.setOnClickListener {
            var intent= Intent(this,MainActivity::class.java)
             startActivity(intent)
        }
    }
}