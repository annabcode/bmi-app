package com.example.bmi

import kotlin.math.roundToInt

class BMI2 (private val mass: Double,
private val height: Double){

    fun calculator(): Double{
        return mass / ((height * height)/10000)
        //return result.roundToInt()
    }
}