//onCLick event and Toast
package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        
        // Set OnClickListener to handle button click event
        button.setOnClickListener {
            if(button.text == getString(R.string.color_change_to_red)) {
                // Change background color to red
                button.setBackgroundColor(resources.getColor(android.R.color.holo_red_dark))
                button.setText(R.string.color_change_to_purple)
                Toast.makeText(this, "Color changes to red...", Toast.LENGTH_SHORT).show()
            } else {
                // Change background color to purple
                button.setBackgroundColor(resources.getColor(android.R.color.holo_purple))
                button.setText(R.string.color_change_to_red)
                Toast.makeText(this, "Color changes to purple...", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
