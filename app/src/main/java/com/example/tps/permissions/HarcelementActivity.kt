package com.example.tps.permissions

import android.Manifest
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.app.ActivityCompat
import androidx.databinding.DataBindingUtil
import com.example.tps.R
import com.example.tps.databinding.ActivityHarcelementBinding

class HarcelementActivity : AppCompatActivity() {
    val requestPermissionLauncherCall = registerForActivityResult(
        ActivityResultContracts.RequestPermission()
    ) {isGranted : Boolean -> harceler(isGranted)}

    private lateinit var binding : ActivityHarcelementBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_harcelement)

        binding.btnHarceler.setOnClickListener {
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS) == 0) {
                harceler(true)
            } else {
                requestPermissionLauncherCall.launch(Manifest.permission.SEND_SMS)
            }
        }
    }

    private fun harceler(granted: Boolean) {
        if (granted) {
            val manager = SmsManager.getDefault()
            for (i in 1..binding.etNbEnvois.text.toString().toInt()) {
                manager.sendTextMessage(
                    binding.etVictime.text.toString(),
                    null,
                    binding.etContenuMessage.text.toString(),
                    null, null
                )
            }
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("tel:" + binding.etVictime.text.toString())))
        } else {
            Toast.makeText(this, "Laisse-moi te harceler ❤", Toast.LENGTH_LONG).show()
        }
    }
}