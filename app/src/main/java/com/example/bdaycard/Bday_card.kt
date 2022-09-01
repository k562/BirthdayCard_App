package com.example.bdaycard

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bday_card.*

class Bday_card : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bday_card)
      val name_input = intent.getStringExtra("name")
      Txt_name.text = "Happy birthday $name_input"
        title = "Happy Birthday $name_input"

    }
}