package com.example.apexrandomcharacter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // List of all chars in game
        val chars = arrayListOf<String>(
            "Ash",
            "Bangalore",
            "Bloodhound",
            "Caustic",
            "Crypto",
            "Fuse",
            "Gibralter",
            "Horizon",
            "Lifeline",
            "Loba",
            "Mirage",
            "Octane",
            "Pathfinder",
            "Rampart",
            "Revenant",
            "Seer",
            "Valkyrie",
            "Wattson"
        )
        val generateBtn = findViewById<Button>(R.id.btnGen)
        generateBtn.setOnClickListener{
            val randomChar = chars.random()
            val displayedChar = findViewById<TextView>(R.id.charTitle)
            displayedChar.text = randomChar
            displayedChar.visibility = View.VISIBLE
            Toast.makeText(this@MainActivity,
            "A new character has appeared!",
            Toast.LENGTH_SHORT).show()
        }

    }
}