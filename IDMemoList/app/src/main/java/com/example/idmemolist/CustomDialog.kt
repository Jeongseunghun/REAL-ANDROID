package com.example.idmemolist

import android.app.Dialog
import android.content.Context
import android.view.WindowManager

class CustomDialog(context: Context) {
    private val dialog = Dialog(context)

    fun mydig() {
        dialog.setContentView(R.layout.activity_userpw_copy)
        dialog.window!!.setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT)
        dialog.setCanceledOnTouchOutside(true)
        dialog.setCancelable(true)
        dialog.show()
    }
}
//    interface ButtonClickListener{
//        fun onClicked(String)
//
//        private lateinit var onClickedListener: ButtonClickListener
//
//        fun setOnClickedListener(listener : ButtonClickListener){
//            onClickedListener=listener
//        }
//
//    }
