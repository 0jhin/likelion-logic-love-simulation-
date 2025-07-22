package com.example.myapplication2


fun main(){

    // 나이를 입력 받고 age : Int?
    // age가 없다면
    // 나이가 없습니다 - 문자열 반환
    // age가 있다면
    // ~~ 나이입니다 - 문자열 반환
    // 반환하는 람다식을 만드시오

    val someAge : ((Int?) -> Unit)? = { age ->
        if (age != null){
            println("$age 나이 입니다.")
        }
        else{
            println("나이가 없습니다.")
        }
    }

    someAge?.invoke(null)
}

