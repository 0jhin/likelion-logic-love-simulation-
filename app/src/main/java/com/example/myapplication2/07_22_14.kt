package com.example.myapplication2

// 자료형 별명
typealias AllType = (String, Int, Float, Boolean, Double) -> Unit
fun main(){

    val someLambda : AllType // (String, Int, Float, Boolean, Double) -> Unit
    val someLambda2 : AllType? = null// 옵셔널로 쓸 때
}

