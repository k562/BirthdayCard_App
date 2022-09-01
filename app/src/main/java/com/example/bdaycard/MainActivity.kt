package com.example.bdaycard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var edt_inputname: EditText
    lateinit var btn_bdaycard : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        edt_inputname = findViewById(R.id.Edt_inputname)
        btn_bdaycard = findViewById(R.id.Btn_bdaycard)


        btn_bdaycard.setOnClickListener {
            Birthdaycard()
        }


    }

    private fun Birthdaycard() {

        val name  = edt_inputname.editableText.toString()
        val intent = Intent(this@MainActivity,Bday_card :: class.java)
        intent.putExtra("name",name)
        startActivity(intent)
        Toast.makeText(this@MainActivity,"Clicked",Toast.LENGTH_SHORT).show()

    }


}