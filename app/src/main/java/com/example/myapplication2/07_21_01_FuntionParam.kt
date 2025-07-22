package com.example.myapplication2

fun main(){
//    sayHello("아침")
//    sayHello("점심")
//    sayHello("저녁")
//
//    numAdd(1, 1)
//
//    bell()
//    bell(2, 1)

    println("결과 : ${calc(n2 = 1)}")
}

private fun calc(n1 : Int = 0, n2 : Int) : Int {
//    var result = n1 + n2
//    return result // 리턴 방법 1
    return n1 + n2 // 리턴 방법 2
}


fun bell(time : Int = 0, num : Int = 5){
    println("$time 교시 종소리 $num 번이 울렸습니다.")

}

// 종소리 정보를 출력한다
// classNUmber: 교시
// bellCount : 종소리 카운트
fun sayInfo(classNUmber: Int = 0, bellCount: Int = 5){
    println("$classNUmber 교시 종소리 $bellCount 번이 울렸습니다.")

}

fun search(input : String = "추천 검색어"){
    if (input == "검색 내용"){

    }
}

fun sayHello(time : String){
    println("$time - 안녕하세요")
}

fun numAdd(firstNumber: Int, secondNumber: Int){
    var result = firstNumber + secondNumber
    println("결과 : $result")
}