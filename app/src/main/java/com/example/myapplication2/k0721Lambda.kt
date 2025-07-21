package com.example.myapplication2

fun main(){
    //람다 옵셔널
    val someLambda : (() -> Unit)? = null
    // 1. 매개변수 X, 반환 X
    // () -> Unit
    // 2. 매개변수 O, 반환 X
    // (String) -> Unit
    // 3. 배개면수 X, 반환 O
    // () -> String
    // 4. 매개변수 O, 반환 O
    // (String) -> Unit
}