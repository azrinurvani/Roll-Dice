package com.mobile.azrinurvani.rolldice

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.mobile.azrinurvani.rolldice.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

/**************Cara binding id:
Secara umum nya terdapat 3, yaitu :
1. menggunakan findViewById
2. menggunakan lateinit -> Mendeklarasi dahulu sebelum di inisialisasi
3. Data Binding
****************/

//    lateinit var rollButton:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding :ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

//        rollButton = findViewById(R.id.roolButton)

        binding.rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice(){
//        val diceImage : ImageView = findViewById(R.id.imgDice)

        val drawableRes = when(Random().nextInt(6)+1){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

//        menggunakan android kotlin extension
        imgDice.setImageResource(drawableRes)

    }
}
