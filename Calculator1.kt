package com.example.calculator

fun main() {
    var calc = Calculator1()
    var addResult = calc.add(2,5)
    var subResult = calc.subtract(2,5)
    var divResult = calc.divide(2,5)
    var mulResult = calc.multiply(2,5)

    println("덧셈 결과: ${addResult}")
    println("뺄셈 결과: ${subResult}")
    println("나눗셈 결과: ${divResult}")
    println("곱셈 결과: ${mulResult}")
}

open class Calculator1 {
    fun add(num1:Int, num2:Int): Int {
        return num1 + num2
    }

    fun subtract(num1: Int, num2: Int): Int {
        return num1 - num2
    }

    fun divide(num1: Int, num2: Int): Int {
        return num1 / num2
    }

    fun multiply(num1: Int, num2:Int): Int {
        return num1 * num2
    }
}