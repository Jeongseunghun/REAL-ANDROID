package com.example.eplintro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mu_btn.setOnClickListener {
            val intent = Intent(this, SubActivity::class.java)
            startActivity(intent)
        }
        mc_btn.setOnClickListener {
            val intent = Intent(this, MCActivity::class.java)
            startActivity(intent)
        }
        lp_btn.setOnClickListener {
            val intent = Intent(this, LPActivity::class.java)
            startActivity(intent)
        }
        ch_btn.setOnClickListener {
            val intent = Intent(this, CHActivity::class.java)
            startActivity(intent)
        }
        ar_btn.setOnClickListener {
            val intent = Intent(this, ARActivity::class.java)
            startActivity(intent)
        }
        tot_btn.setOnClickListener {
            val intent = Intent(this, TOTActivity::class.java)
            startActivity(intent)
        }
    }
}
