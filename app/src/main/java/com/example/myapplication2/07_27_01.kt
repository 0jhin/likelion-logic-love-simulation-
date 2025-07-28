package com.example.myapplication2

fun main(){

    // .add처럼 리스트에 기존 리스트 복사? 할 때 포인터를 다르게 가짐 + 자료형 변경 가능
    var test = listOf(10, 20, 30, 40) // List<Int>
    val result = test.map { // List<String>
        "it : $it"
    }
    val result2 = test.map { // List<String>
        it
    }
    println(result)
    println(result2)
    println()

    // 그냥 = 로 리스트에 기존 리스트 복사하면 포인터를 동일하게 가짐 + 자료형도 그대로
    var test2 = listOf(10, 20, 30, 40) // List<Int>
    var result3 = test2 // List<Int>
    println(result3)
    println()
}