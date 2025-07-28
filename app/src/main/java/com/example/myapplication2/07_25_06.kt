package com.example.myapplication2

class SuperFood(
    var name: String,
    var price: Int,
    var taste: String) {

    constructor(isGood: Boolean) : this("",
        if (isGood) 3000 else 1000,
        "") {
        this.name = "맛좋은 딸기"
        this.taste = "달다"
    }
}

fun main(){
    val normalStrawbery = SuperFood("딸기", 100, "달다")
    val goodStrawbery = SuperFood(isGood = true)
    println()
}