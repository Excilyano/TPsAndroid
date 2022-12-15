package com.example.tps.safeargs

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Histoire (val nom : String, val lieu : String) : Parcelable