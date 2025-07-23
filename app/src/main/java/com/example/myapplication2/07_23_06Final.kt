package com.example.myapplication2

import java.util.Timer
import java.util.TimerTask

fun main(){
    doSamethingLate(1000L, done = {
        println("ti : $it")
        }
    )

    doSamethingLate {  }

}

fun doSamethingLate(time : Long = 3000L, done : (String) -> Unit) {
    Timer().schedule(object : TimerTask() {
        override fun run() {
            val seconds = time / 1000
            println("${seconds}초 뒤에 실행됨")

            val result = "${seconds}초 입니다."
            done(result)
        }
    }, time)
}