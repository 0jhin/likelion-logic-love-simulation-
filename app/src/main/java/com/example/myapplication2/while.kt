package com.example.myapplication2

import androidx.core.os.registerForAllProfilingResults
import kotlin.math.tan

fun main(){


    val checkRange = 0..10
    print("숫자 입력 : ")
    var inputNumber : Int = readln().toInt()
    var checkNumber : Any = if (checkRange.contains(inputNumber)) "오케이" else "실패"
    println(checkNumber)

//    val first : Int = 3
//    val second : Int = 1

//    var myNumber : Int = if (first > second) first else second

//    do {
//        println("숫자를 입력하세요")
//        var userInputNumber : Int = readln().toInt()
//        var range : Boolean = availableNumbers.contains(userInputNumber)
//        if (!range){
//            println("허용 안됨")
//            println("다시 입력하세요")
//            userInputNumber = readln().toInt()
//            range = availableNumbers.contains(userInputNumber)
//        }
//    } while (!range)
//    println("10위 안에 들어왔다")

//    when(userInputNumber) {
//        in 0..10 -> println("10위 안에 들어왔다")
//
//        !in availableNumbers -> while (!range){
//            println("허용 안됨")
//            println("다시 입력하세요")
//            userInputNumber = readln().toInt()
//            if (availableNumbers.contains(userInputNumber)){
//                range = true
//            }
//
//        }
//
//    }

//    // 0, 1, 2, 3
//    val firstRange : IntRange = 0..3
//
//    // 0, 1, 2
//    val secondRange : IntRange = 0 until 3
//
//    // 3, 2, 1, 0
//    val thirdRange : IntProgression = 3 downTo 0
//
//    // 2, 4, 6, 8
//    val fourthRange : IntProgression = 2..8 step 2
//
//    val availableNumbers : IntRange = 0..10
//
//    var userInputNumber : Int = 3
//
//    val isOkay : Boolean = availableNumbers.contains(userInputNumber)

//    val firstRange : IntRange = 0..3
//
//    do {
//        println("숫자 입력")
//        var user : Int = readln().toInt()
//        val isOkay : Boolean = firstRange.contains(user)
//        if (isOkay){
//            println("성공입니다.")
//            println()
//        }
//    } while (isOkay)
//    println("실패입니다.")

//    if (isOkay == true){
//        println("성공입니다.")
//    } else(
//        println("실패입니다.")
//    )




//    var someValue : Any = 0
//
//    val result : Any = when(someValue){
//        1 -> "하나"
//        2 -> "둘"
//        3 -> "셋"
//        else ->  "?"
//
//    }
//    println(result)

//    var someValue : Any = 0
//
//    val result : Any = when(someValue){
//        1 -> "1번"
//        "오늘도 빡코딩" -> 100
//        is Boolean -> true
//        !is String -> "문자열이 아닙니다."
//        else -> 333
//    }



//    var intro : Any = 3
//
//    when(intro){
//        1 -> println("안녕하세요")
//        2 -> println("오늘도")
//        3 -> println("빡코딩입니다.")
//    }

//    var isProgramRunning: Boolean = false
//    println("Test 1")
//    do {
//        println("Test 2")
//        val userInput: String? = readLine()
//        println("Test 3")
//        when (userInput) {
//            "exit" -> {
//                isProgramRunning = false
//                println("Test 4")
//            }
//        }
//        println("Test 5")
//    } while (isProgramRunning)
//
//    println("Test 6")


//    println("4")
//    var availableCount : Int = 3
//    println("6")
//    do {
//        println("8")
//        val userInput : String? = readLine()
//        println("10")
//        println("작동중")
//        println("12")
//    } while (availableCount > 3)
//    println("14")
//
//    println("16")
//    while (availableCount > 0){
//        println("18")
//        val userInput : String? = readLine()
//        println("20")
//        println("작동중")
//        println("22")
//    }

//    var isProgramRunning : Boolean = true
//
//    while (isProgramRunning){
//        val userInput : String? = readLine()
//        isProgramRunning = userInput
//        println("작동중")
//    }

//    var availableCount : Int = 3
//
//    while (availableCount > 0){
//        availableCount -= 1
//        val userInput : String? = readLine()
//        println("작동중")
//    }

}