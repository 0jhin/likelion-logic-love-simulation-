package com.example.myapplication2

fun main(){

    // number 자료형은?
    var number = "100".toIntOrNull()


    var testNumber : Int? = 100

    // myNumber의 자료형과 값은?
    var myNumber = testNumber ?: 200

    // secondNumber의 자료형은?
    var secondNumber = testNumber

//    val testValue: Int? = 10
//    val finalValue = testValue ?: 20
//    println(finalValue)

    var userInput : String? = "안녕하세요"
    var userInput2 = userInput ?: "이걸 넣어라"
    println("userInput2 : $userInput2")
}