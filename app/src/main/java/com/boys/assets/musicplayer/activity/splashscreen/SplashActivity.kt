package com.boys.assets.musicplayer.activity.splashscreen

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.boys.assets.musicplayer.R
import com.boys.assets.musicplayer.activity.music.presentation.SearchActivity
import com.boys.assets.musicplayer.utils.LogUtil

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        supportActionBar!!.hide()
        setupScreen()
    }

    fun setupScreen() {
        val background: Thread = object : Thread() {
            override fun run() {
                try {
                    // Thread will sleep for 5 seconds
                    sleep((1 * 1000).toLong())

                    val i = Intent(baseContext, SearchActivity::class.java)
                    startActivity(i)

                    //Remove activity
                    finish()
                } catch (e: Exception) {
                    LogUtil.e("SplashActivity", "Err : ${e.message}")
                }
            }
        }
        // start thread
        background.start()
    }
}