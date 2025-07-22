package com.example.myapplication2

// 변수를 람다로 선언하고 로직은 if안에 넣은 것 같은데
// 하나의 람다변수에 조건별로 로직을 다르게 줄 수 있다고 이해하면 된다

val plusLogic : (Int, Int) -> Int = { first, second ->
    first + second
}
val minusLogic : (Int, Int) -> Int = { first, second ->
    first - second
}
val multiplicationLogic : (Int, Int) -> Int = { first, second ->
    first * second
}
val divisionLogic : (Int, Int) -> Int = { first, second ->
    first / second
}
fun main(){
// 입력, 출력은 정해둠
    var doCalculate : ((Int, Int) -> Int)? = null

    val userInput = 1
    // TODO: 1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기
    doCalculate = when(userInput){
        1 -> plusLogic
        2 -> minusLogic
        3 -> multiplicationLogic
        4 -> divisionLogic
        else -> null
    }

//    if (userInput == 1) {
//        doCalculate = plusLogic
//    }
//    if (userInput == 2) {
//        doCalculate = minusLogic
//    }
//    if (userInput == 3) {
//        doCalculate = multiplicationLogic
//    }
//    if (userInput == 4) {
//        doCalculate = divisionLogic
//    }

    if (doCalculate != null){
        val result2 = doCalculate?.invoke(100, 200)
        println(result2)
    }

}

