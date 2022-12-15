package com.example.tps.safeargs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.tps.R
import com.example.tps.databinding.ActivityHistoireBinding

class HistoireActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<ActivityHistoireBinding>(this, R.layout.activity_histoire)
    }
}