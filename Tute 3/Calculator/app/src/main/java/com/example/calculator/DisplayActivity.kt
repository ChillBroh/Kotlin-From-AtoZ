package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DisplayActivity : AppCompatActivity() {
    private lateinit var btnBack:Button;
    private lateinit var txtAns:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btnBack = findViewById(R.id.btnBack)
        txtAns = findViewById(R.id.TxtAnswerShow)

        txtAns.text = intent.getDoubleExtra("answer", 0.0).toString()

        btnBack.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}