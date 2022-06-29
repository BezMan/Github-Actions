package com.example.mycompose

import org.junit.Assert.*
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
    }

    @Test
    fun mult_isCorrect() {
        assertEquals(4, 2 * 2)
    }
//
//    @Test
//    fun failing_test() {
//        fail("on purpose")
//    }

    @Test
    fun loop_1000() {
        for (i in 1..1000) {
            check_equal(i)
        }
    }

    private fun check_equal(i: Int) {
        assertEquals(i, i)
    }


}