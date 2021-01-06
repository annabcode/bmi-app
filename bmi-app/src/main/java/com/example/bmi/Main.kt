package com.example.bmi

    fun main(){
        val bmi = BMI(0.00, 177.00)
        val result = bmi.calculateBMI()
        println("My BMI is: " + result)
    }
