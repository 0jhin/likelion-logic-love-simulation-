package com.example.myapplication2


fun main(){

    // 매개변수 두개 이상일 때
    val someLambda : (String, Int) -> Unit = { name, age ->
        println("name : $name")
        println("age : $age")
    }
    someLambda("yj", 20)

}