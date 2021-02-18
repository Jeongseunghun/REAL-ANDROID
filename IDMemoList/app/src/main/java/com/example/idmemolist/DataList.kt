package com.example.idmemolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.idmemolist.databinding.ActivityDataListBinding
import com.example.idmemolist.databinding.ActivityMainBinding

class DataList : AppCompatActivity() {
    private lateinit var binding: ActivityDataListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDataListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.homebtn.setOnClickListener{
            val intent = Intent(this, Category::class.java)
            startActivity(intent)
        }

        binding.logo.setOnClickListener{
            val intent = Intent(this, Category::class.java)
            startActivity(intent)
        }

        binding.etcButton.setOnClickListener {
            val dialog = CustomDialog(this)
            dialog.mydig()
        }

        val profileList = arrayListOf(
                Profiles("Naver","jsh111","*****"),
                Profiles("Daum","jsh211","*****"),
                Profiles("U-saint","jsh311","*****"),
                Profiles("blog","jsh411","*****"),
                Profiles("cafe","jsh511","*****"),
                Profiles("etc","jsh611","*****")
        )

        binding.recyclerView.layoutManager= LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.recyclerView.setHasFixedSize(true)

        binding.recyclerView.adapter = profileAdapter(profileList)

    }


}