package com.example.calculator.models




class Calculator(private val number1 :Double, private val number2: Double) {
    fun add() = number1 + number2
    fun sub() = number1 - number2
    fun divide() = number1 / number2
    fun mul() = number1 * number2

}