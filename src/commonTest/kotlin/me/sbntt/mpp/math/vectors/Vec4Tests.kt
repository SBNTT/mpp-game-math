package me.sbntt.mpp.math.vectors

import me.sbntt.mpp.math.extensions.comparators.DoubleComparator.eq
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class Vec4Tests {

    @Test
    fun testConstructor() {
        val vec = Vec4(1, 2, 3, 4)
        assertTrue(vec.x eq 1.0)
        assertTrue(vec.y eq 2.0)
        assertTrue(vec.z eq 3.0)
        assertTrue(vec.w eq 4.0)
    }

    @Test
    fun plusOperatorTest() {
        assertEquals(Vec4(10, 5, 3, 6), Vec4(6, 3, 1, 2) + Vec4(4, 2, 2, 4))
    }

    @Test
    fun minusOperatorTest() {
        assertEquals(Vec4(2, 1, -1, -3), Vec4(6, 3, 1, 2) - Vec4(4, 2, 2, 5))
    }

    @Test
    fun mulOperatorTest() {
        assertEquals(Vec4(24, 6, 2, 20), Vec4(6, 3, 1, 2) * Vec4(4, 2, 2, 10))
    }

    @Test
    fun divOperatorTest() {
        assertEquals(Vec4(2, 1.5, 0.5, 3), Vec4(6, 3, 1, 6) / Vec4(3, 2, 2, 2))
    }

    @Test
    fun dotProductTest() {
        assertTrue(Vec4(-6, 8, 3, 2) dot Vec4(5, 12, 6, 5) eq 94.0)
    }

    @Test
    fun scaleTest() {
        assertEquals(Vec4(6, 12, 16, 8), Vec4(3, 6, 8, 4) * 2)
        assertEquals(Vec4(3, 6, 8, 11), Vec4(6, 12, 16, 22) / 2)
    }

    @Test
    fun lengthTest() {
        assertTrue(Vec4(48, 6, 6, 5).length() eq 49.0)
    }

    @Test
    fun normalizeTest() {
        assertEquals(Vec4(0.06, 0.42, 0.62, 0.66), Vec4(9, 63, 93, 99).normalize())
    }

    @Test
    fun negateTest() {
        assertEquals(Vec4(-3, 4, -5, -15), -Vec4(3, -4, 5, 15))
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
        assertEquals(Vec4(4, 5, 7, 6.5), vecA.interpolate(vecB, 0.75))
        assertEquals(Vec4(9, 10, 12, 14), vecA.interpolate(vecB, 2))
    }

    @Test
    fun testAsArray() {
        assertTrue(Vec4(1, 2, 3, 4).asArray() contentEquals arrayOf(1.0, 2.0, 3.0, 4.0))
    }

    @Test
    fun minTest() {
        assertEquals(Vec4(1, 3, -8, 1), Vec4.min(Vec4(2, 5, -8, 2), Vec4(1, 8, 5, 1), Vec4(2, 3, 2, 8)))
    }

    @Test
    fun maxTest() {
        assertEquals(Vec4(2, 8, 7, 12), Vec4.max(Vec4(2, 5, 2, 5), Vec4(1, 8, 5, -5), Vec4(2, 3, 7, 12)))
    }

}