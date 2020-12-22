package me.sbntt.mpp.math.extensions

import me.sbntt.mpp.math.extensions.comparators.*
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class FloatComparatorTests {

    @Test
    fun testEquals() {
        assertTrue { 1F eq 1F }
        assertTrue { 1F eq 0.99999999999999F }
        assertTrue { 1.1F - 1F eq 0.1F }
        assertTrue { 0.1F + 0.2F eq 0.3F }
    }

    @Test
    fun testDifferentThan() {
        assertTrue { 1F dt 2F }
        assertTrue { 1F differentThan  2F }
        assertFalse { 1F dt 0.99999999999999F }
        assertFalse { 1.1F - 1F dt 0.1F }
        assertFalse { 0.1F + 0.2F dt 0.3F }
    }

    @Test
    fun testGreaterThan() {
        assertTrue { 2F gt 1F }
        assertTrue { 2F greaterThan 1F }
        assertFalse { 1F gt 0.99999999999999F }
        assertFalse { 1F gt 1F }
        assertFalse { 1.1F - 1F gt 0.1F }
    }

    @Test
    fun testLowerThan() {
        assertTrue { 1F lt 2F }
        assertTrue { 1F lowerThan 2F }
        assertFalse { 0.99999999999999F lt 1F }
        assertFalse { 1F lt 1F }
        assertFalse { 1.1F - 1F lt 0.1F }
    }

    @Test
    fun testGreaterOrEquals() {
        assertTrue { 2F geq 1F }
        assertTrue { 2F greaterOrEquals 1F }
        assertTrue { 1F geq 0.99999999999999F }
        assertTrue { 1F geq 1F }
        assertTrue { 1.1F - 1F geq 0.1F }
        assertFalse { 0F geq 0.1F }
        assertFalse { 1.1F - 1.1F geq 0.1F }
    }

    @Test
    fun testLowerOrEquals() {
        assertTrue { 1F leq 2F }
        assertTrue { 1F lowerOrEquals  2F }
        assertTrue { 0.99999999999999F leq 1F }
        assertTrue { 1F leq 1F }
        assertTrue { 0.1F leq 1.1F - 1F }
        assertFalse { 0.1F leq 0F }
        assertFalse { 0.1F leq 1.1F - 1.1F }
    }

}