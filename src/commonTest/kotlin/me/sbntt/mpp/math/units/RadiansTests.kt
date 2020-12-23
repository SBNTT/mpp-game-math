package me.sbntt.mpp.math.units

import me.sbntt.mpp.math.units.Radians.Extensions.radians
import me.sbntt.mpp.math.units.Degrees.Extensions.degrees
import me.sbntt.mpp.math.extensions.comparators.*
import kotlin.math.PI
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class RadiansTests {

    @Test
    fun testConstructor() {
        assertTrue { 4.radians.value eq 4.0 }
        assertTrue { (2 * PI).radians.value eq 0.0 }
        assertTrue { (3 * PI).radians.value eq PI }
        assertTrue { (-PI).radians.value eq PI }
    }

    @Test
    fun testEquals() {
        assertTrue { 4.radians eq 4.radians }
        assertFalse { 5.radians eq 4.radians }
    }

    @Test
    fun testEqualsToDegrees() {
        assertFalse { 4.radians eq 4.degrees }
        assertTrue { PI.radians eq 180.degrees }
        assertTrue { 0.3839724354387525.radians eq 22.degrees }
        assertTrue { 0.39269908169872414.radians eq 22.5.degrees }
    }

    @Test
    fun testGreaterThan() {
        assertTrue { 5.radians greaterThan 4.radians }
        assertFalse { 4.radians greaterThan 4.radians }
        assertTrue { 5.radians gt 4.radians }
        assertFalse { 4.radians gt 4.radians }
    }

    @Test
    fun testGreaterThanDegrees() {
        assertTrue { PI.radians greaterThan 179.degrees }
        assertFalse { PI.radians greaterThan 180.degrees }
        assertTrue { PI.radians gt 179.degrees }
        assertFalse { PI.radians gt 180.degrees }
    }

    @Test
    fun testLowerThan() {
        assertTrue { 4.radians lowerThan 5.radians }
        assertFalse { 4.radians lowerThan 4.radians }
        assertTrue { 4.radians lt 5.radians }
        assertFalse { 4.radians lt 4.radians }
    }

    @Test
    fun testLowerThanDegrees() {
        assertTrue { PI.radians lowerThan 181.degrees }
        assertFalse { PI.radians lowerThan 180.degrees }
        assertTrue { PI.radians lt 181.degrees }
        assertFalse { PI.radians lt 180.degrees }
    }

    @Test
    fun testGreaterOrEquals() {
        assertTrue { 5.radians greaterOrEquals 4.radians }
        assertTrue { 4.radians greaterOrEquals 4.radians }
        assertFalse { 3.radians greaterOrEquals 4.radians }
        assertTrue { 5.radians geq 4.radians }
        assertTrue { 4.radians geq 4.radians }
        assertFalse { 3.radians geq 4.radians }
    }

    @Test
    fun testGreaterOrEqualsToDegrees() {
        assertTrue { PI.radians greaterOrEquals 179.degrees }
        assertTrue { PI.radians greaterOrEquals 180.degrees }
        assertFalse { PI.radians greaterOrEquals 181.degrees }
        assertTrue { PI.radians geq 179.degrees }
        assertTrue { PI.radians geq 180.degrees }
        assertFalse { PI.radians geq 181.degrees }
    }

    @Test
    fun testLowerOrEquals() {
        assertTrue { 4.radians lowerOrEquals 5.radians }
        assertTrue { 4.radians lowerOrEquals 4.radians }
        assertFalse { 4.radians lowerOrEquals 3.radians }
        assertTrue { 4.radians leq 5.radians }
        assertTrue { 4.radians leq 4.radians }
        assertFalse { 4.radians leq 3.radians }
    }

    @Test
    fun testLowerOrEqualsToDegrees() {
        assertTrue { PI.radians lowerOrEquals 181.degrees }
        assertTrue { PI.radians lowerOrEquals 180.degrees }
        assertFalse { PI.radians lowerOrEquals 179.degrees }
        assertTrue { PI.radians leq 181.degrees }
        assertTrue { PI.radians leq 180.degrees }
        assertFalse { PI.radians leq 179.degrees }
    }

}