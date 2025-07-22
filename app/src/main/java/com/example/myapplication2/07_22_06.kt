package com.example.myapplication2



//람다도 변수다
fun main(){
    // ✅ 이 함수를 람다로 바꾸면?
//    fun checkConditionFunction(userInput: String?) : Boolean {
//
//        val _userInput = userInput ?: ""
//
//        return _userInput != "1" && _userInput != "2"
//    }

    // 1번 예시
    val checkConditionFunction2 : (String?) -> Boolean = { userInput ->
        val _userInput = userInput ?: ""
        _userInput != "1" && _userInput != "2"
    }

    // 2번 예시
    var userInput = null
    val checkConditionFunction : (userInput: String?) -> Boolean = {
        val _userInput = userInput ?: ""

        _userInput != "1" && _userInput != "2"
    }
}