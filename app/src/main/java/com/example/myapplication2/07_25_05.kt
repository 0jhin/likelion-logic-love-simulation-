package com.example.myapplication2

class Food(val info: String) {

    var age : Int = 0
    var name : String = ""

    constructor(ageParam: Int, nameParam: String) :
            this("age: $ageParam / name: $nameParam") {
        this.age = ageParam
        this.name = nameParam
        println("constructor - ")
    }

    init {
        println("dd")
    }
}

fun main(){
//    val aFood = Food("sksksk")
    val aFood2 = Food(ageParam = 10, nameParam = "dd")
}