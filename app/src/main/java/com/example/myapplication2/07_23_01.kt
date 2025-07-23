package com.example.myapplication2

fun main(){
    val giveMeSomeCoin2 : (Int?) -> String = { coin ->
         if (coin == null) {
            "코인이 0원 입니다. - 돈을 넣어주세요"
        } else {
            "코인이 ${coin}원 입니다."
        }
    }

    val plus2 : (Int, Int, Int) -> Int = { first, second, _->
        val result = first + second
        println("더하기 / result: $result")
        result
    }

    val doCalculate2 : (Int, Int) -> Unit = { firstNum, secondNum ->
        val result = firstNum + secondNum
        println("결과: $result")
    }

    // 추가 미션
// ✅ 람다식 훈련 1.
// 사용자로 부터 이메일, 비밀번호, 비밀번호 확인을 받는다
// 비밀번호, 비밀번호 확인이 일치하는지 여부를 반환하는 람다식을 만드시요
// 입력 : [이메일], [비밀번호], [비밀번호 확인]
// 출력 : [일치 여부]
    val checkInputValid : (email : String, password : String, passwordConfirm : String) -> Boolean

// ✅ 람다식 훈련 2.
// 상, 하, 좌, 우 입력에 따라
// 출력되는 다이아몬드 값이 다른 람다식을 만드시오
// 어려우신분은 상태를 출력하기
// 예) 위, 유저가 위로 한칸 올라갔다.
// 입력 : [상, 하, 좌, 우] 커맨드
// 출력 : [커맨드에 맞게 이동 된 다이아몬드]
    val moveDiamond : (command : String) -> List<String>

// ✅ 람다식 훈련 3.
// 붕어빵 가게인데
// 팥, 슈크림, 피자, 갯수 를 입력받는다
// 입력값에 따라 출력이 달라지는 람다식을 만드시오
// 예) 팥, 3개, 자 여기 팥붕어빵 3개 있어요 - 라고 출력된다 - 반환
// 입력 : [붕어빵 종류], [붕어빵 수량]
// 출력 : [$붕어빵 종류, $붕어빵 수량, 자 여기 OO붕어빵 n개 있어요]

    val goldFishBread : (String, Int) -> String


}




// 변수
// 아래 함수를 람다식으로 바꾸시오
fun giveMeSomeCoin(coin: Int? = null) : String {
    return if (coin == null) {
        "코인이 0원 입니다. - 돈을 넣어주세요"
    } else {
        "코인이 ${coin}원 입니다."
    }
}

fun 더하기(first : Int = 0, second: Int, third: Int) : Int {
    val result = first + second
    println("더하기 / result: $result")

    return result
}

fun doCalculate(firstNum : Int, secondNum: Int) {
    val result = firstNum + secondNum
    println("결과: $result")
}


// 제외=======================================================================
fun moveDiamond (control : String,
                 diamondList : MutableList<MutableList<String>>) {
    val list = diamondList
    var cacheList : MutableList<MutableList<String>> = mutableListOf()

    var cache : String

    val UP : String = "w"
    val DOWN : String = "s"
    val LEFT : String = "a"
    val RIGHT : String = "d"

    val controlList = listOf<String>("w", "s", "a", "d")

    when (control) {
        !in controlList -> {
            return
        }
        UP -> {
            cacheList.add(list.removeAt(0))
            list.add(cacheList[0])
        }
        DOWN -> {
            cacheList.add(list.removeAt(list.lastIndex))
            list.add(0,cacheList[0])
        }
        LEFT -> {
            list.forEach {
                cache = it.removeAt(0)
                it.add(it.lastIndex, cache)
            }
        }
        RIGHT -> {
            list.forEach {
                cache = it.removeAt(it.lastIndex)
                it.add(0, cache)
            }
        }
    }
}

