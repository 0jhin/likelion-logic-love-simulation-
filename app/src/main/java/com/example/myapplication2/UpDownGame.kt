package com.example.myapplication2

fun main() {
    //while을 이용한 반복 예제

    // 0 ~ 100 사이의 정답이 있음
    // 20번 반복
    // 사용자 입력 받음
    // 정답보다 작으면 "업" 출력
    // 정답보다 높으면 "다운" 출력
    // 정답이면 종료


    var userCount = 20 // 남은 횟수
    val userUp = "업"
    val userDown = "다운"
    val description : String = "0부터 100까지의 숫자를 정합니다. 기회는 20번이며 정답에 입력한 숫자를 업 다운으로 힌트를 드립니다.(숫자만 넣으세요)"
    val gameModeDescription : String = "게임 모드를 설정합니다. [설정], [게임]"


    println(gameModeDescription)
    var gameMode : String? = readLine()
    if (gameMode == "설정"){
        println("설정모드로 진입합니다.")
    } else {
        if (gameMode == "게임"){
            println(description) // 게임 설명
            print("정답을 숫자로 입력하세요 : ")

            var correct = readLine() // 정답 입력
            var adminInputNum = correct?.toInt() // 정수 변환

            while (0 < userCount) {
                println("정답을 맞춰보세요")
                var userInput = readLine() // 받은 입력
                var userInputNum = userInput?.toInt() // 정수 변환

                if (userInputNum != null && adminInputNum != null) {
                    if (userInputNum < adminInputNum) {
                        println(userUp)
                    } else if (userInputNum > adminInputNum) {
                        println(userDown)
                    } else {
                        println("정답")
                        break
                    }
                }
                userCount -= 1
                println("남은 횟수 : $userCount")
            }
        }
    }


}