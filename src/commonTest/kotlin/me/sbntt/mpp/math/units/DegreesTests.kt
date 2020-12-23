package me.sbntt.mpp.math.units

import me.sbntt.mpp.math.units.Degrees.Extensions.degrees
import me.sbntt.mpp.math.units.Radians.Extensions.radians
import me.sbntt.mpp.math.extensions.comparators.*
import kotlin.math.PI
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class DegreesTests {

    @Test
    fun testConstructor() {
        assertTrue { 4.degrees.value eq 4.0 }
        assertTrue { 0.degrees.value eq 0.0 }
        assertTrue { 360.degrees.value eq 0.0 }
        assertTrue { 361.degrees.value eq 1.0 }
        assertTrue { (-2).degrees.value eq 358.0 }
    }

    @Test
    fun testEquals() {
        assertTrue { 4.degrees eq 4.degrees }
        assertFalse { 5.degrees eq 4.degrees }
    }

    @Test
    fun testEqualsToRadians() {
        assertFalse { 4.degrees eq 4.radians }
        assertTrue { 180.degrees eq PI.radians }
        assertTrue { 22.degrees eq 0.3839724354387525.radians }
        assertTrue { 22.5.degrees eq 0.39269908169872414.radians }
    }

    @Test
    fun testGreaterThan() {
        assertTrue { 5.degrees greaterThan 4.degrees }
        assertFalse { 4.degrees greaterThan 4.degrees }
        assertTrue { 5.degrees gt 4.degrees }
        assertFalse { 4.degrees gt 4.degrees }
    }

    @Test
    fun testGreaterThanRadians() {
        assertTrue { 181.degrees greaterThan PI.radians }
        assertFalse { 180.degrees greaterThan PI.radians }
        assertTrue { 181.degrees gt PI.radians }
        assertFalse { 180.degrees gt PI.radians }
    }

    @Test
    fun testLowerThan() {
        assertTrue { 4.degrees lowerThan 5.degrees }
        assertFalse { 4.degrees lowerThan 4.degrees }
        assertTrue { 4.degrees lt 5.degrees }
        assertFalse { 4.degrees lt 4.degrees }
    }

    @Test
    fun testLowerThanRadians() {
        assertTrue { 179.degrees lowerThan PI.radians }
        assertFalse { 180.degrees lowerThan PI.radians }
        assertTrue { 179.degrees lt PI.radians }
        assertFalse { 180.degrees lt PI.radians }
    }

    @Test
    fun testGreaterOrEquals() {
        assertTrue { 5.degrees greaterOrEquals 4.degrees }
        assertTrue { 4.degrees greaterOrEquals 4.degrees }
        assertFalse { 3.degrees greaterOrEquals 4.degrees }
        assertTrue { 5.degrees geq 4.degrees }
        assertTrue { 4.degrees geq 4.degrees }
        assertFalse { 3.degrees geq 4.degrees }
    }

    @Test
    fun testGreaterOrEqualsToRadians() {
        assertTrue { 181.degrees greaterOrEquals PI.radians }
        assertTrue { 180.degrees greaterOrEquals PI.radians }
        assertFalse { 179.degrees greaterOrEquals PI.radians }
        assertTrue { 181.degrees geq PI.radians }
        assertTrue { 180.degrees geq PI.radians }
        assertFalse { 179.degrees geq PI.radians }
    }

    @Test
    fun testLowerOrEquals() {
        assertTrue { 4.degrees lowerOrEquals 5.degrees }
        assertTrue { 4.degrees lowerOrEquals 4.degrees }
        assertFalse { 4.degrees lowerOrEquals 3.degrees }
        assertTrue { 4.degrees leq 5.degrees }
        assertTrue { 4.degrees leq 4.degrees }
        assertFalse { 4.degrees leq 3.degrees }
    }

    @Test
    fun testLowerOrEqualsToRadians() {
        assertTrue { 179.degrees lowerOrEquals PI.radians }
        assertTrue { 180.degrees lowerOrEquals PI.radians }
        assertFalse { 181.degrees lowerOrEquals PI.radians }
        assertTrue { 179.degrees leq PI.radians }
        assertTrue { 180.degrees leq PI.radians }
        assertFalse { 181.degrees leq PI.radians }
    }

}