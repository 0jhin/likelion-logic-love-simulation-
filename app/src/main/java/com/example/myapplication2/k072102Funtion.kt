package com.example.myapplication2

fun main(){


    println("소설 선택")
    println("기억의 정원, 마지막 엽서, 벤치에 남긴 이름")
    var novelName = readln()


    when(novelName){
        "기억의 정원" -> {
            var manName = 기억의_정원_남주_이름()

            기억의_정원_제목()

            기억의_정원_상황_설명_1(manName)

            기억의_정원_남자_대사_1()

            기억의_정원_상황_설명_2()

            기억의_정원_상황_설명_3()

            기억의_정원_여자_대사_1()

            기억의_정원_상황_설명_4(manName)

            기억의_정원_남자_대사_2()
        }
        "마지막 엽서" -> {
            var manName2 = "준호"
            var womanName2 = "수연"
            println("남주의 이름을 정해주세요")
            print("남주 : ")

            // TODO: 상황 설명 1
            println("[상황 설명 1]")
            println("서울의 첫눈이 내리던 날, 수연은 오래된 엽서 한 장을 발견했다.")

            // TODO: 편지 내용
            println("[편지 내용]")
            println("'언젠가 네가 이걸 보게 된다면, 난 아직 널 기다리고 있을 거야. – 준호'")

            // TODO: 상황 설명 2
            println("[상황 설명 2]")
            println("그는 열아홉의 겨울, 말도 없이 사라졌다. 수연은 수십 번 마음을 접고도, 이따금 그를 떠올렸다.")
            println("엽서는 십 년 전 주소로 되어 있었다. 믿지 못할 마음으로 그녀는 기차를 탔다.")

            // TODO: 상황 설명 3
            println("[상황 설명 3]")
            println("도착한 시골 마을, 정류장 앞 작은 카페. 문을 열자 종소리가 울렸고, 낡은 의자에 앉아 있던 남자가 고개를 들었다.")

            // TODO: 남자 대사 1
            println("[남자 대사 1]")
            println("“수연이…?”")

            // TODO: 상황 설명 4
            println("[상황 설명 4]")
            println("눈이 내리고 있었다. 모든 시간은 멈춘 듯, 둘 사이의 거리만 천천히 녹아내렸다.")
        }
    }

}

private fun 기억의_정원_남주_이름(): String {
    // TODO: 이름
    println("당신의 이름은 무엇인가요?")
    println("입력하지 않을 시 기본 이름[성진]으로 진행합니다.")
    print("이름 : ")
    var manName = readln()
    if (manName == ""){
        manName = "성진"
    }
    println()
    return manName
}
private fun 기억의_정원_상황_설명_4(manName: String) {
    // TODO: 성황 설명 4
    println("[상황 설명4]")
    println("$manName 은 고개를 들었다. 그녀는 노트 속 한 페이지에 그려진 얼굴과 똑같이 생긴 여자였다.")
    println("[계속 하시려면 아무키나 입력하시오]")
    readln()
    println()
}

private fun 기억의_정원_상황_설명_1(manName: String) {
    // TODO: 상황 설명 1
    println("[상황 설명 1]")
    println("지하철 2호선 끝자락, $manName 은 매일 같은 시간에 같은 자리에 앉는다. 허름한 가방에는 닳아빠진 노트 한 권이 들어 있고, 그는 그것을 펴 한 장씩 넘기며 누군가의 이름을 중얼거린다.")
    println("[계속 하시려면 아무키나 입력하시오]")
    readln()
    println()
}


private fun 기억의_정원_남자_대사_2() {
    // TODO: 남자 대사 2
    println("[남자 대사 2]")
    println("“기억나요? 당신을?”")
    println("[계속 하시려면 아무키나 입력하시오]")
    readln()
}

private fun 기억의_정원_여자_대사_1() {
    // TODO: 여자 대사 1
    println("[여자 대사 1]")
    println("“그림… 제가 그린 건가요?”")
    println("[계속 하시려면 아무키나 입력하시오]")
    readln()
    println()
}

private fun 기억의_정원_상황_설명_3() {
    // TODO: 상황 설명 3
    println("[상황 설명 3]")
    println("어느 날, 낯선 여자가 그 앞에 앉았다. 그녀는 조용히 그를 바라보다가 조심스레 물었다.")
    println("[계속 하시려면 아무키나 입력하시오]")
    readln()
    println()
}

private fun 기억의_정원_상황_설명_2() {
    // TODO: 상황 설명 2
    println("[상황 설명 2]")
    println("그 이름들은 그의 기억 속에서 점점 흐려져 간다. 그는 어딘가에서 사라진 사람들을 찾고 있었다. 누구도 그들을 기억하지 못했지만,")
    println("그는 자신만은 잊지 않겠다고 다짐했다. 노트 속에는 희미한 얼굴의 스케치와 손글씨로 적힌 짧은 이야기들이 빼곡했다. 마치 누군가의 인생을 복원하려는 듯.")
    println("[계속 하시려면 아무키나 입력하시오]")
    readln()
    println()
}

private fun 기억의_정원_남자_대사_1() {
    // TODO: 남자 대사 1
    println("[남자 대사 1]")
    println("“윤하… 서정… 인우…”")
    println("[계속 하시려면 아무키나 입력하시오]")
    readln()
    println()
}

private fun 기억의_정원_제목() {
    // TODO: 글 제목
    println("[글 제목]")
    println("《기억의 정원》")
    println("[계속 하시려면 아무키나 입력하시오]")
    readln()
    println()
}