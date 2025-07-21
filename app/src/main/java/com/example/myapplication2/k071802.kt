package com.example.myapplication2

fun main(){
    val result = listOf<Int>(1, 2, 3).map {
        "안녕 $it 입니다"
    }
    println(result)

    val ourNumbers = listOf<Int>(3, 6, 9).map {
        "$it"
    }
    println(ourNumbers)
}