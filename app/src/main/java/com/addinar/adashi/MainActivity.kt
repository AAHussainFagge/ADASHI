package com.addinar.adashi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    companion object{
        var username:String = ""
        var password:String = ""
    }
    var passw="00000"
    var usern="aahfagge"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val login =this.findViewById<Button>(R.id.login) as Button
        val signup = this.findViewById<Button>(R.id.signUp) as TextView
        val forgotpass = this.findViewById<TextView>(R.id.forgotPass) as TextView
        val user_namme =this.findViewById(R.id.loginUserame) as EditText
        val pass_word = this.findViewById(R.id.loginPassword) as EditText

        username=user_namme.text.toString()
        password= pass_word.text.toString()

        signup.setOnClickListener {
            val i= Intent(this,sign_up ::class.java)
                Intent(i)
            startActivity(i)
        }

        login.setOnClickListener {

                val i=Intent(this,Home_fage::class.java)
                Intent(i)
                startActivity(i)

        }
        forgotpass.setOnClickListener {
            val i=Intent(this,forgot_password::class.java)
            Intent(i)
            startActivity(i)
        }


    }
}