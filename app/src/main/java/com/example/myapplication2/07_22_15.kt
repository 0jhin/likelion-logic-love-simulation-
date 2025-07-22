package com.example.myapplication2

// 고차함수 예시 from Gemini
fun genAction(): (() -> Unit) -> Unit {
    // 이 함수는 (() -> Unit) -> Unit 타입의 람다를 반환합니다.
    return { actionToRun -> // actionToRun은 () -> Unit 타입
        println("genAction에서 생성된 함수가 호출되었습니다.")
        println("전달받은 액션을 실행합니다...")
        actionToRun()
        println("전달받은 액션 실행 완료.")
    }
}

fun main() {
    val returnedFunction = genAction() // returnedFunction은 (() -> Unit) -> Unit 타입

    // 실행할 액션 정의
    val mySpecificAction = {
        println("이것은 genAction을 통해 실행되는 특정 액션입니다!")
    }

    // 반환된 함수에 액션 전달하여 실행
    returnedFunction(mySpecificAction)
    println("----")
    returnedFunction { println("또 다른 액션입니다!") }
}


