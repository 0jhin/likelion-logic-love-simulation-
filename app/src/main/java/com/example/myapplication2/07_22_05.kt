package com.example.myapplication2


fun main(){
    // 매개변수 O, X
    // 반환 O, X

    // 변수 이름 : 자료형 = 변수값
    val string : String = ""
    //fun sayHello(){} 람다로
    // 변수 이름 : 자료형 = 변수값
    val sayHelloLambda : () -> Unit = { // 로직을 변수의 값으로 넣는게 람다
        println("안녕하세요")
        println("안녕하세요")
        println("안녕하세요")
    }

    // 람다 반환값이 있으면 반환값의 자료형
    val some2Lambda : () -> String = {
        "some2"
    }
    val result : String = some2Lambda() // 람다 호출 해서 result에 입력
    println(result) // 람다의 반환 값인 some2 출력



}

// 람다 = 함수의 변수 형태
// 로직을 데이터에 담고 싶다
// 로직 = 연산 = CPU = 함수
// 변수 = 메모리 = 정보 = 자료
// 함수의 형태 - 4가지
// 람다의 형태 - 4가지
// 람다의 자료형은 아래 4가지
// 매개변수 X, 반환 X
fun sayHello(){

}

// 매개변수 O, 반환 X
fun some1(some1 : Int){

}

// 매개변수 X, 반환 O
fun some2() : String{
    return "some2"
}

// 매개변수 O, 반환 O
fun some3(some3 : String = "") : String {
    return "some3"
}

