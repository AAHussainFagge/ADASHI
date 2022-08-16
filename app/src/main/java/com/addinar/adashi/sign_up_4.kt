package com.addinar.adashi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class sign_up_4 : AppCompatActivity() {

    val pass_word =this.findViewById(R.id.Password) as EditText
    val pass_word2 =this.findViewById(R.id.Password2) as EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up4)
        //sign up

        var EmailOrPhone=sign_up.email_phone

        //sign up 1

        var fName=sign_up_1.fName
        var lName=sign_up_1.lName
        var userName=sign_up_1.userName

            // sign up 2

        var nextOfKin=""
        var nextOfKinNumer=""

        //sign up 3

        var inviteCode=""

        //sign up 4

        var password=pass_word.text
        var password2=pass_word2.text

    }
}