package com.example.myapplication2

fun main(){

    saySomething("saySomething", "saySomething2", "saySomething3")
}



// vararg : 가변매개변수(매개변수 여러개 들어갈 떄)
fun saySomething(vararg words: String){
    words.asList().forEach {
        println("word: $it")
    }
}
// 함수 시그니처 : 함수 이름이 같아도 매개변수가 다르면 다른 함수로 인식한다
// ex) listOf
fun saySomething(name : String){ }
fun saySomething(){ }