package com.example.toastnotification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.toastnotification.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnToast.setOnClickListener {
//            Toast.makeText(this, "This is a toast tutorial", Toast.LENGTH_LONG).show()

            // implementing the custom toast
            val customToast = Toast(this)
            customToast.duration = Toast.LENGTH_LONG
            customToast.view = layoutInflater.inflate(R.layout.custom_toast, findViewById(R.id.clToast))
            customToast.show()

        }
    }
}