package com.example.tps.findview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

import com.example.tps.R
import kotlin.random.Random

class RandomActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random)

        val etMin = findViewById<EditText>(R.id.et_min)
        val etMax = findViewById<EditText>(R.id.et_max)

        findViewById<Button>(R.id.btn_random).setOnClickListener {
            val min = etMin.text.toString().toInt()
            val max = etMax.text.toString().toInt()
            findViewById<TextView>(R.id.tv_random).text = Random.nextInt(min,max).toString()
        }
    }
}