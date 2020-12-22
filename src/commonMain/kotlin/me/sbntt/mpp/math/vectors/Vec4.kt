package me.sbntt.mpp.math.vectors

import me.sbntt.mpp.math.extensions.comparators.*
import kotlin.math.sqrt

class Vec4(var x: Double, var y: Double, var z: Double, var w: Double) : Vec<Vec4>() {

    constructor(x: Number, y: Number, z: Number, w: Number) : this(x.toDouble(), y.toDouble(), z.toDouble(), w.toDouble())

    constructor(v: Number) : this(v.toDouble(), v.toDouble(), v.toDouble(), v.toDouble())

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
        val scaleD = scale.toDouble()
        return Vec4(x * scaleD, y * scaleD, z * scaleD, w * scaleD)
    }

    override fun div(other: Vec4) = Vec4(x / other.x, y / other.y, z / other.z, w / other.w)

    override fun div(scale: Number): Vec4 {
        val scaleD = scale.toDouble()
        return Vec4(x / scaleD, y / scaleD, z / scaleD, w / scaleD)
    }

    override fun unaryMinus() = Vec4(-x, -y, -z, -w)

    override fun dot(other: Vec4) = x * other.x + y * other.y + z * other.z + w * other.w

    override fun length() = sqrt(x * x + y * y + z * z + w * w)

    override fun asArray() = arrayOf(x, y, z, w)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Vec4) return false
        return !(x differentThan other.x || y differentThan other.y || z differentThan other.z || w differentThan other.w)
    }

    override fun hashCode(): Int {
        return 31 * x.hashCode() + y.hashCode() + z.hashCode()
    }

    override fun toString(): String {
        return "Vec4(x=$x, y=$y, z=$z, w=$w)"
    }

}