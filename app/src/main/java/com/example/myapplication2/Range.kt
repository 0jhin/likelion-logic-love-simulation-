package com.example.myapplication2

fun main(){
    // 5..10 등 ..으로 Range 잡는 방법
    val availableNumbers : IntRange = 5..10

    for (aNumber in availableNumbers) { // for문 예제 + range만큼 실행
        println("aNumber $aNumber")
    }

}
