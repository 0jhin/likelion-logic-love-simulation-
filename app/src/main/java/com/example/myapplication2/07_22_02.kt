package com.example.myapplication2

fun main(){
    val isDarkMode : Boolean = false
    val myNumber : Int = 100
    val someList : List<Int> = listOf(1, 2, 3)

        // if 안에 있는 조건을 함수로 리팩토링 해보시오
    println(someResult(false, 20, listOf(1)))
}

private fun someResult(isDarkMode : Boolean, myNumber : Int, someList : List<Int>) : String{
    var hahaha = ""
    if (isDarkMode == false && myNumber < 30 && someList.count() < 3){
        hahaha = "하하하"
    }
    return hahaha
}