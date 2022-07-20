package com.example.bmi

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var editHeight: EditText
    private lateinit var editWeight: EditText
    private lateinit var button: Button
    private lateinit var textViewResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editHeight = findViewById(R.id.editHeight)
        editWeight = findViewById(R.id.editWeight)
        button = findViewById(R.id.button)
        textViewResult = findViewById(R.id.textViewResult)

        button.setOnClickListener { calculate() }

    }

    @SuppressLint("SetTextI18n")
    private fun calculate(){

        val heightString = editHeight.text.toString()
        val weightString = editWeight.text.toString()

        val showIndex = BodyMassIndex(weightString.toDouble(), heightString.toDouble())

        if(heightString == "" || weightString == ""){

            Toast.makeText(this, "Please, insert your weight and height", Toast.LENGTH_LONG).show()

        }else{

            val indexValue = showIndex.doBMI()
            val indexMask = String.format("%.2f", indexValue) //formata o resultado para 2 casas decimais
            val category = showIndex.getCategory()


            textViewResult.text = "$indexMask - $category"


        }

    }

}