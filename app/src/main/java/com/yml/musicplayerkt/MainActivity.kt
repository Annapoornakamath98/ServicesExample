package com.yml.musicplayerkt

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var button4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1=findViewById(R.id.backgroundStart)
        button2=findViewById(R.id.backgroundStop)
        button3=findViewById(R.id.foregroundStart)
        button4=findViewById(R.id.foregroundStop)
        button1.setOnClickListener {
            startService(Intent(this,BackgroundService::class.java))
            Toast.makeText(this,"Started background service",Toast.LENGTH_SHORT).show()
        }
        button2.setOnClickListener {
            stopService(Intent(this,BackgroundService::class.java))
            Toast.makeText(this,"Stopped background service",Toast.LENGTH_SHORT).show()
        }
        button3.setOnClickListener {
            startService(Intent(this,ForegroundService::class.java))
            Toast.makeText(this,"Started foreground service",Toast.LENGTH_SHORT).show()
        }
        button4.setOnClickListener {
            stopService(Intent(this,ForegroundService::class.java))
            Toast.makeText(this,"Stopped foreground service",Toast.LENGTH_SHORT).show()
        }

    }
}