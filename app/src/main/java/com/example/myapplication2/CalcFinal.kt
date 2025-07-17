package com.example.myapplication2

fun main(){

    // 복습 필요
    // 하나의 큰 반복 안에서 완성

    // ✅ 첫번째 숫자 입력
    // ✅ 연산 입력  - 예) +, -
    // ✅ 두번째 숫자 입력

    var result : Int = 0

    var isProgramingRunning: Boolean = true

    var firstNumber = 0
    var operationCommand = ""
    var secondNumber = 0

    var isFirstStepPassed: Boolean = false
    var isSecondStepPassed: Boolean = false
    var isThirdStepPassed: Boolean = false

    // 무한 루프에 빠짐

    while (isProgramingRunning) {

        // ========================================
        if (!isFirstStepPassed) {
            println("첫번째 숫자를 입력해주세요 ")

            val userInput = readLine()

            if (userInput == "exit"){
                println("프로그램을 종료합니다.")
                isProgramingRunning = false
                continue
            }

            if (userInput == "reset"){
                isFirstStepPassed = false
                isSecondStepPassed = false
                continue
            }

            if (userInput?.toIntOrNull() == null){ // 입력 받고 나서 받은 값을 변환
                println("숫자로 다시 입력해주세요.")
                continue
            }

            firstNumber = userInput.toIntOrNull() ?: 0
            isFirstStepPassed = true
        }

        // ========================================

        if (!isSecondStepPassed) {
            println("두번째 숫자를 입력해주세요")
            val secondUserInput = readLine()

            if (secondUserInput == "exit"){
                println("프로그램을 종료합니다.")
                isProgramingRunning = false
                continue
            }

            if (secondUserInput == "reset"){
                isFirstStepPassed = false
                isSecondStepPassed = false
                continue
            }

            if (secondUserInput?.toIntOrNull() == null){
                println("숫자로 다시 입력해주세요.")
                continue
            }


            secondNumber = secondUserInput.toIntOrNull() ?: 0
            isSecondStepPassed = true
        }


        // ========================================

        println("더하기 혹은 빼기를 입력하세요 / 예) +, -")

        val commandInput = readLine()

        if (commandInput == "exit"){
            println("프로그램을 종료합니다.")
            isProgramingRunning = false
            continue
//                return
        }

        if (commandInput == "reset"){
            isFirstStepPassed = false
            isSecondStepPassed = false
            continue
        }

        // + -
        val isCommand : Boolean = when(commandInput) {
            "+" -> true
            "-" -> true
            else -> false
        }

        if (isCommand == false){
            println("+, - 로 다시 입력해주세요.")
            continue
        }

        operationCommand = commandInput ?: "+"


        if (operationCommand == "+") {
            result = firstNumber + secondNumber
        }

        if (operationCommand == "-") {
            result = firstNumber - secondNumber
        }

        println("결과 : $firstNumber $operationCommand $secondNumber = $result")
        isFirstStepPassed = false
        isSecondStepPassed = false

    }



}