package com.example.midterm

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class SecondActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        val name=intent.getStringExtra("EXTRA_NAME")
        var name1=findViewById<EditText>(R.id.greeting_txt)
        name1.setText(name)
    }
}