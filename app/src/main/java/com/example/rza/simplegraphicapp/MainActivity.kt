package com.example.rza.simplegraphicapp

import android.app.Activity
import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val thirty = 30_000L

        val player = MediaPlayer.create(this, R.raw.success)
        player.start()

        val handler = Handler()
        handler.postDelayed({ this@MainActivity.finishAndRemoveTask() }, thirty)
    }
}
