package me.sbntt.mpp.math.extensions

import me.sbntt.mpp.math.extensions.comparators.eq
import kotlin.test.Test
import kotlin.test.assertTrue

class NumericCircularCoercionTests {

    /**
     * Double tests
     */

    @Test
    fun testDoublePositiveIncreasingRange() {
        assertTrue { -1.0 coerceCircularIn 0.0 .. 360.0 eq 359.0 }
        assertTrue { 0.0 coerceCircularIn 0.0 .. 360.0 eq 0.0 }
        assertTrue { 360.0 coerceCircularIn 0.0 .. 360.0 eq 0.0 }
        assertTrue { 361.0 coerceCircularIn 0.0 .. 360.0 eq 1.0 }
    }

    @Test
    fun testDoubleNegativeIncreasingRange() {
        assertTrue { -11.0 coerceCircularIn -10.0 .. 0.0 eq -1.0 }
        assertTrue { -10.0 coerceCircularIn -10.0 .. 0.0 eq -10.0 }
        assertTrue { 0.0 coerceCircularIn -10.0 .. 0.0 eq -10.0 }
        assertTrue { 1.0 coerceCircularIn -10.0 .. 0.0 eq -9.0 }
    }

    @Test
    fun testDoublePositiveDecreasingRange() {
        assertTrue { 0.0 coerceCircularIn 10.0 .. 0.0 eq 10.0 }
        assertTrue { -1.0 coerceCircularIn 10.0 .. 0.0 eq 9.0 }
        assertTrue { 10.0 coerceCircularIn 10.0 .. 0.0 eq 10.0 }
        assertTrue { 12.0 coerceCircularIn 10.0 .. 0.0 eq 2.0 }
    }

    @Test
    fun testDoubleNegativeToPositiveRange() {
        assertTrue { -8.0 coerceCircularIn -5.0 .. 5.0 eq 2.0 }
        assertTrue { 7.0 coerceCircularIn -5.0 .. 5.0 eq -3.0 }
    }

    @Test
    fun testDoubleFloatingRange() {
        assertTrue { 1.1 coerceCircularIn 0.0 .. 1.0 eq 0.1 }
        assertTrue { -0.1 coerceCircularIn 0.0 .. 1.0 eq 0.9 }
    }

    /**
     * Float tests
     */

    @Test
    fun testFloatPositiveIncreasingRange() {
        assertTrue { -1F coerceCircularIn 0F .. 360F eq 359F }
        assertTrue { 0F coerceCircularIn 0F .. 360F eq 0F }
        assertTrue { 360F coerceCircularIn 0F .. 360F eq 0F }
        assertTrue { 361F coerceCircularIn 0F .. 360F eq 1F }
    }

    @Test
    fun testFloatNegativeIncreasingRange() {
        assertTrue { -11F coerceCircularIn -10F .. 0F eq -1F }
        assertTrue { -10F coerceCircularIn -10F .. 0F eq -10F }
        assertTrue { 0F coerceCircularIn -10F .. 0F eq -10F }
        assertTrue { 1F coerceCircularIn -10F .. 0F eq -9F }
    }

    @Test
    fun testFloatPositiveDecreasingRange() {
        assertTrue { 0F coerceCircularIn 10F .. 0F eq 10F }
        assertTrue { -1F coerceCircularIn 10F .. 0F eq 9F }
        assertTrue { 10F coerceCircularIn 10F .. 0F eq 10F }
        assertTrue { 12F coerceCircularIn 10F .. 0F eq 2F }
    }

    @Test
    fun testFloatNegativeToPositiveRange() {
        assertTrue { -8F coerceCircularIn -5F .. 5F eq 2F }
        assertTrue { 7F coerceCircularIn -5F .. 5F eq -3F }
    }

    @Test
    fun testFloatFloatingRange() {
        assertTrue { 1.1F coerceCircularIn 0F .. 1F eq 0.1F }
        assertTrue { -0.1F coerceCircularIn 0F .. 1F eq 0.9F }
    }

    /**
     * Int tests
     */

    @Test
    fun testIntPositiveIncreasingRange() {
        assertTrue { -1 coerceCircularIn 0 .. 360 eq 359 }
        assertTrue { 0 coerceCircularIn 0 .. 360 eq 0 }
        assertTrue { 360 coerceCircularIn 0 .. 360 eq 0 }
        assertTrue { 361 coerceCircularIn 0 .. 360 eq 1 }
    }

    @Test
    fun testIntNegativeIncreasingRange() {
        assertTrue { -11 coerceCircularIn -10 .. 0 eq -1 }
        assertTrue { -10 coerceCircularIn -10 .. 0 eq -10 }
        assertTrue { 0 coerceCircularIn -10 .. 0 eq -10 }
        assertTrue { 1 coerceCircularIn -10 .. 0 eq -9 }
    }

    @Test
    @Suppress("EmptyRange")
    fun testIntPositiveDecreasingRange() {
        assertTrue { 0 coerceCircularIn 10 .. 0 eq 10 }
        assertTrue { -1 coerceCircularIn 10 .. 0 eq 9 }
        assertTrue { 10 coerceCircularIn 10 .. 0 eq 10 }
        assertTrue { 12 coerceCircularIn 10 .. 0 eq 2 }
    }

    @Test
    fun testIntNegativeToPositiveRange() {
        assertTrue { -8 coerceCircularIn -5 .. 5 eq 2 }
        assertTrue { 7 coerceCircularIn -5 .. 5 eq -3 }
    }

    /**
     * Long tests
     */

    @Test
    fun testLongPositiveIncreasingRange() {
        assertTrue { -1L coerceCircularIn 0L .. 360L eq 359L }
        assertTrue { 0L coerceCircularIn 0L .. 360L eq 0L }
        assertTrue { 360L coerceCircularIn 0L .. 360L eq 0L }
        assertTrue { 361L coerceCircularIn 0L .. 360 eq 1L }
    }

    @Test
    fun testLongNegativeIncreasingRange() {
        assertTrue { -11L coerceCircularIn -10L .. 0L eq -1L }
        assertTrue { -10L coerceCircularIn -10L .. 0L eq -10L }
        assertTrue { 0L coerceCircularIn -10L .. 0L eq -10L }
        assertTrue { 1L coerceCircularIn -10L .. 0L eq -9L }
    }

    @Test
    @Suppress("EmptyRange")
    fun testLongPositiveDecreasingRange() {
        assertTrue { 0L coerceCircularIn 10L .. 0L eq 10L }
        assertTrue { -1L coerceCircularIn 10L .. 0L eq 9L }
        assertTrue { 10L coerceCircularIn 10L .. 0L eq 10L }
        assertTrue { 12L coerceCircularIn 10L .. 0L eq 2L }
    }

    @Test
    fun testLongNegativeToPositiveRange() {
        assertTrue { -8L coerceCircularIn -5L .. 5L eq 2L }
        assertTrue { 7L coerceCircularIn -5L .. 5L eq -3L }
    }

}