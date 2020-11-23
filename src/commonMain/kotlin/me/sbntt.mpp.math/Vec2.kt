package me.sbntt.mpp.math

import kotlin.math.sqrt

data class Vec2(var x: Float, var y: Float) : Vec<Vec2>() {

    constructor(x: Number, y: Number) : this(x.toFloat(), y.toFloat())

    constructor(v: Number) : this(v.toFloat(), v.toFloat())

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
        val scaleF = scale.toFloat()
        return Vec2(x * scaleF, y * scaleF)
    }

    override fun div(other: Vec2) = Vec2(x / other.x, y / other.y)

    override fun div(scale: Number): Vec2 {
        val scaleF = scale.toFloat()
        return Vec2(x / scaleF, y / scaleF)
    }

    override fun unaryMinus() = Vec2(-x, -y)

    override infix fun dot(other: Vec2) = x * other.x + y * other.y

    override fun length() = sqrt(x * x + y * y)

    override fun asArray() = arrayOf(x, y)

}