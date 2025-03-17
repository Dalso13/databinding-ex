package com.jdw.databinding_ex

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.jdw.databinding_ex.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        // 기존 방식
//        val btn = findViewById<Button>(R.id.testButton)
//        btn.setOnClickListener {
//            Toast.makeText(this, "click", Toast.LENGTH_LONG).show()
//        }

        // 데이터 바인딩 이용
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.testButton.setOnClickListener {
            Toast.makeText(this, "click", Toast.LENGTH_LONG).show()
        }

    }
}