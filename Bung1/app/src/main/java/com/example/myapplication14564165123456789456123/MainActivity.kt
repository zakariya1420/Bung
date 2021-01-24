package com.example.myapplication14564165123456789456123

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var bung:TextView = findViewById(R.id.bung)
        bung.setText("Chanawee")
    }
}