package com.example.mealbox

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            val intent = Intent(this,Splash::class.java)
            startActivity(intent) // 로딩 액티비티로 화면전환
        }
    }