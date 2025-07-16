package com.example.myapplication2

fun main(){
    // if문 예제
    // if로 체크 하는 프로그램(3번)
    var introComment : String = "당신은 3번의 입력 기회가 있습니다." + "프로그램 종료를 원하시면 [break]를 입력해주세요"
    var exitComment : String = "프로그램을 종료합니다"
    var esentialComment : String = "글자를 입력해주세요"

    //안내문구 작성
    println(introComment)

    // 1회
    var userInput : String? = readLine() // 사용자 입력을 받는다

    // 체크하는 것들
    if (userInput == "") { // 입력된 값이 비어있으면
        println(esentialComment) // "글자를 입력해주세요" 라는 안내문구를 보여준다
    }
    // 체크하는 것들
    else if (userInput == "break") { // 입력된 값이 종료라면
        println(exitComment) // 프로그램을 종료합니다 - 안내 문구 보여준다
        return // 프로그램을 종료한다
    }
    // OK 인 상황
    else if (userInput != "") { // 입력된 값이 있으면
        println("당신이 입력한 글자: $userInput 입니다")// 당신이 입력한 글자: ㅇㅇㅇ 입니다
        println("남은 입력횟수는 2회입니다.")// 남은 입력횟수는 2회입니다.
    }


    // 2회
    var userInput2 : String? = readLine()// 사용자 입력을 받는다

    if (userInput2 == "") { // 입력된 값이 비어있으면
        println(esentialComment) // "글자를 입력해주세요" 라는 안내문구를 보여준다
    }
    // 체크하는 것들
    else if (userInput2 == "break") { // 입력된 값이 종료라면
        println(exitComment) // 프로그램을 종료합니다 - 안내 문구 보여준다
        return // 프로그램을 종료한다
    }
    // OK 인 상황
    else if (userInput2 != "") { // 입력된 값이 있으면
        println("당신이 입력한 글자: $userInput 입니다") // 당신이 입력한 글자: ㅇㅇㅇ 입니다
        println("남은 입력횟수는 1회입니다.") // 남은 입력횟수는 1회입니다.
    }
    // 3회
    var userInput3 : String? = readLine() // 사용자 입력을 받는다

    if (userInput == "") { // 입력된 값이 비어있으면
        println(esentialComment) // "글자를 입력해주세요" 라는 안내문구를 보여준다
        println(exitComment) // 프로그램을 종료합니다
    }
    // 체크하는 것들
    else if (userInput3 == "break") { // 입력된 값이 종료라면
        println(exitComment) // 프로그램을 종료합니다 - 안내 문구 보여준다
        return // 프로그램을 종료한다
    }
    // OK 인 상황
    else if (userInput3 != "") { // 입력된 값이 있으면
        println("당신이 입력한 글자: $userInput 입니다") // 당신이 입력한 글자: ㅇㅇㅇ 입니다
        println(exitComment) // 프로그램을 종료합니다
    }
}