package me.sbntt.mpp.math.vectors

import me.sbntt.mpp.math.extensions.comparators.*
import kotlin.math.sqrt

class Vec2(var x: Double, var y: Double) : Vec<Vec2>() {

    constructor(x: Number, y: Number) : this(x.toDouble(), y.toDouble())

    constructor(v: Number) : this(v.toDouble(), v.toDouble())

    companion object : VecCompanion<Vec2>() {

        override fun min(vararg vectors: Vec2): Vec2 {
            return Vec2(vectors.minOf { it.x }, vectors.minOf { it.y })
        }

        override fun max(vararg vectors: Vec2): Vec2 {
            return Vec2(vectors.maxOf { it.x }, vectors.maxOf { it.y })
        }

    }

    override fun plus(other: Vec2) = Vec2(x + other.x, y + other.y)

    override fun minus(other: Vec2) = Vec2(x - other.x, y - other.y)

    override fun times(other: Vec2) = Vec2(x * other.x, y * other.y)

    override fun times(scale: Number): Vec2 {
        val scaleD = scale.toDouble()
        return Vec2(x * scaleD, y * scaleD)
    }

    override fun div(other: Vec2) = Vec2(x / other.x, y / other.y)

    override fun div(scale: Number): Vec2 {
        val scaleD = scale.toDouble()
        return Vec2(x / scaleD, y / scaleD)
    }

    override fun unaryMinus() = Vec2(-x, -y)

    override infix fun dot(other: Vec2) = x * other.x + y * other.y

    override fun length() = sqrt(x * x + y * y)

    override fun asArray() = arrayOf(x, y)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        return !(other !is Vec2 || x differentThan other.x || y differentThan other.y)
    }

    override fun hashCode(): Int {
        return 31 * x.hashCode() + y.hashCode()
    }

    override fun toString(): String {
        return "Vec2(x=$x, y=$y)"
    }

}