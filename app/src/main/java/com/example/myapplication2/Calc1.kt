package com.example.myapplication2

fun main() {

    println("사칙연산 계산기")
    // 설명
    var firstNum: Any
    var operator: String
    var secondNum: Any

    var firstNum2: Double = 0.0
    var secondNum2: Double = 0.0

    var firstNumFlag = false
    var secondNumFlag = false
    var operatorFlag = false

//        var checksum : Boolean = if (firstNum is Double && operator is String && secondNum is Double) true else false
    // 첫 번째 숫자가 실수형이고 연산자가 문자열이고 두 번째 숫자가 실수형이면 참 아니면 거짓

    do {
        print("첫 번째 숫자 입력 : ")
        var firstNum = readln().toDoubleOrNull() ?: "" // 실수형으로 첫 번째 숫자 받기(나눗셈을 위해)
        if (firstNum !is Double) {
            println("다시 입력 하세요.")
            continue
        }
        firstNum2 = firstNum as? Double ?: 0.0
        firstNumFlag = true
    } while (!firstNumFlag)

    do {
        print("연산자 입력[+, -, *, /] : ")
        operator = readLine() ?: "" // 연산자 받기
        if (operator != "+" && operator != "-" && operator != "*" && operator != "/") {
            println("다시 입력 하세요.")
            continue
        }
        operatorFlag = true
    } while (!operatorFlag)


    do {
        print("두 번째 숫자 : ")
        var secondNum = readln().toDoubleOrNull() ?: "" // 실수형으로 두 번쨰 숫자 받기(나눗셈을 위해)
        if (secondNum !is Double) {
            println("다시 입력 하세요.")
            continue
        }
        secondNum2 = secondNum as? Double ?: 0.0
        secondNumFlag = true
    } while (!secondNumFlag)

    var result = when (operator) {
        "+" -> firstNum2 + secondNum2
        "-" -> firstNum2 - secondNum2
        "/" -> firstNum2 / secondNum2
        "*" -> firstNum2 * secondNum2
        else -> -1
    }
    println(result)

//    var result : Double? = null
//    if (operator == "+"){
//        result = firstNum + secondNum
//    }
//    if (operator == "-"){
//        result = firstNum - secondNum
//    }
//    if (operator == "*"){
//        result = firstNum * secondNum
//    }
//    if (operator == "/"){
//        result = firstNum / secondNum
//    }
//
//    println("값 : $result")

}