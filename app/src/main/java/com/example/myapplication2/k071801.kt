package com.example.myapplication2

fun main(){

    listOf("사이다", "콜라", "환타", "밀키스").forEach { aFruit ->
        println("aFruit: $aFruit")

    }

    listOf("apple", "banana", "cherry").forEachIndexed { index, aFruit ->
        println("${index + 1}. 내가 좋아하는 읍식들 : $aFruit")
    }
}

val twoDimension = listOf<List<String>>(
    mutableListOf<String>(" "," "," ", " ", " "),
    mutableListOf<String>(" "," ","o", " ", " "),
    mutableListOf<String>(" ","o","o", "o", " "),
    mutableListOf<String>(" "," ","o", " ", " "),
    mutableListOf<String>(" "," "," ", " ", " "),
)