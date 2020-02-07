package com.example.android.exer1_brazil_diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView


class MainActivity : AppCompatActivity() {

    var diceImage : ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        var current = 0

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.dice_image)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            current = generateNum()
            rollDice(current)

        }

        val countButton: Button = findViewById(R.id.count_button)
        countButton.setOnClickListener {
            current = 0
            rollDice(current)

        }

    }

    private fun generateNum():Int{
        return (1..6).random()
    }

    private fun rollDice(randomInt:Int){

        val drawableResource = when (randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }

        diceImage?.setImageResource(drawableResource)
    }

}
