package com.example.singlebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var editText=findViewById<EditText>(R.id.editText)
        var btn= findViewById<Button>(R.id.button)
        var textview=findViewById<TextView>(R.id.textView)
        btn.setOnClickListener {
            var name=editText.text
            textview.text=name
            editText.text.clear()
        }
    }
}