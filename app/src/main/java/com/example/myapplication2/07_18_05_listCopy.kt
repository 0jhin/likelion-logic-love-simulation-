package com.example.myapplication2

fun main(){

    // 2차원 배열
    val towDimensionalList = listOf(
        listOf(1, 2, 3),
        listOf(1, 2, 3),
    )

    // 얕은 복사, 갚은 복사
    val numbers = listOf<Int>(3, 6, 9)
    val yourNumbers = listOf<Int>().toMutableList()

    yourNumbers.addAll(numbers)
    println(yourNumbers)
    val copiedNumbers = numbers.map { it }
    println(copiedNumbers)
}