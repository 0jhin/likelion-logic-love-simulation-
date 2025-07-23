package com.example.myapplication2


fun main(){

}

// 고차함수 : 함수의 매개변수로 람다가 들어감
val name2 : String = ""
val basicLambda : () -> Unit = {} // 람다
fun doSomething(name2 : String){}
fun doSomething(basicLambda : () -> Unit = {}){} // 고차 함수(매개변수 람다(로직))

fun doSomething1() : String { return "" } //일반 함수
fun doSomething2() : () -> Unit { return {} } // 고차 함수(반환 람다)

// 고차함수란 - 매개변수, 반환이 함수가 들어가면