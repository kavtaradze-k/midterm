package com.example.midterm

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sharedPref = getSharedPreferences("pref", MODE_PRIVATE)
        val editor=sharedPref.edit()
        var btn=findViewById<ImageButton>(R.id.nextBtn)
        btn.setOnClickListener {
            val name= findViewById<EditText>(R.id.name).text.toString()
        editor.apply{
            putString("name",name)
            apply()
        }
            Intent(this,SecondActivity::class.java).also {
                it.putExtra("EXTRA_NAME", name)
                startActivity(it)
            }
        }

    }

}