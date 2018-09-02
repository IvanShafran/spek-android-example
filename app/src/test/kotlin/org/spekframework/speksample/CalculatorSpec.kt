package org.spekframework.speksample

import org.mockito.Mockito
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import kotlin.test.assertEquals

object CalculatorSpec : Spek({
    describe("A Calculator") {
        val calculator = Mockito.mock(Calculator::class.java)
        Mockito.`when`(calculator.add(2, 2)).thenReturn(4)

        it("should return 4") {
            assertEquals(expected = 4, actual = calculator.add(2, 2))
        }
    }
})
