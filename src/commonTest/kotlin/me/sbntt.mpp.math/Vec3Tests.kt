package me.sbntt.mpp.math

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class Vec3Tests {

    @Test
    fun testConstructor() {
        val vec = Vec3(1, 2, 3)
        assertEquals(vec.x, 1F)
        assertEquals(vec.y, 2F)
        assertEquals(vec.z, 3F)
    }

    @Test
    fun plusOperatorTest() {
        assertEquals(Vec3(6, 3, 1) + Vec3(4, 2, 2), Vec3(10, 5, 3))
    }

    @Test
    fun minusOperatorTest() {
        assertEquals(Vec3(6, 3, 1) - Vec3(4, 2, 2), Vec3(2, 1, -1))
    }

    @Test
    fun mulOperatorTest() {
        assertEquals(Vec3(6, 3, 1) * Vec3(4, 2, 2), Vec3(24, 6, 2))
    }

    @Test
    fun divOperatorTest() {
        assertEquals(Vec3(6, 3, 1) / Vec3(3, 2, 2), Vec3(2, 1.5, 0.5))
    }

    @Test
    fun dotProductTest() {
        assertEquals(Vec3(-6, 8, 3) dot Vec3(5, 12, 6), 84F)
    }

    @Test
    fun crossProductTest() {
        assertEquals(Vec3(1, 2, 3) cross Vec3(1, 5, 7), Vec3(-1, -4, 3))
    }

    @Test
    fun scaleTest() {
        assertEquals(Vec3(3, 6, 8) * 2, Vec3(6, 12, 16))
        assertEquals(Vec3(6, 12, 16) / 2, Vec3(3, 6, 8))
    }

    @Test
    fun lengthTest() {
        assertEquals(Vec3(12, 4, 3).length(), 13F)
    }

    @Test
    fun normalizeTest() {
        assertEquals(Vec3(12, 20, 9).normalize(), Vec3(0.48, 0.8, 0.36))
    }

    @Test
    fun negateTest() {
        assertEquals(-Vec3(3, -4, 5), Vec3(-3, 4, -5))
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
        assertEquals(vecA.interpolate(vecB, 0.75), Vec3(4, 5, 7))
        assertEquals(vecA.interpolate(vecB, 2), Vec3(9, 10, 12))
    }

    @Test
    fun testAsArray() {
        assertTrue(Vec3(1, 2, 3).asArray() contentEquals arrayOf(1F, 2F, 3F))
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