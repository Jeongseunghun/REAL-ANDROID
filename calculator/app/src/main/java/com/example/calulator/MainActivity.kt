package com.example.calulator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var a: String = ""
        var list = mutableListOf<String>()
        var b: Long = 0L
        var c: Long = 1L
        var d: Double = 1.0


        num_1_button.setOnClickListener {

          result_text.setText(result_text.getText().append("1"))
            a=result_text.getText().toString()
        }
        num_2_button.setOnClickListener {
            new += "2"
            result_text.text = new
        }
        num_3_button.setOnClickListener {
            new += "3"
            result_text.text = new
        }
        num_4_button.setOnClickListener {
            new += "4"
            result_text.text = new
        }
        num_5_botton.setOnClickListener {
            new += "5"
            result_text.text = new
        }
        num_6_button.setOnClickListener {
            new += "6"
            result_text.text = new
        }
        num_7_button.setOnClickListener {
            new += "7"
            result_text.text = new
        }
        num_8_button.setOnClickListener {
            new += "8"
            result_text.text = new
        }
        num_9_button.setOnClickListener {
            new += "9"
            result_text.text = new
        }
        num_0_button.setOnClickListener {
            new += "0"
            result_text.text = new
        }

        all_clear_button.setOnClickListener {
            new="0"
            old="0"
            result_text.text="0"
        }



    }


    }
