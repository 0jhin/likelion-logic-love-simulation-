package com.tuentuenna.noactivityproject.lecture0724_class.lecture

//✅ 사용자를 RPG 게임을 플레이 한다.
// - 길을 가다가
// 물약을 주우면 생명력이 증가한다.
// 몬스터를 만나면 생명력이 줄어든다.

//✅ 유저 정보
//- 이름: 문자
//- 나이: 숫자
//- 생명력: 숫자
//- 방어력: 숫자

fun main(){

    val eventList = listOf<String>("몬스터","몬스터","몬스터", "물약")
    // 용사 정보
    val userInfo = mutableMapOf<String, Any>(
        "이름" to "김철수",
        "나이" to 10,
        "생명력" to 100,
        "방어력" to 20)
    while (true){

        println("용사가 던전에 갑니다")
        println("계속 하시려면 아무키나 눌러주세요")
        val userInput = readLine() ?: ""
        val randomEvent = eventList.random()

        val currentLifeScore = (userInfo["생명력"] as? Int) ?: 0

        if (currentLifeScore < 0) {
            println("용사 ${userInfo["이름"]} 전사했습니다 .. RIP")
            return
        }

        // - 길을 가다가
        when(randomEvent) {
            // 몬스터를 만나면 생명력이 줄어든다.
            "몬스터" -> {
                val currentLife : Int = (userInfo["생명력"] as? Int) ?: 0
                userInfo["생명력"] = currentLife - 30
                println("몬스터를 만나 생명력 30이 줄었다")
                println("현재 생명력 : ${userInfo["생명력"]}")
            }
            // 물약을 주우면 생명력이 증가한다.
            "물약" -> {
                val currentLife : Int = (userInfo["생명력"] as? Int) ?: 0
                userInfo["생명력"] = currentLife + 5
                println("물약을 마셔서 생명력 5이 늘었다")
                println("현재 생명력 : ${userInfo["생명력"]}")
            }
            else -> {

            }
        }

    }
}
