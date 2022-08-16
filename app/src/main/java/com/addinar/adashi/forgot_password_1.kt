package com.addinar.adashi

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Intents.Insert.ACTION
import android.text.Editable
import android.view.KeyEvent.ACTION_DOWN
import android.view.KeyEvent.KEYCODE_DEL
import android.view.MotionEvent.ACTION_DOWN
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.FrameLayout
import androidx.compose.ui.input.key.KeyEvent
import android.text.TextWatcher as TextWatcher1


class forgot_password_1 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password1)
    val otp1= this.findViewById(R.id.otp1)  as EditText
    val otp =otp1.text

    }

}
