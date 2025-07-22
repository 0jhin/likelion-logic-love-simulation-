package com.example.myapplication2

fun main(){
    val coin : Int? = null

    println(someCoin())
    println(someCoin(0))
    println(someCoin(1))
}

// 매개변수를 coin으로 받고
// coin 이 없다면 - "코인이 0원 입니다. - 돈을 넣어주세요" 문자 출력 - 반환
// 코인이 있다면  "코인이 n원 입니다." 문자 출력 - 반호나
// 위와 같은 로직

private fun someCoin(coin : Int? = null) : String{
    if (coin == null || coin == 0){
        return "코인이 0원 입니다. - 돈을 넣어주세요"
    }
    return "코인이 $coin 원 입니다."
}
