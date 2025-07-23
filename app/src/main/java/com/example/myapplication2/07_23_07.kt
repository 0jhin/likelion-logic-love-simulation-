package com.example.myapplication2


fun main(){
    val someHelloLogic = makeSayHelloLogic("굿모닝1")

    someHelloLogic.invoke()
}
const val CASE_1 = "굿모닝"
const val CASE_2 = "굿이브닝"
fun makeSayHelloLogic(case : String) : () -> Unit {
    when(case) {
        CASE_1 -> {
            return {
                println("굿모닝입니다")
            }
        }
        else -> {
            return {
                println("굿이브닝입니다")
            }
        }
    }
}