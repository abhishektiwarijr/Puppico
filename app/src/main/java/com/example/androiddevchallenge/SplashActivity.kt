package com.example.androiddevchallenge

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        scheduleSplashScreen()
    }
    private fun scheduleSplashScreen() {
        val splashScreenDuration = getSplashScreenDuration()
        Handler(Looper.getMainLooper()).postDelayed({
                startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                finish()
            },splashScreenDuration)
    }
    private fun getSplashScreenDuration(): Long {
        val sp = getPreferences(Context.MODE_PRIVATE)
        val prefKeyFirstLaunch = "pref_first_launch"
        return when(sp.getBoolean(prefKeyFirstLaunch, true)) {
            true -> {
                // If this is the first launch, make it slow (> 3 seconds) and set flag to false
                sp.edit().putBoolean(prefKeyFirstLaunch, false).apply()
                2000
            }
            false -> {
                // If the user has launched the app, make the splash screen fast (<= 1 seconds)
                1000
            }
        }
    }
}