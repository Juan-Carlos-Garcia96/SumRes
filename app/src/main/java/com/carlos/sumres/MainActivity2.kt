package com.carlos.sumres

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun nextSuma(view: View) {
        val intent = Intent(applicationContext, MainActivity3::class.java )
        startActivity(intent)
        Toast.makeText(applicationContext, "APRENDIENDO A SUNMAR", Toast.LENGTH_SHORT).show()
    }
}