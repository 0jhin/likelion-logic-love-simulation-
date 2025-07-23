package com.example.myapplication2

import java.util.Timer
import java.util.TimerTask

fun main(){
    println("메인 - 7")
    // 고차함수로 n초 뒤에 일어난 일을 호출부에서 알게 하기
//    doSomethingLate()
    doSomethingLate(2000L, done = {
        println("홀롤롤")
        println("여긴어디 나는 누구")
    })
    println("메인 - 13")
}

// n초 뒤에 실행
// 안녕하세요ㅕ
fun doSomethingLate(time: Long = 3000L, done: () -> Unit){
    Timer().schedule(object : TimerTask() {
        override fun run() {
            println("1번. 3초 뒤에 실행됨")
            done()
        }
    }, time)
}