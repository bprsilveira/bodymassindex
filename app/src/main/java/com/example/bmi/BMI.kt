package com.example.bmi

import kotlin.math.pow

class BodyMassIndex(private var weight: Double, private var height: Double){

    fun doBMI(): Double {

        return weight / height.pow(2.0)

    }

    fun getCategory(): String {

        val index = doBMI()

        if(index < 16.0){

            return "Underweight (Severe thinness)"

        }else if(index in 16.0..16.99){

            return "Underweight (Moderate thinness)"

        }else if(index in 17.0..18.49){

            return "Underweight (Mild thinness)"

        }else if(index in 18.5..24.99){

            return "Normal range"

        }else if(index in 25.0..29.99){

            return "Overweight (Pre-obese)"

        }else if(index in 30.0..34.99){

            return "Obese (Class I)"

        }else if (index in 35.0..39.99){

            return "Obese (Class II)"

        }else{

            return "Obese (Class III)"

        }
    }

}