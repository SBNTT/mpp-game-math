package me.sbntt.mpp.math.extensions

import me.sbntt.mpp.math.extensions.comparators.*
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class DoubleComparatorTests {

    @Test
    fun testEquals() {
        assertTrue { 1.0 eq 1.0 }
        assertTrue { 1.0 eq 0.999999999999999 }
        assertTrue { 1.1 - 1.0 eq 0.1 }
        assertTrue { 0.1 + 0.2 eq 0.3 }
    }

    @Test
    fun testDifferentThan() {
        assertTrue { 1.0 dt 2.0 }
        assertTrue { 1.0 differentThan  2.0 }
        assertFalse { 1.0 dt 0.999999999999999 }
        assertFalse { 1.1 - 1.0 dt 0.1 }
        assertFalse { 0.1 + 0.2 dt 0.3 }
    }

    @Test
    fun testGreaterThan() {
        assertTrue { 2.0 gt 1.0 }
        assertTrue { 2.0 greaterThan 1.0 }
        assertFalse { 1.0 gt 0.999999999999999 }
        assertFalse { 1.0 gt 1.0 }
        assertFalse { 1.1 - 1.0 gt 0.1 }
    }

    @Test
    fun testLowerThan() {
        assertTrue { 1.0 lt 2.0 }
        assertTrue { 1.0 lowerThan 2.0 }
        assertFalse { 0.999999999999999 lt 1.0 }
        assertFalse { 1.0 lt 1.0 }
        assertFalse { 1.1 - 1.0 lt 0.1 }
    }

    @Test
    fun testGreaterOrEquals() {
        assertTrue { 2.0 geq 1.0 }
        assertTrue { 2.0 greaterOrEquals 1.0 }
        assertTrue { 1.0 geq 0.999999999999999 }
        assertTrue { 1.0 geq 1.0 }
        assertTrue { 1.1 - 1.0 geq 0.1 }
        assertFalse { 0.0 geq 0.1 }
        assertFalse { 1.1 - 1.1 geq 0.1 }
    }

    @Test
    fun testLowerOrEquals() {
        assertTrue { 1.0 leq 2.0 }
        assertTrue { 1.0 lowerOrEquals  2.0 }
        assertTrue { 0.999999999999999 leq 1.0 }
        assertTrue { 1.0 leq 1.0 }
        assertTrue { 0.1 leq 1.1 - 1.0 }
        assertFalse { 0.1 leq 0.0 }
        assertFalse { 0.1 leq 1.1 - 1.1 }
    }

}