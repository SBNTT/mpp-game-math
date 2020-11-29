package me.sbntt.mpp.math.vectors

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class Vec2Tests {

    @Test
    fun testConstructor() {
        val vec = Vec2(1, 2)
        assertEquals(vec.x, 1F)
        assertEquals(vec.y, 2F)
    }

    @Test
    fun plusOperatorTest() {
        assertEquals(Vec2(6, 3) + Vec2(4, 2), Vec2(10, 5))
    }

    @Test
    fun minusOperatorTest() {
        assertEquals(Vec2(6, 3) - Vec2(4, 2), Vec2(2, 1))
    }

    @Test
    fun mulOperatorTest() {
        assertEquals(Vec2(6, 3) * Vec2(4, 2), Vec2(24, 6))
    }

    @Test
    fun divOperatorTest() {
        assertEquals(Vec2(6, 3) / Vec2(3, 2), Vec2(2, 1.5))
    }

    @Test
    fun dotProductTest() {
        assertEquals(Vec2(-6, 8) dot Vec2(5, 12), 66F)
    }

    @Test
    fun scaleTest() {
        assertEquals(Vec2(3, 6) * 2, Vec2(6, 12))
        assertEquals(Vec2(6, 12) / 2, Vec2(3, 6))
    }

    @Test
    fun lengthTest() {
        assertEquals(Vec2(5, 12).length(), 13F)
    }

    @Test
    fun normalizeTest() {
        assertEquals(Vec2(3, 4).normalize(), Vec2(0.6, 0.8))
    }

    @Test
    fun negateTest() {
        assertEquals(-Vec2(3, -4), Vec2(-3, 4))
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
        assertEquals(vecA.interpolate(vecB, 0.75), Vec2(4, 5))
        assertEquals(vecA.interpolate(vecB, 2), Vec2(9, 10))
    }

    @Test
    fun testAsArray() {
        assertTrue(Vec2(1, 2).asArray() contentEquals arrayOf(1F, 2F))
    }

    @Test
    fun minTest() {
        assertEquals(Vec2.min(Vec2(2, 5), Vec2(1, 8), Vec2(2, 3)), Vec2(1, 3))
    }

    @Test
    fun maxTest() {
        assertEquals(Vec2.max(Vec2(2, 5), Vec2(1, 8), Vec2(2, 3)), Vec2(2, 8))
    }

}