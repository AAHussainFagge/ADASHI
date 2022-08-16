package com.addinar.adashi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class sign_up : AppCompatActivity() {


    companion object{
     lateinit   var email_phone:String
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        val next = this.findViewById<Button>(R.id.next) as Button




         next.setOnClickListener {
            val i = Intent(this,sign_up_1::class.java)
            Intent(i)
            startActivity(i)

        }
    }
}