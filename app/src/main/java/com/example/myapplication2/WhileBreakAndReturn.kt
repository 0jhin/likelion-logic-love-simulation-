package com.example.myapplication2

fun main() {
    // break와 return의 차이
    while (true){
        println("[TEST 1]")
        readLine()
        println("[TEST 2]")
        break // 반복 종료
        println("[TEST 3]") // 미출력
        println("[TEST 4]") // 미출력
    }
    println("[TEST 5]") // 출력

    while (true){
        println("[TEST 1]")
        readLine()
        println("[TEST 2]")
        return // 프로그램 종료
        println("[TEST 3]") // 미출력
        println("[TEST 4]") // 미출력
    }
    println("[TEST 5]") // 미출력

    // 코드 종료



}