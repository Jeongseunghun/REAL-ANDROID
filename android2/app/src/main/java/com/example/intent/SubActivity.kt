package com.example.intent

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_sub.*

class SubActivity :AppCompatActivity(){

    override fun onCreate(savedInsstanceState: Bundle?){
        super.onCreate(savedInsstanceState)
        setContentView(R.layout.activity_sub)

        btn2.setOnClickListener {
            val intent = Intent( this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}