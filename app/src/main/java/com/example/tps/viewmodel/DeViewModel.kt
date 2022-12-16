package com.example.tps.viewmodel

import androidx.lifecycle.ViewModel
import kotlin.random.Random

class DeViewModel : ViewModel() {
    var de1 = 0
    var borneDe1 = "6"
    var de2 = 0
    var borneDe2 = "6"
    var de3 = 0
    var borneDe3 = "6"

    fun lancerDe() {
        de1 = Random.nextInt(1, borneDe1.toInt() + 1)
        de2 = Random.nextInt(1, borneDe2.toInt() + 1)
        de3 = Random.nextInt(1, borneDe3.toInt() + 1)
    }
}