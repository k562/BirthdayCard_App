package com.example.bdaycard

import android.animation.Animator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.view.WindowManager
import androidx.appcompat.app.AppCompatDelegate
import com.airbnb.lottie.LottieAnimationView

class Splashscreen : AppCompatActivity() {
    lateinit var animation : LottieAnimationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_splashscreen)


        animation = findViewById(R.id.surprise)

        Handler(Looper.getMainLooper()).postDelayed(Runnable {

        val intent = Intent(this@Splashscreen, MainActivity :: class.java)
        startActivity(intent)
        finish()

        },6000)

        animation.visibility = View.VISIBLE
        animation.playAnimation()
    }


}

