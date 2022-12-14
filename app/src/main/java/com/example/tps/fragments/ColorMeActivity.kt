package com.example.tps.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.tps.R
import com.example.tps.databinding.ActivityColorMeBinding

class ColorMeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<ActivityColorMeBinding>(this, R.layout.activity_color_me)
    }
}