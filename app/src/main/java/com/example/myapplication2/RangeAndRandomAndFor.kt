package com.example.myapplication2

fun main(){
    // Range로 범위 숫자 생성 후 random으로 섞는다
    val someRange = 3..8 // 3 ~ 8 숫자 생성


    for (bNumber in someRange) { // for문 예제 및 3 ~ 8 숫자를 변수에 하나씩 할당 6번 실행
        val randomNumbert = someRange.random() // 6번 실행 되는 동안 6번 섞임
        println(randomNumbert)
    }
}