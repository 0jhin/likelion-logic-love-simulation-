package com.example.myapplication2

fun main(){

    val monsterList = listOf(
        generateNormalMonster(),
        generateNormalMonster(),
        generateNormalMonster(),
        generateUniqueMonster(),
        generateUniqueMonster(),
        generateChampionMonster(),
        generateChampionMonster(),
        generateChampionMonster(),
        generateChampionMonster(),
    )

    // 미니미션
    // 몬스터의 등급별로
    // 배열을 뽑아보세요
    // monsterList 이 정보에서 각각 배열 뽑기

    val group : Map<String, List<Map<String, Any>>> = monsterList.groupBy({
        (it["이름"] as? String) ?: ""
    })

}

fun generateNormalMonster() : Map<String, Any> {
    return mapOf<String, Any>(
        "이름" to "일반몬스터",
        "공격력" to 10,
        "생명력" to 30)
}

fun generateChampionMonster() : Map<String, Any> {
    return mapOf<String, Any>(
        "이름" to "챔피언몬스터",
        "공격력" to 20,
        "생명력" to 50)
}
fun generateUniqueMonster() : Map<String, Any> {
    return mapOf<String, Any>(
        "이름" to "유니크몬스터",
        "공격력" to 30,
        "생명력" to 100)
}