package me.sbntt.mpp.math.vectors

import me.sbntt.mpp.math.extensions.comparators.*
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class Vec3Tests {

    @Test
    fun testConstructor() {
        val vec = Vec3(1, 2, 3)
        assertTrue(vec.x eq 1.0)
        assertTrue(vec.y eq 2.0)
        assertTrue(vec.z eq 3.0)
    }

    @Test
    fun plusOperatorTest() {
        assertEquals(Vec3(10, 5, 3), Vec3(6, 3, 1) + Vec3(4, 2, 2))
    }

    @Test
    fun minusOperatorTest() {
        assertEquals(Vec3(2, 1, -1), Vec3(6, 3, 1) - Vec3(4, 2, 2))
    }

    @Test
    fun mulOperatorTest() {
        assertEquals(Vec3(24, 6, 2), Vec3(6, 3, 1) * Vec3(4, 2, 2))
    }

    @Test
    fun divOperatorTest() {
        assertEquals(Vec3(2, 1.5, 0.5), Vec3(6, 3, 1) / Vec3(3, 2, 2))
    }

    @Test
    fun dotProductTest() {
        assertTrue(Vec3(-6, 8, 3) dot Vec3(5, 12, 6) eq 84.0)
    }

    @Test
    fun crossProductTest() {
        assertEquals(Vec3(-1, -4, 3), Vec3(1, 2, 3) cross Vec3(1, 5, 7))
    }

    @Test
    fun scaleTest() {
        assertEquals(Vec3(6, 12, 16), Vec3(3, 6, 8) * 2)
        assertEquals(Vec3(3, 6, 8), Vec3(6, 12, 16) / 2)
    }

    @Test
    fun lengthTest() {
        assertTrue(Vec3(12, 4, 3).length() eq 13.0)
    }

    @Test
    fun normalizeTest() {
        assertEquals(Vec3(0.48, 0.8, 0.36), Vec3(12, 20, 9).normalize())
    }

    @Test
    fun negateTest() {
        assertEquals(Vec3(-3, 4, -5), -Vec3(3, -4, 5))
    }

    @Test
    fun isNearTest() {
        val vecA = Vec3(1)
        val vecB = Vec3(13, 5, 4)
        val vecC = Vec3(13, 5, 5)
        assertTrue(vecA.isNear(vecB, 13))
        assertFalse(vecA.isNear(vecB, 13, strict = true))
        assertFalse(vecA.isNear(vecC, 13))
    }

    @Test
    fun interpolateTest() {
        val vecA = Vec3(1, 2, 4)
        val vecB = Vec3(5, 6, 8)
        assertEquals(Vec3(4, 5, 7), vecA.interpolate(vecB, 0.75))
        assertEquals(Vec3(9, 10, 12), vecA.interpolate(vecB, 2))
    }

    @Test
    fun testAsArray() {
        assertTrue(Vec3(1, 2, 3).asArray() contentEquals arrayOf(1.0, 2.0, 3.0))
    }

    @Test
    fun minTest() {
        assertEquals(Vec3.min(Vec3(2, 5, -8), Vec3(1, 8, 5), Vec3(2, 3, 2)), Vec3(1, 3, -8))
    }

    @Test
    fun maxTest() {
        assertEquals(Vec3.max(Vec3(2, 5, 2), Vec3(1, 8, 5), Vec3(2, 3, 7)), Vec3(2, 8, 7))
    }

}