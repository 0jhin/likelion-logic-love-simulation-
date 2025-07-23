package com.example.myapplication2

fun main(){
    val item : MutableList<String> = mutableListOf("물약", "몬스터") // TODO: 물약, 몬스터 리스트 생성

    //TODO: 게임 설명
    println("RPG게임")
    println("============이 게임은 100% 운빨게임 이다============")
    println("길을 걸어가고 있다")
    println("물약을 주우면 에너지가 증가한다.")
    println("몬스터를 만나면 생명력이 줄어든다.")


    //TODO: 유저 정보 할당
    println()
    println("유저 정보를 입력하세요")
    print("이름 : ")
    var userName : String = readln() // TODO: 이름 입력
    print("나이 : ")
    var userAge : Int = readln().toInt() // TODO: 나이 입력(정수로)


    // TODO: user변수에 기존 useInfo 정보(생명력, 방어력)랑 입력받은 정보 map으로 할당
    // TODO: isPlayerAlive에 유저 생명력 정수로 할당(셈이 가능하게)
    var user = userInfo(userName = userName, userAge = userAge).toMutableMap()
    var playerHp : Any? = user["생명력"] ?: 100 //TODO: 옵셔널 Any에서 옵셔널 언래핑
    var isPlayerAlive = playerHp.toString().toInt() // TODO: 정수형으로 변환
    println(isPlayerAlive)

    //TODO: 플레이어 정보 출력
    println("==========플레이어 정보==========")
    println("이름 : ${user["이름"]}")
    println("나이 : ${user["나이"]}")
    println("생명력 : ${user["생명력"]}")
    println("방어력 : ${user["방어력"]}")
    println("==============================")

    var isGameOver = true // TODO: 게임 종료 트리거
    var playRound : Int = 1 //TODO: 게임 라운드 체크

    // TODO: 게임 시작
    while (isGameOver){ // TODO: 생명력 0 되면 게임 오버
        val randomResult = item.random() // TODO: 몬스터, 물약 랜덤으로 하나 선택
        println()
        println("$playRound 라운드")
        println("계속 진행하려면 아무키나 입력하세요")
        readln() // TODO: 엔터로 매번 자동 진행
        if (randomResult == "몬스터"){ // TODO: 몬스터가 나오면 생명력 - 20
            println("$randomResult 발견, 생명력이 20 감소 합니다.")
            isPlayerAlive = isPlayerAlive - 20
            if (isPlayerAlive <= 0){
                println("남은 생명력 : ${isPlayerAlive}")
                println("==!!남은 생명력이 없습니다!!==")
                println("---GameOver---")
                isGameOver = false
                continue
            }
        }
        if (randomResult == "물약"){ // TODO: 물약이 나오면 생명력 + 10
            println("$randomResult 발견, 생명력이 10 증가 합니다.")
            isPlayerAlive = isPlayerAlive + 10
        }
        playRound += 1
        println("남은 생명력 : ${isPlayerAlive}")
    }

}

private fun userInfo (userName : String, userAge : Int) : Map<String, Any> {

    val user : Map<String, Any> = mapOf(
        "이름" to userName,
        "나이" to userAge,
        "생명력" to 100,
        "방어력" to 100
    )

    return user
}