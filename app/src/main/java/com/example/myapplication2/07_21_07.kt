package com.example.myapplication2


// ==================================================funtion

// 손질 전 닭
private fun chickenReady(chicken : String) : String{
    //닭다리 손질
    return "손질 후 닭"
}

private fun cleanVegetable(vegetable : String) : String{
    var vegetable : String = vegetable
    return "씻은 $vegetable"
}

private fun mixSauce(Sauce : List<String>) : List<String>{
//    고추장 2큰술
//    고춧가루 1큰술
//    간장 2큰술
//    설탕 1.5큰술
//    다진 마늘 1큰술
//    다진 생강 1/2작은술
//    맛술(미림) 1큰술
//    참기름 1작은술
//    후추 약간
    var sauce : List<String> = Sauce
    return sauce
}

// fire : 불 강도(1 = 약불, 2 = 중불, 3 = 강불)
// ingredient : 재료(손질된_닭다리살, 준비된_야채, 준비된_양념장)
// time : 요리 시간(분)
private fun cooking(fire : Int, ingredient : List<String>, sauce : List<String>, time : Int) : String{
    return "완성된 닭갈비"
}
// ==================================================

fun main(){
//    🐓 닭갈비 레시피 (2~3인분 기준)

//    재료 손질하기
    val chicken = chickenReady("손질 전 닭")

    val cabbage = cleanVegetable("양배추")
    val sweetPotato = cleanVegetable("고구마")
    val onion = cleanVegetable("양파")
    val leek = cleanVegetable("대파")

    var readyingredient = mutableListOf<String>(chicken, cabbage, sweetPotato, onion, leek)
    println(readyingredient)

    var mixedSauce = mutableListOf<String>("고추장", "고춧가루", "간장", "설탕", "다진 마늘", "다진 생강", "맛술", "참기름", "후추")
    println(mixedSauce)

    println(cooking(fire = 2, ingredient = readyingredient, sauce = mixedSauce, time = 30))
}