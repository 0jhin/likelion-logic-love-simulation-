package com.example.myapplication2

//✅RPG 게임 요건
//플레이어는 게임 플레이 단계에서 게임 난이도를 노말, 나이트메어, 헬 중 선택할 수 있다.
//하나의 게임 승리 조건은 총 10층에 도달하는 것이다.
//10층에 도달하기 까지 제한시간이 존재한다.
//제한 시간은 게임 난이도 마다 상이하다 - 노말 → 나이트메어 → 헬 로 갈 수록 더 짧아진다
//각 층에는 몬스터들이 일정확률로 출몰한다.
//(몬스터 종류: 일반, 챔피언, 유니크)

//✅RPG 게임 - 기능정의서
//- 사용자는 10개의 층을 오르면 승리한다.
//- 아무키나 누르면 다음층으로 올라간다.
//- 일정확률로 몬스터를 만나게 된다.
//- 몬스터 마다 다른 생명력, 공격력을 가지고 있다.

//✅ RPG 게임 요건
//플레이어는 게임 플레이 단계에서 게임 난이도를 노말, 나이트메어, 헬 중 선택할 수 있다.
//하나의 게임 승리 조건은 총 10층에 도달하는 것이다.
//10층에 도달하기 까지 제한시간이 존재한다.
//제한 시간은 게임 난이도 마다 상이하다 - 노말 → 나이트메어 → 헬 로 갈 수록 더 짧아진다
//각 층에는 몬스터들이 일정확률로 출몰한다.
//(몬스터 종류: 일반, 챔피언, 유니크)

//✅ RPG 게임 - 기능정의서
//- 사용자는 10개의 층을 오르면 승리한다.
//- 아무키나 누르면 다음층으로 올라간다.
//- 일정확률로 몬스터를 만나게 된다.

//
class MyPlayer(val name: String = "용사",
               val age: Int = 10,
               val power: Int = 7,
               var life: Int = 30) {
    fun getDamaged(){
        this.life = this.life - 5
    }
}

class Monster99(val name: String = "고블린",
                val power: Int = 2,
                val life: Int = 10)



// 난이도
// - 이름
class GameLevel99(val name: String)

fun main(){

    val gameManager = GameManger()

    val currentPlayer = MyPlayer()

    val currentGameLevel = GameLevel99("헬")


    println("던전에 들어왔다")

    while (gameManager.isGameEnd()) {

        println("아무키나 입력하시면 층을 올라갑니다")

        //- 일정확률로 몬스터를 만나게 된다.

        val foundMonster = gameManager.meetMonster()

        if (foundMonster != null) {
            currentPlayer.getDamaged()
        }

        GameManger().gameFloorUp()
    }
}

class GameManger {

    var currentFloor : Int = 1

    val aMonster1 = Monster99("일반 몬스터")
    val aMonster2 = Monster99("유니크 몬스터")
    val aMonster3 = Monster99("챔피언 몬스터")

    val monsterPool = listOf<Monster99?>(aMonster1, aMonster2, aMonster3,
        null, null, null)

    fun meetMonster() : Monster99? {
        val foundMonster : Monster99? = monsterPool.randomOrNull()
        return foundMonster
    }

    fun isGameEnd() : Boolean {
        return this.currentFloor < 11
    }

    fun gameFloorUp(){
        this.currentFloor = this.currentFloor + 1
    }
}

// 액션의 묶음
class Utils {
    fun sayHello(){}
    fun receiveNumberFromUser() : Int {
        val userInputNumber = readln().toIntOrNull() ?: 0
        return userInputNumber
    }
}