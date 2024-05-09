package com.example.myapplication

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
        //println("성공적 테스트")
    }

    @Test
    fun `test makeRandom function`() {
        val answer = makeRandom()
        assertEquals(3, answer.length)
        for (ch in answer) {
            assert(ch in '1'..'9')
        }
    }

    @Test
    fun `test evaluate function with 3 strikes`() {
        answer = "123"
        val result = evaluate("123")
        assertEquals(result, "3스트라이크")
    }

    @Test
    fun `test evaluate function with 1 ball 1 strike`() {
        answer = "123"
        val result = evaluate("135")
        assertEquals(result, "1볼 1스트라이크")
    }
}