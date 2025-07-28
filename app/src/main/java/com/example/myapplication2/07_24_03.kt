package com.example.myapplication2

fun main(){
    val fruitSet = setOf("Apple", "Banana")
    val fruitList = fruitSet.toList()
    val fruitMutableList = fruitSet.toMutableList()

    val drinkList = listOf("사이다", "콜라", "콜라")
    val uniqueDrink : List<String> = drinkList.toSet().toList() // Set으로 바꿔서 중복 제거 후 다시 List로 복귀 가능
    println(uniqueDrink)
    println()

    val testMap = mapOf("a" to "b", "c" to "d")
    val testList = testMap.toList()
    val testMapKey = testMap.keys
    val testMapValue = testMap.values

    println(testList)
    println(testMapKey)
    println(testMapValue)
    println()
}