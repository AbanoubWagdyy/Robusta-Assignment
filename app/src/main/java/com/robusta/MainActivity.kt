package com.robusta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

//    http://api.openweathermap.org/data/2.5/forecast?id=524901&APPID=6850fd241da4505a67e28c81a2a116df

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}