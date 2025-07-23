package com.example.myapplication2

fun main(){
    val somePair : Pair<String, String> = Pair("이름", "권영진") // 페어 생성 방법 1
    val name = somePair.first
    val value = somePair.second

    val secondPair : Pair<String, Int> = "number" to 100 // 페어 생성 방법 2
    val (firstValue : String, secondValue : Int) = secondPair // 페어 받는 방법 2
    val (a, b) = "age" to 200 // 페어 생성 방법 3
    val (_, b1) = "age" to 300 // 페어 생성 방법 4

    println()
}

