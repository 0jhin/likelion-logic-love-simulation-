package com.example.myapplication2


// 중괄호 {}는 로직이다

fun main(){
// ✅ 사용자 입력에 따라 액션 다르게 만들어보기
// 1. - 난 너가 좋아 출력, 호감도 3증가
// 2. - 난 너가 싫어 출력, 호감도 2감소
    var lovePoint : Int = 10
//    var mainAction : (() -> Unit)? = null

    var mainAction : (() -> Unit)? = null
    var userInput = 2

    if (userInput == 1){
        mainAction = {
            println("난 너가 좋아")
            lovePoint = lovePoint + 3
            println("호감도 : $lovePoint")
        }
    }
    if (userInput == 2){
        mainAction = {
            println("난 너가 싫어")
            lovePoint = lovePoint - 2
            println("호감도 : $lovePoint")
        }
    }
    mainAction?.invoke() //람다 호출 .invoke() 필수는 아님

//    var mainAction : ((Int) -> Unit)? = { userInput ->
//        if (userInput == 1){
//            println("난 너가 좋아")
//            lovePoint = lovePoint + 3
//            println("호감도 : $lovePoint")
//        }
//        if (userInput == 2){
//            println("난 너가 싫어")
//            lovePoint = lovePoint - 2
//            println("호감도 : $lovePoint")
//        }
//    }

    // TODO: 입력에 따른 처리

}