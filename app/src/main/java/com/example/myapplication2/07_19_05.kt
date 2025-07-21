package com.example.myapplication2

fun main(){
    // 형태변환 .map
    val result = listOf(10, 20, 30, 40).map{
        println("it : $it")
    }
}