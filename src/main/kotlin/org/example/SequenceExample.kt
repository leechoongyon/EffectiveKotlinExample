package org.example

class SequenceExample {
}

fun main() {
    /**
     * 무한한 시퀀스를 생성하는 Sequence 함수
     * 2 부터 생성 시작 +1 씩 계속해서 증가
     *
     */
    val primes: Sequence<Int> = sequence {
        var numbers = generateSequence(2) { it + 1 }
        while (true) {
            val prime = numbers.first()
            yield(prime)
            numbers = numbers.drop(1)
                .filter { it % prime != 0 }
        }
    }

    print(primes.take(10).toList())
}