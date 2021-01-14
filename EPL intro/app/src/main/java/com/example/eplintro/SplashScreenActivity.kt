package com.example.eplintro

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.view.animation.TranslateAnimation
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.first.*
import android.os.Handler


class SplashScreenActivity:AppCompatActivity() {

    private val SPLASH_TIME_OUT:Long =3000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first)
        this.supportActionBar?.hide()


//        var slideDownAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_down)
//        splash_title.startAnimation(slideDownAnimation)
        slideUp(splash_title, 1500)
        Handler().postDelayed({
            var fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in)
            second_title.startAnimation(fadeInAnimation)
            second_title.visibility =View.VISIBLE

        },2000)
        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, SPLASH_TIME_OUT)
    }

    fun slideDown(view: View, time: Int){
        val animation=TranslateAnimation(0f,0f,0f,0f)
        animation.duration = time.toLong()
        animation.fillAfter = true
        view.startAnimation(animation)
    }

    fun slideUp(view: View, time: Int){
        val animation=TranslateAnimation(0f,0f,0f,-300f)
        animation.duration = time.toLong()
        animation.fillAfter = true
        view.startAnimation(animation)
    }
}