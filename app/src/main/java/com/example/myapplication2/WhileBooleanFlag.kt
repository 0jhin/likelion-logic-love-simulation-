package com.example.myapplication2

fun main(){
    //while 반복을 Boolean 플래그로 종료
    var aa = true

    while (aa) {
        println("헬로우")
        val input = readln() ?: ""
        println("입력하신 내용 : $input")
        if (input == "pass"){
            aa = false
        }
        println("작업하기")
        println("작업하기")
        println("작업하기")
        println("작업하기")
    }

}