package com.example.task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickRed=findViewById<TextView>(R.id.redButton)
        val clickBlue=findViewById<TextView>(R.id.blueButton)
        val clickGreen=findViewById<TextView>(R.id.greenButton)
        val clickResult=findViewById<TextView>(R.id.colorView)

        clickRed.setOnClickListener{
            clickResult.text="Red was clicked"
        }
        clickBlue.setOnClickListener{
            clickResult.text="Blue was clicked"
        }
        clickGreen.setOnClickListener{
            clickResult.text="Green was clicked"
        }
    }
}