import java.util.Timer
import java.util.TimerTask

//✅  사용자는 붕어빵을 주문할 수 있다
// 메뉴: 팥, 슈크림, 피자
// 갯수: 입력받기
//✅  메뉴마다 제조 시간이 다르다
//- 팥: 3초
//- 슈크림: 1초
//- 피자: 2초
//✅  모든 붕어빵이 완료가 되면
//- 손님에게 붕어빵을 제공한다.
fun main(){
    val breadInfo = mapOf<String, Int>(
        "팥" to 3,
        "슈크림" to 1,
        "피자" to 2)

    while (true){
        println("붕어빵 타이쿤")
        println("구매를 원하시면 입력해주세요 - 메뉴: 팥, 슈크림, 피자")
        val userMenu = readLine() ?: ""

        val cookingTime = breadInfo[userMenu] ?: 0
        cookBread(cookingTime, done = {
            println("${userMenu} 붕어빵 만들었어요 : $cookingTime 초 소모")
        })
    }
}

// 정대리가 만들었다
// 2초 뒤에 실행 이벤트가 내부에서 일어남
fun cookBread(seconds: Int, done: () -> Unit) {
    Timer().schedule(object : TimerTask() {
        override fun run() {
            println("${seconds}초 뒤에 실행되었다.")
            done()
        }
    }, seconds * 1000L)
}