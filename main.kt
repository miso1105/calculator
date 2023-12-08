package com.example.calculator4

import java.lang.Exception


fun main() {
    //계산기 시작
    while (true) {
        println("\n<계산기 START>")

        println("첫번째 숫자를 입력하세요.")
        try {
            var choiceFirstNum = readLine()!!.toDouble()

            println("원하는 연산기호를 선택해주세요.\n1. +\n2. -\n3. * \n4. /")
            println("번호를 고르세요:")
            var choiceNum: Int = readLine()!!.toInt()
            if (choiceNum == 0) {
                return break
            }

            var mySymbol: String = inputSymbolInfo(choiceNum).toString()

            println("두번째 숫자를 입력하세요.")
            var choiceSecondNum = readLine()!!.toDouble()

            var myFirstNum: Double = inputNumbers(choiceFirstNum)
            var mySecondNum: Double = inputNumbers(choiceSecondNum)

            displayCalculation(myFirstNum, mySecondNum, mySymbol)
            println("\n다시 계산을 실행하겠습니까? 1. 실행  2. 종료")

            var selectRestart: Int = readLine()!!.toInt()
            if (selectRestart == 1) {
                continue
            } else if (selectRestart == 2) {
                println("<계산기 END>")
                break
            } else {
                println("입력 오류로 재실행됩니다.")
            }
        } catch (e: Exception) {
            println("입력 오류로 재실행됩니다.")
            continue
        }
    }
}

fun inputSymbolInfo(choiceNum: Int): Any? {
            return when(choiceNum) {
                1 -> Calculator.PLUS.symbol
                2 -> Calculator.MINUS.symbol
                3 -> Calculator.MULTIPLY.symbol
                4 -> Calculator.DIVIDE.symbol
                else -> return null
            }
        }

fun inputNumbers(number: Double): Double {
    return number
}


fun displayCalculation(myFirstNum:Double, mySecondNum:Double, mySymbol:String){
    var preResult = Calculator.symbolOf(mySymbol).operate(myFirstNum,mySecondNum)
    var result = String.format("%.2f",preResult)  //소수점 둘째자리까지. 셋째자리에서 반올림 함.
    println("==계산 결과==")
    println("${myFirstNum} ${mySymbol} ${mySecondNum} = ${result}")

}
