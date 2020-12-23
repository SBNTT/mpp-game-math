package me.sbntt.mpp.math.units.abstracts

abstract class MathUnit<T : Comparable<T>, C>(open var value: T) : Comparable<C> {

    abstract fun valueEquals(other: MathUnit<*, *>): Boolean

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is MathUnit<*, *>) return false
        return valueEquals(other)
    }

    override fun hashCode(): Int {
        return value.hashCode()
    }

    override fun toString(): String {
        return "${this::class.simpleName}($value)"
    }

}