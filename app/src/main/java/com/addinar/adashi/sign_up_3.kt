package com.addinar.adashi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class sign_up_3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up3)
        val next= this.findViewById<Button>(R.id.next3) as Button

        next.setOnClickListener {
            val i = Intent(this,sign_up_4::class.java)
            Intent(i)
            startActivity(i)
        }

    }
}