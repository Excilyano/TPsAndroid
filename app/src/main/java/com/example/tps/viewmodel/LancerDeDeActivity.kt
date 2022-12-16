package com.example.tps.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.tps.R
import com.example.tps.databinding.ActivityLancerDeDeBinding

class LancerDeDeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<ActivityLancerDeDeBinding>(this, R.layout.activity_lancer_de_de)
    }
}