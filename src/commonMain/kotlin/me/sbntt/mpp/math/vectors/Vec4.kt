package me.sbntt.mpp.math.vectors

import kotlin.math.sqrt

data class Vec4(var x: Float, var y: Float, var z: Float, var w: Float) : Vec<Vec4>() {

    constructor(x: Number, y: Number, z: Number, w: Number) : this(x.toFloat(), y.toFloat(), z.toFloat(), w.toFloat())

    constructor(v: Number) : this(v.toFloat(), v.toFloat(), v.toFloat(), v.toFloat())

    companion object : VecCompanion<Vec4>() {

        override fun min(vararg vectors: Vec4): Vec4 {
            return Vec4(vectors.minOf { it.x }, vectors.minOf { it.y }, vectors.minOf { it.z }, vectors.minOf { it.w })
        }

        override fun max(vararg vectors: Vec4): Vec4 {
            return Vec4(vectors.maxOf { it.x }, vectors.maxOf { it.y }, vectors.maxOf { it.z }, vectors.maxOf { it.w })
        }

    }

    override fun plus(other: Vec4) = Vec4(x + other.x, y + other.y, z + other.z, w + other.w)

    override fun minus(other: Vec4) = Vec4(x - other.x, y - other.y, z - other.z, w - other.w)

    override fun times(other: Vec4) = Vec4(x * other.x, y * other.y, z * other.z, w * other.w)

    override fun times(scale: Number): Vec4 {
        val scaleF = scale.toFloat()
        return Vec4(x * scaleF, y * scaleF, z * scaleF, w * scaleF)
    }

    override fun div(other: Vec4) = Vec4(x / other.x, y / other.y, z / other.z, w / other.w)

    override fun div(scale: Number): Vec4 {
        val scaleF = scale.toFloat()
        return Vec4(x / scaleF, y / scaleF, z / scaleF, w / scaleF)
    }

    override fun unaryMinus() = Vec4(-x, -y, -z, -w)

    override fun dot(other: Vec4) = x * other.x + y * other.y + z * other.z + w * other.w

    override fun length() = sqrt(x * x + y * y + z * z + w * w)

    override fun asArray() = arrayOf(x, y, z, w)

}