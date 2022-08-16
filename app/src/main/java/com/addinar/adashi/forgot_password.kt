package com.addinar.adashi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class forgot_password : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)
        val next = this.findViewById<Button>(R.id.nextf) as Button
        next.setOnClickListener {
            val i = Intent(this, forgot_password_1::class.java)
            Intent(i)
            startActivity(i)

        }
    }
}