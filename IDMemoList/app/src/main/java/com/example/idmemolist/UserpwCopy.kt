package com.example.idmemolist

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import com.example.idmemolist.databinding.ActivityUserpwCopyBinding
import java.lang.Exception

class UserpwCopy : AppCompatActivity() {
    private lateinit var  binding : ActivityUserpwCopyBinding
    private val OPEN_GALLERY=1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserpwCopyBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button2.setOnClickListener { openGallery() }
        binding.imageView16.setOnClickListener{
            val intent = Intent(this, DataList::class.java)
            startActivity(intent)
        }

        binding.button5.setOnClickListener{
            val inputID = binding.editText3.text.toString()
            val inputPW = binding.editText2.text.toString()

            val nextIntent = Intent(this, DataList::class.java)
            nextIntent.putExtra("ID", inputID)
            nextIntent.putExtra("PW", inputPW)
            startActivity(nextIntent)

        }

    }
    private fun openGallery()
    {
        val intent: Intent = Intent(Intent.ACTION_GET_CONTENT)
        intent.setType("image/*")
        startActivityForResult(intent, OPEN_GALLERY)
    }

    @Override
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode == Activity.RESULT_OK) {
            if (requestCode == OPEN_GALLERY) {
                var currentImageUrl: Uri? = data?.data

                try {
                    val bitmap = MediaStore.Images.Media.getBitmap(contentResolver, currentImageUrl)
                    binding.imageView3.setImageBitmap(bitmap)
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }
        else {
            Log.d("ActivityResult", "something wrong")
        }
    }


}