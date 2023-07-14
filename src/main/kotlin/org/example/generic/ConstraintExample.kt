package org.example.generic

class ConstraintExample {
}

interface Sport {
    fun play()
}

interface Calories {
    fun calculate()
}

// <T: AutoCloseable> 을 제약조건으로 설정함으로써 AutoCloseable 을 구현한 객체만 입력 파라미터 가능
fun <T : AutoCloseable> release(source: T) {
    source.close()
}

// 여러개 제약조건을 설정하기 위해 where 사용
fun <T> playAndCalculate(source: T) where T : Sport, T : Calories {
    source.play()
    source.calculate()
}