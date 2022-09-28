package com.bbbrrr8877.android.factorialtest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bbbrrr8877.android.factorialtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}