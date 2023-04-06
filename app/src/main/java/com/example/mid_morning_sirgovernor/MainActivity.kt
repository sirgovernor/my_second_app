package com.example.mid_morning_sirgovernor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var  texttologin:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texttologin=findViewById(R.id.txt_gotologin)
        texttologin.setOnClickListener {
            var intent=Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
    }
}