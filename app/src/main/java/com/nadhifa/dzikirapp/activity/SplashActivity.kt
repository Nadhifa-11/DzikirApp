package com.nadhifa.dzikirapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.nadhifa.dzikirapp.MainActivity
import com.nadhifa.dzikirapp.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        supportActionBar?.hide()
        Handler(mainLooper).postDelayed({
            startActivity(MainActivity.getLaunchService(this))
            finish()
        },3000)
    }
}