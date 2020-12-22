package me.sbntt.mpp.math.vectors

import me.sbntt.mpp.math.extensions.comparators.*
import kotlin.math.sqrt

class Vec3(var x: Double, var y: Double, var z: Double) : Vec<Vec3>() {

    constructor(x: Number, y: Number, z: Number) : this(x.toDouble(), y.toDouble(), z.toDouble())

    constructor(v: Number) : this(v.toDouble(), v.toDouble(), v.toDouble())

    companion object : VecCompanion<Vec3>() {

        override fun min(vararg vectors: Vec3): Vec3 {
            return Vec3(vectors.minOf { it.x }, vectors.minOf { it.y }, vectors.minOf { it.z })
        }

        override fun max(vararg vectors: Vec3): Vec3 {
            return Vec3(vectors.maxOf { it.x }, vectors.maxOf { it.y }, vectors.maxOf { it.z })
        }

    }

    override fun plus(other: Vec3) = Vec3(x + other.x, y + other.y, z + other.z)

    override fun minus(other: Vec3) = Vec3(x - other.x, y - other.y, z - other.z)

    override fun times(other: Vec3) = Vec3(x * other.x, y * other.y, z * other.z)

    override fun times(scale: Number): Vec3 {
        val scaleD = scale.toDouble()
        return Vec3(x * scaleD, y * scaleD, z * scaleD)
    }

    override fun div(other: Vec3) = Vec3(x / other.x, y / other.y, z / other.z)

    override fun div(scale: Number): Vec3 {
        val scaleD = scale.toDouble()
        return Vec3(x / scaleD, y / scaleD, z / scaleD)
    }

    override fun unaryMinus() = Vec3(-x, -y, -z)

    override fun dot(other: Vec3) = x * other.x + y * other.y + z * other.z

    infix fun cross(other: Vec3) = Vec3(
            y * other.z - z * other.y,
            z * other.x - x * other.z,
            x * other.y - y * other.x
    )

    override fun length() = sqrt(x * x + y * y + z * z)

    override fun asArray() = arrayOf(x, y, z)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Vec3) return false
        return !(x differentThan other.x || y differentThan other.y || z differentThan other.z)
    }

    override fun hashCode(): Int {
        return 31 * x.hashCode() + y.hashCode() + z.hashCode()
    }

    override fun toString(): String {
        return "Vec3(x=$x, y=$y, z=$z)"
    }

}