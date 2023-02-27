package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 : Button = findViewById(R.id.sofaButton1) as Button
        val text1 : TextView = findViewById(R.id.textView1) as TextView
        button1.setOnClickListener {
            text1.text = "Academy"
        }
        val button2 : Button = findViewById(R.id.sofaButton2) as Button
        val text2 : TextView = findViewById(R.id.textView2) as TextView
        button2.setOnClickListener {
            if(View.VISIBLE == text2.visibility)
                text2.visibility = View.INVISIBLE
            else if(View.INVISIBLE == text2.visibility)
                text2.visibility = View.VISIBLE
        }
    }
}