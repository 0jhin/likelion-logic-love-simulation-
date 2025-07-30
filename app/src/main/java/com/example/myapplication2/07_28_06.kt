package com.example.myapplication2

object UserInfo {
    var userName : String = "yj"

    init {
        println("UserInfo init called")
    }
}

fun main(){
    var test = UserInfo
    val test02 = UserInfo
    println(UserInfo.userName)
    println()
}