package com.example.bmi

import org.junit.Test
import java.lang.ArithmeticException;
import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    //@Test
    fun calculation_formula_is_correct(){
        val bmi = BMI(55.00, 175.00)
        assertEquals(18, bmi.calculateBMI())
    }

    @Test
    fun exception_on_zero_height(){
        val bmi = BMI(55.00, 0.0)
        bmi.calculateBMI()
        println(bmi.calculateBMI())
    }

    //@Test
    fun test(){
        val bmi = BMI2(55.00, 0.00)
        println(bmi.calculator())
    }

}