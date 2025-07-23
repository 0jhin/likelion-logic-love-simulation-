package com.example.myapplication2


// 비동기 처리
import java.util.Timer
import  java.util.TimerTask

fun main(){
//    Timer().schedule(object : TimerTask() {
//        override fun run() {
//            println("3번. 2초 뒤에 실행됨")
//        }
//    }, 2000L)





    val timerLambda : (userInput : Long) -> Unit = { userInput ->
        Timer().schedule(object : TimerTask() {
            override fun run() {
                println("2초 뒤에 실행됨")
            }
        }, userInput)
    }


    timerLambda(2000L)

}

fun userTimer(
    timerLambda : (userInput : Long) -> Unit = { userInput ->
        Timer().schedule(object : TimerTask() {
            override fun run() {
                println("2초 뒤에 실행됨")
            }
        }, userInput)
    }
) : Unit {
}