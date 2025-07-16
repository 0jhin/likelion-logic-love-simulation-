package com.example.myapplication2

fun main() {

    // 첫 번째 변수
    // 두 번쨰 변수
    // 연산

    // 반복 - 시작

    // exit 나간다
    // restart 다시 시작

    // 반복 - 끝

    // 계산 결과

    var triger = true

    var num1 = 0
    var num2 = 0
    while (triger){
        println("안내문 [끝내려면 exit / 다시 시작하려면 restart]을 입력하세요")

        print("첫 번째 숫자 : ")
        var firstInput = readln()// 첫 번째 변수
        if (firstInput == "exit"){
            println("종료 합니다.")
            break
        }
        if (firstInput == "restart"){
            println("프로그램을 다시 시작 합니다.")
            continue
        }
        num1 = firstInput?.toInt() ?: 0



        print("두 번째 숫자 : ")
        var secondInput = readln()// 첫 번째 변수
        if (secondInput == "exit"){
            println("종료 합니다.")
            break
        }
        if (secondInput == "restart"){
            println("프로그램을 다시 시작 합니다.")
            continue
        }
        num2 = secondInput?.toInt() ?: 0


        print("연산자 : ")
        var operator: String = readln() // 연산자
        if (operator == "exit"){
            println("종료 합니다.")
            break
        }
        if (operator == "restart"){
            println("프로그램을 다시 시작 합니다.")
            continue
        }

        var result = when(operator){
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> num1 / num2
            else -> ("에러")
        }
        println(result)
    }
}