package com.example.myapplication2


// set은 인덱스가 없고 중복 불가하다
fun main(){
    //TODO: Set 생성
    val fruit = setOf("Apple", "Banana", "Cherry")
    val fruitMutableSet = mutableSetOf<String>("Apple", "Banana", "Cherry")

    val test = fruitMutableSet.contains("Banana")
    println(test)


    fruitMutableSet.add("Banana")
    fruitMutableSet.add("Banana")
    fruitMutableSet.add("Banana")
    fruitMutableSet.add("Banana")
    fruitMutableSet.remove("Apple")
    println(fruit)
    println(fruitMutableSet)
    println()
}