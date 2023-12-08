package com.example.calculator4

// Const 상수로 PLUS = "+"(symbol) 값 지정.
// Calculator.PLUS.symbol => +
// Calculator.DIVIDE => DIVIDE
// AbstractOperation 인터페이스를 상속한 Calculator는 연산 기호에 따라 연산식을 구현한다.
// var value = Calculator.values() //[Lcom.example.calculator4.Calculator;@6aaa5eb0
// println(value[0]) // PLUS
// println(Calculator.valueOf("PLUS")) // PLUS
// operate를 찾을 수 있는 symbolOf() 함수도 추가해 Calculator의 활용성을 높였다.


enum class Calculator(val symbol: String): AbstractOperation {
    PLUS("+") {
        override fun operate(num1: Double, num2: Double): Double {
            return num1.plus(num2)
        }
    },
    MINUS("-") {
        override fun operate(num1: Double, num2: Double): Double {
            return num1.minus(num2)
        }
    },
    MULTIPLY("*") {
        override fun operate(num1: Double, num2: Double): Double {
            return num1.times(num2)
        }
    },
    DIVIDE("/") {
        override fun operate(num1: Double, num2: Double): Double {
            return num1.div(num2)
        }
    };

    companion object {
        fun symbolOf(symbol: String): Calculator {
            return values()
                .firstOrNull() { it.symbol == symbol }
                ?: throw NoSuchFieldException("정의되지 않은 기호")

        }
    }
}
