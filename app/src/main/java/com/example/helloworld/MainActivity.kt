package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.Toast.makeText as makeText1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.TryMeButton)
        button.setOnClickListener {
            Toast.makeText(this, "Don't Do Anything Stupid Until I Come Back", Toast.LENGTH_LONG).show()
        }
    }
}
