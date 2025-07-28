package com.example.myapplication2

fun main(){

    //TODO: 게임 설명
    GameDescription().description()

    val monster = GameMonster().generate()
    println(monster)

    println("플레이어 정보를 입력하세요")
    print("이름 : ")
    var userName : String = readln() // TODO: 이름 받기
    print("나이 : ")
    var userAge : Int = readln().toInt() // TODO: 나이 받기
//    GamePlayer().userInfoPrint()
    println()

    val gameUser : Unit = GamePlayer(userName,userAge).userInfoPrint() // TODO: 받은 플레이어 정보 할당 및 출력

    println(gameUser)

}


// TODO: 플레이어
class GamePlayer(val playerName : String, val playerAge : Int, var playerLife : Int = 5){

    val name = playerName
    val age = playerAge
    fun userInfoPrint(){
        println("이름 : $playerName")
        println("나이 : $playerAge")
        println("❤️ : $playerLife")
    }
    fun damage(){}
}

// TODO: 난이도(몬스터 출현 확률)
// TODO: 쉬움 난이도
// TODO: 보통 난이도
// TODO: 어려움 난이도


// TODO: 몬스터
class GameMonster(){

    fun generate() : MutableList<String> = mutableListOf("몬스터O", "몬스터X") // TODO: 몬스터 있거나 없거나


}
// TODO: 층(몬스터 데미지)
class Floor() {

}

class GameDescription{
    fun description(){
        //TODO: 게임 설명
        println("RPG게임")
        println("이 게임은 100% 운빨게임 이다 후속작")
        println("⭐⭐⭐️[운도 실력이다]⭐⭐⭐")
        println()
        println("=================게임 설명=================")
        println("✅10층짜리 탑을 올라가고 있다")
        println("✅각 층에서는 몬스터가 나올수도 있고 안 나올수도 있다.")
        println("✅난이도에 따라 몬스터가 자주 나온다")
        println("✅체력은 총 5칸 몬스터 한 마리당 체력 1칸 소진")
        println("✅확률은 반반[무운을 빈다 ㅅㄱ]")
        println()
    }
}