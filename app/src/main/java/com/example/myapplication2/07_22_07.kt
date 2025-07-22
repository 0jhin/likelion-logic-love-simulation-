package com.example.myapplication2

fun main(){
    val yourName : String = ""
    val testName : String? = null

    // 람다도 변수니까 옵셔널 가능
    // val someLambda : () -> Unit = null // 이건 안됨
    val someLambda2 : () -> Unit = {} // 이건 String에서 = ""이 들어간거랑 같다
    val someLambda3 : (() -> Unit)? = null // 이게 옵셔널
}