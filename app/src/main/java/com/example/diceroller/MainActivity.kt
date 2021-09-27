package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.diceroller.databinding.ActivityMainBinding
import kotlin.random.Random
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        val view = binding.root
//        setContentView(view)

        val rollButton: Button = findViewById(R.id.roll_button)

        rollButton.setOnClickListener {
            val randomInt = Random.nextInt(6) + 1
            Toast.makeText(this, "Number is $randomInt", Toast.LENGTH_SHORT).show()
            rollDice(randomInt)
        }

        diceImage = findViewById(R.id.dice_image)
    }

    private fun rollDice(number: Int) {

        val drawableResource = when(number){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }

        diceImage.setImageResource(drawableResource)
        //binding.diceImage.setImageResource(drawableResource)

    }

}