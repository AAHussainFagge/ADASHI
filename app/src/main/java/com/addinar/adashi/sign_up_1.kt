package com.addinar.adashi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class sign_up_1 : AppCompatActivity() {
    val firsname=this.findViewById(R.id.firstname) as EditText
    val lastname=this.findViewById(R.id.lastname) as EditText
    val username=this.findViewById(R.id.Username) as EditText
    companion object{
        var fName=""
        var lName=""
        var userName= ""
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up1)
        val next = this.findViewById<Button>(R.id.next1) as Button

        fName= firsname.text.toString()
        lName=lastname.text.toString()
        userName=username.text.toString()






            next.setOnClickListener {
            val i= Intent(this,sign_up_2::class.java)
            Intent(i)
            startActivity(i)
        }
    }
}