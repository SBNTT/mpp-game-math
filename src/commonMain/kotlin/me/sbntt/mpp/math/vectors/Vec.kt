package me.sbntt.mpp.math.vectors

import me.sbntt.mpp.math.extensions.comparators.*
import kotlin.math.pow

/**
 * ### Parent of all vectors
 *
 * it contains basics operations that can be done on/with a vector.
 *
 * @param T the type of the concrete implementation.
 * ensure generic type safety.
 */
abstract class Vec<T : Vec<T>> {

    abstract class VecCompanion<T : Vec<T>> {

        abstract fun min(vararg vectors: T): T

        abstract fun max(vararg vectors: T): T

    }

    abstract operator fun plus(other: T): T

    abstract operator fun minus(other: T): T

    abstract operator fun times(other: T): T

    abstract operator fun times(scale: Number): T

    abstract operator fun div(other: T): T

    abstract operator fun div(scale: Number): T

    abstract operator fun unaryMinus(): T

    abstract infix fun dot(other: T): Double

    abstract fun length(): Double

    abstract fun asArray(): Array<Double>

    fun normalize(): T = this / length()

    fun interpolate(other: T, factor: Number): T {
        return this * (1 - factor.toDouble()) + other * factor
    }

    fun isNear(other: T, threshold: Number, strict: Boolean = false): Boolean {
        val sub = (this - other)
        return if (strict)
            sub dot sub lowerThan threshold.toDouble().pow(2)
        else
            sub dot sub lowerOrEquals threshold.toDouble().pow(2)
    }

    abstract override fun equals(other: Any?): Boolean

    abstract override fun hashCode(): Int

}