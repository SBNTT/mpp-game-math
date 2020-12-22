package me.sbntt.mpp.math.vectors

import me.sbntt.mpp.math.extensions.comparators.DoubleComparator.eq
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class Vec2Tests {

    @Test
    fun testConstructor() {
        val vec = Vec2(1, 2)
        assertTrue(vec.x eq 1.0)
        assertTrue(vec.y eq 2.0)
    }

    @Test
    fun plusOperatorTest() {
        assertEquals(Vec2(10, 5), Vec2(6, 3) + Vec2(4, 2))
    }

    @Test
    fun minusOperatorTest() {
        assertEquals(Vec2(2, 1), Vec2(6, 3) - Vec2(4, 2))
    }

    @Test
    fun mulOperatorTest() {
        assertEquals(Vec2(24, 6), Vec2(6, 3) * Vec2(4, 2))
    }

    @Test
    fun divOperatorTest() {
        assertEquals(Vec2(2, 1.5), Vec2(6, 3) / Vec2(3, 2))
    }

    @Test
    fun dotProductTest() {
        assertTrue(Vec2(-6, 8) dot Vec2(5, 12) eq 66.0)
    }

    @Test
    fun scaleTest() {
        assertEquals(Vec2(6, 12), Vec2(3, 6) * 2)
        assertEquals(Vec2(3, 6), Vec2(6, 12) / 2)
    }

    @Test
    fun lengthTest() {
        assertTrue(Vec2(5, 12).length() eq 13.0)
    }

    @Test
    fun normalizeTest() {
        assertEquals(Vec2(0.6, 0.8), Vec2(3, 4).normalize())
    }

    @Test
    fun negateTest() {
        assertEquals(Vec2(-3, 4), -Vec2(3, -4))
    }

    @Test
    fun isNearTest() {
        val vecA = Vec2(1, 1)
        val vecB = Vec2(4, 5)
        val vecC = Vec2(6, 6)
        assertTrue(vecA.isNear(vecB, 5))
        assertFalse(vecA.isNear(vecB, 5, strict = true))
        assertFalse(vecA.isNear(vecC, 5))
    }

    @Test
    fun interpolateTest() {
        val vecA = Vec2(1, 2)
        val vecB = Vec2(5, 6)
        assertEquals(Vec2(4, 5), vecA.interpolate(vecB, 0.75))
        assertEquals(Vec2(9, 10), vecA.interpolate(vecB, 2))
    }

    @Test
    fun testAsArray() {
        assertTrue(Vec2(1, 2).asArray() contentEquals arrayOf(1.0, 2.0))
    }

    @Test
    fun minTest() {
        assertEquals(Vec2(1, 3), Vec2.min(Vec2(2, 5), Vec2(1, 8), Vec2(2, 3)))
    }

    @Test
    fun maxTest() {
        assertEquals(Vec2(2, 8), Vec2.max(Vec2(2, 5), Vec2(1, 8), Vec2(2, 3)))
    }

}