package com.yml.musicplayerkt

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

class MyService : Service() {
    lateinit var music:MediaPlayer

    override fun onCreate() {
        music= MediaPlayer.create(this,R.raw.song)
        super.onCreate()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        music.start()
        return START_STICKY
    }
    override fun onDestroy() {
        music.stop()
        super.onDestroy()
    }


    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }
}
