package com.example.bmi

class BMI(var mass: Double, var height: Double){

    fun multiplyHeight(): Double{
        return height*height
    }

    fun calculateBMI(): Double {
        if(multiplyHeight() == 0.00) return ArithmeticException
        return mass /(multiplyHeight()/10000)
    }
}