package com.example.myapplication2

fun main(){
    val someMap = mapOf("Apple" to 1, "Banana" to 2, Pair("셋", 3))
    val someMutableMap = mutableMapOf("Apple" to 1, "Banana" to 20)
    someMutableMap.put("Cherry", 3)
    someMutableMap["Apple"] = 100

    val someValue : Int? = someMutableMap["Apple"] ?: 0

    someMutableMap.remove("Cherry")

    val result : Int? = someMutableMap.get("Banana")

    println()
}