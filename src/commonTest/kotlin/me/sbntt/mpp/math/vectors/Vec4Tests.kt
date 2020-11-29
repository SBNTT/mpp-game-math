package me.sbntt.mpp.math.vectors

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class Vec4Tests {

    @Test
    fun testConstructor() {
        val vec = Vec4(1, 2, 3, 4)
        assertEquals(vec.x, 1F)
        assertEquals(vec.y, 2F)
        assertEquals(vec.z, 3F)
        assertEquals(vec.w, 4F)
    }

    @Test
    fun plusOperatorTest() {
        assertEquals(Vec4(6, 3, 1, 2) + Vec4(4, 2, 2, 4), Vec4(10, 5, 3, 6))
    }

    @Test
    fun minusOperatorTest() {
        assertEquals(Vec4(6, 3, 1, 2) - Vec4(4, 2, 2, 5), Vec4(2, 1, -1, -3))
    }

    @Test
    fun mulOperatorTest() {
        assertEquals(Vec4(6, 3, 1, 2) * Vec4(4, 2, 2, 10), Vec4(24, 6, 2, 20))
    }

    @Test
    fun divOperatorTest() {
        assertEquals(Vec4(6, 3, 1, 6) / Vec4(3, 2, 2, 2), Vec4(2, 1.5, 0.5, 3))
    }

    @Test
    fun dotProductTest() {
        assertEquals(Vec4(-6, 8, 3, 2) dot Vec4(5, 12, 6, 5), 94F)
    }

    @Test
    fun scaleTest() {
        assertEquals(Vec4(3, 6, 8, 4) * 2, Vec4(6, 12, 16, 8))
        assertEquals(Vec4(6, 12, 16, 22) / 2, Vec4(3, 6, 8, 11))
    }

    @Test
    fun lengthTest() {
        assertEquals(Vec4(48, 6, 6, 5).length(), 49F)
    }

    @Test
    fun normalizeTest() {
        assertEquals(Vec4(9, 63, 93, 99).normalize(), Vec4(0.06, 0.42, 0.62, 0.66))
    }

    @Test
    fun negateTest() {
        assertEquals(-Vec4(3, -4, 5, 15), Vec4(-3, 4, -5, -15))
    }

    @Test
    fun isNearTest() {
        val vecA = Vec4(1)
        val vecB = Vec4(49, 7, 7, 6)
        val vecC = Vec4(49, 7, 8, 6)
        assertTrue(vecA.isNear(vecB, 49))
        assertFalse(vecA.isNear(vecB, 49, strict = true))
        assertFalse(vecA.isNear(vecC, 49))
    }

    @Test
    fun interpolateTest() {
        val vecA = Vec4(1, 2, 4, 2)
        val vecB = Vec4(5, 6, 8, 8)
        assertEquals(vecA.interpolate(vecB, 0.75), Vec4(4, 5, 7, 6.5))
        assertEquals(vecA.interpolate(vecB, 2), Vec4(9, 10, 12, 14))
    }

    @Test
    fun testAsArray() {
        assertTrue(Vec4(1, 2, 3, 4).asArray() contentEquals arrayOf(1F, 2F, 3F, 4F))
    }

    @Test
    fun minTest() {
        assertEquals(Vec4.min(Vec4(2, 5, -8, 2), Vec4(1, 8, 5, 1), Vec4(2, 3, 2, 8)), Vec4(1, 3, -8, 1))
    }

    @Test
    fun maxTest() {
        assertEquals(Vec4.max(Vec4(2, 5, 2, 5), Vec4(1, 8, 5, -5), Vec4(2, 3, 7, 12)), Vec4(2, 8, 7, 12))
    }

}