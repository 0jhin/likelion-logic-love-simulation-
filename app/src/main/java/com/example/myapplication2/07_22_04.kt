package com.example.myapplication2

fun main(){
    val twoDimension = mutableListOf<MutableList<String>>(
        mutableListOf<String>(" "," "," ", " ", " "),
        mutableListOf<String>(" "," ","o", " ", " "),
        mutableListOf<String>(" ","o","o", "o", " "),
        mutableListOf<String>(" "," ","o", " ", " "),
        mutableListOf<String>(" "," "," ", " ", " "),
    )


    // 기본 위치 출력
    twoDimension.forEach {
        it.forEach {
            print("$it")
        }
        println()
    }



    println("Command List [up, down, left, right]")
    print("Command : ")
    var userCommand : String = readln()


    when(userCommand){
        "up" -> upUserCommand()
        "down" -> downUserCommand()
        "left" -> leftUserCommand()
        "right" -> rightUserCommand()
    }
}

