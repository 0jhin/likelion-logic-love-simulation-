package com.example.myapplication2

fun main(){
    // while break 및 반복 캐시 개념
    // 답안지
    //    ✅ 사용자가 y를 입력하면
    //    최근 사용자가 입력한 글자가 그때 노출되고 - 프로그램 종료
    var userInput = ""
    while (true) {
        println("글자를 입력해주세요")
        val justUserInput = readLine() ?: ""
        if (justUserInput == "y") {
            break // 여기서 탈출
        }
        println("지금 입력한 글자! :$justUserInput")
        userInput = justUserInput // 이전 데이터 보존
    }
    println("결과이다! 종료전 최근에 입력한 글자입니다 $userInput")


    // 내가 한거
//    var userInput = ""
//    var userInput2 = ""
//    var triger = true
//
//    while (triger){
//        println("글자를 입력해주세요")
//        userInput = readLine() ?: ""
//        if (userInput == "y"){
//            triger = false
//        }// 사용자가 y을 입력하면 프로그램 종료
//        else {
//            println("지금 입력한 결과 : $userInput")
//        }
//        userInput2 = userInput
//    }
//    println("결과이다! 종료전 최근에 입력한 글자입니다. : $userInput2")
}