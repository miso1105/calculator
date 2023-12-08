package com.example.calculator

fun main() {
    var addObject = AddOperation(10,3)
    var subObject = SubtractOperation(12,5)
    var mulObject = MultiplyOperation(12,12)
    var divObject = DivideOperation(12,3)

    var addResult = addObject.add()
    var subResult = subObject.subtract()
    var mulResult = mulObject.multiply()
    var divResult = divObject.divide()

    println("덧셈 결과: ${addResult}")
    println("뺄셈 결과: ${subResult}")
    println("곱셈 결과: ${mulResult}")
    println("나눗셈 결과: ${divResult}")
}

// 다른 Calculator 클래스 상속 받지 않고 주 생성자(Init) 사용해 클래스 만듦. - 내부 코드 변경
open class Calculator3(num1: Int, num2: Int) {
     var num1: Int = 0
    var num2: Int = 0

    init {
        this.num1 = num1
        this.num2 = num2
    }

    fun add(): Int {
        return num1 + num2
    }

    fun subtract(): Int {
        return num1 - num2
    }

    fun multiply(): Int {
        return num1 * num2
    }

    fun divide(): Int {
        return num1 / num2
    }
}

class AddOperation(num1: Int, num2: Int): Calculator3(num1, num2) {
}

class SubtractOperation(num1: Int, num2: Int): Calculator3(num1, num2) {
}

class MultiplyOperation(num1: Int, num2: Int): Calculator3(num1, num2) {
}

class DivideOperation(num1: Int, num2: Int): Calculator3(num1, num2) {
}

// 개선된 점
// init 블록 안에서 초기화 되는 매개변수.
// 같은 기능을 가지고 있다면 클래스를 상속받고 메소드를 이용하기에 간결한 코드로 사용할 수 있는 것 같다.