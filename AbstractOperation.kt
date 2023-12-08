package com.example.calculator4

// 독립된 하나의 기능 뼈대만 만듦.
interface AbstractOperation {
    fun operate(num1: Double, num2: Double): Double
}