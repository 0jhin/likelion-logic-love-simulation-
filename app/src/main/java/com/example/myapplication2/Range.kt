package com.example.myapplication2

fun main(){
    val availableNumbers : IntRange = 5..10

    for (aNumber in availableNumbers) {
        println("aNumber $aNumber")
    }

    val someRange = 3..8


    for (bNumber in someRange) {
        val randomNumbert = someRange.random()
        println(randomNumbert)
    }

}
