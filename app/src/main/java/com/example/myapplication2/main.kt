package com.example.myapplication2

fun main() {

    while (true) {
        println("작업중")
    }

//    var introComment : String = "당신은 3번의 입력 기회가 있습니다." + "프로그램 종료를 원하시면 [종료]를 입력해주세요"
//    var exitComment : String = "프로그램을 종료합니다"
//    var esentialComment : String = "글자를 입력해주세요"
//
//    //안내문구 작성
//    println(introComment)
//
//
//    println("[TEST 10]")
//
//    // 1회
//    var userInput : String? = readLine() // 사용자 입력을 받는다
//
//    // 체크하는 것들
//    if (userInput == "") { // 입력된 값이 비어있으면
//        println("[TEST 17]")
//        println(esentialComment) // "글자를 입력해주세요" 라는 안내문구를 보여준다
//    }
//    // 체크하는 것들
//    else if (userInput == "break") { // 입력된 값이 종료라면
//        println("[TEST 22]")
//        println(exitComment) // 프로그램을 종료합니다 - 안내 문구 보여준다
//        return // 프로그램을 종료한다
//    }
//    // OK 인 상황
//    else if (userInput != "") { // 입력된 값이 있으면
//        println("[TEST 28]")
//        println("당신이 입력한 글자: $userInput 입니다")// 당신이 입력한 글자: ㅇㅇㅇ 입니다
//        println("남은 입력횟수는 2회입니다.")// 남은 입력횟수는 2회입니다.
//    }
//
//
//    // 2회
//    var userInput2 : String? = readLine()// 사용자 입력을 받는다
//    println("[TEST 36]")
//
//    if (userInput2 == "") { // 입력된 값이 비어있으면
//        println("[TEST 38]")
//        println(esentialComment) // "글자를 입력해주세요" 라는 안내문구를 보여준다
//    }
//    // 체크하는 것들
//    else if (userInput2 == "break") { // 입력된 값이 종료라면
//        println("[TEST 43]")
//        println(exitComment) // 프로그램을 종료합니다 - 안내 문구 보여준다
//        return // 프로그램을 종료한다
//    }
//    // OK 인 상황
//    else if (userInput2 != "") { // 입력된 값이 있으면
//        println("[TEST 49]")
//        println("당신이 입력한 글자: $userInput 입니다") // 당신이 입력한 글자: ㅇㅇㅇ 입니다
//        println("남은 입력횟수는 1회입니다.") // 남은 입력횟수는 1회입니다.
//    }
//    // 3회
//    var userInput3 : String? = readLine() // 사용자 입력을 받는다
//
//    if (userInput == "") { // 입력된 값이 비어있으면
//        println("[TEST 57]")
//        println(esentialComment) // "글자를 입력해주세요" 라는 안내문구를 보여준다
//        println(exitComment) // 프로그램을 종료합니다
//    }
//    // 체크하는 것들
//    else if (userInput3 == "break") { // 입력된 값이 종료라면
//        println("[TEST 63]")
//        println(exitComment) // 프로그램을 종료합니다 - 안내 문구 보여준다
//        return // 프로그램을 종료한다
//    }
//    // OK 인 상황
//    else if (userInput3 != "") { // 입력된 값이 있으면
//        println("[TEST 69]")
//        println("당신이 입력한 글자: $userInput 입니다") // 당신이 입력한 글자: ㅇㅇㅇ 입니다
//        println(exitComment) // 프로그램을 종료합니다
//    }
//    println("[TEST 73]")



//    var i:Int = 0 // 반복 횟수
//    var numberOfTimesLeft : Int = 2 // 남은 횟수
//    val Description = "commend input" // 설명
//
//    println(Description) // 설명 출
//
//    while (i < 3){ // 3번 반복 시작
//        var userInput : String? = readLine()
//        var userInputempty = userInput
//
//        if (userInput == "break"){
//            println("you input break")
//            return
//        }  else if (userInput == ""){
//            while (userInput == ""){
//                if (userInput == "") {
//                    println("글자를 입력해주세요")
//                    var userInputempty : String? = readLine()
//                    userInput = userInputempty
//                } else if (userInputempty == "break"){
//                    println("you input break")
//                    return
//                } else {
//                    break
//                }
//                }
//            } else if (userInput != ""){
//            println("you input : $userInput")
//        }
//        println("남은 횟수 $numberOfTimesLeft")
//        --numberOfTimesLeft
//        i++
//    }

//    println("세번 입력")
//    var input : String? = readLine()
//    if (input == ""){
//        println("글자를 입력하세요")
//    } else if (input != ""){
//        println("입력한 글자 : $input")
//    }
//    var input2 : String? = readLine()
//    if (input2 == ""){
//        println("글자를 입력하세요")
//    } else if (input2 != ""){
//        println("입력한 글자 : $input2")
//    }
//    var input3 : String? = readLine()
//    if (input3 == ""){
//        println("글자를 입력하세요")
//    } else if (input3 != ""){
//        println("입력한 글자 : $input3")
//    }





    // 사용자 입력이 없다면 "글자를 입력해주세요"를 출력하겠다
//    var userInput : String? = readLine()
//
//    if (userInput == ""){
//        println("글자를 입력해주세요")
//
//    } else if (userInput != ""){
//        println(userInput)
//    }
//
//    var nnn : String? = null
//    println(nnn)
//
//    var mmm = nnn ?: ""
//    println(mmm)

//    println("아무말이나 입력해주세요")
//    var userInput : String? = readLine()



//    var userInput : String? = readLine()
//
//    if (userInput == ""){
//        println("글자를 입력해주세요")
//
//    } else if (userInput != ""){
//        println(userInput)
//    }





////    println("아무말이나 입력해주세요!")
//
//    var userInput : String? = null
//
//    var userInput2 = userInput ?: "이걸 넣어라"
//
////    println("userInput2 : $userInput2")
//
//    if(userInput2 == null){
//        println("값이 없다")
//    } else if (userInput2 != null){
//        println("값이 있다")
//    }

//    var userInput2 = userInput

//    var userInput = readLine()

//    println("userInput : $userInput")
}