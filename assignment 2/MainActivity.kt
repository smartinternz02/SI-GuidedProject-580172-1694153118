package com.example.dicegame

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity
import java.util.*

class MainActivity : ComponentActivity() {
    private lateinit var result: TextView
    private lateinit var rollbtn: Button
    private lateinit var diceImage: ImageView

    private val diceImages = arrayOf(
        R.drawable.dice1,
        R.drawable.dice2,
        R.drawable.dice3,
        R.drawable.dice4,
        R.drawable.dice5,
        R.drawable.dice6
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actvity_main)

        result = findViewById(R.id.result)
        rollbtn = findViewById(R.id.rollbtn)
        diceImage = findViewById(R.id.diceImage)

        rollbtn.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val random = Random()
        val randomNumber = random.nextInt(6) + 1
        val resultText = "You rolled a $randomNumber"
        result.text = resultText
        diceImage.setImageResource(diceImages[randomNumber - 1])
    }
}
