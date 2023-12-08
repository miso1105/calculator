package com.example.calculator

// Calculator1을 상속 받아 내부 코드 수정 없이 부모 클래스의 메소드 그대로 가져다 씀.
fun main() {
    var calc = Calculator2()

    var addResult = calc.add(8,4)
    var subResult = calc.subtract(8,4)
    var divResult = calc.divide(8,4)
    var mulResult = calc.multiply(8,4)
    var modResult = calc.modulo(8,4)

    println("덧셈 결과: ${addResult}")
    println("뺄셈 결과: ${subResult}")
    println("나눗셈 결과: ${divResult}")
    println("곱셈 결과: ${mulResult}")
    println("나눗셈 나머지 결과: ${modResult}")
}
class Calculator2: Calculator1() {
    fun modulo(num1: Int, num2: Int): Int {
        return num1 % num2
    }
}

