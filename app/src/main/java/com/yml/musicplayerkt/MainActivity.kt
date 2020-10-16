package com.yml.musicplayerkt

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var button1: Button
    lateinit var button3: Button
    lateinit var music1:MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1=findViewById(R.id.play)
        //button2=findViewById(R.id.pause)
        button3=findViewById(R.id.stop)
        music1=MediaPlayer.create(this,R.raw.song)
        button1.setOnClickListener {
            startService(Intent(applicationContext, MyService::class.java))
            Toast.makeText(applicationContext, "Playing", Toast.LENGTH_SHORT).show()
        }
//        button2.setOnClickListener {
//            music1.pause()
//            Toast.makeText(getApplicationContext(), "Paused", Toast.LENGTH_SHORT).show()
//        }
//        button3.setOnClickListener {
//            stopService(Intent(applicationContext, MyService::class.java))
//            Toast.makeText(applicationContext, "Stopped", Toast.LENGTH_SHORT).show()
//        }
        button3.setOnClickListener{
            stopService(Intent(applicationContext,MyService::class.java))
            Toast.makeText(getApplicationContext(), "Stopped", Toast.LENGTH_SHORT).show()
        }
    }
}