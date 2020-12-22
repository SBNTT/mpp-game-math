package me.sbntt.mpp.math.units.abstracts

import me.sbntt.mpp.math.extensions.comparators.eq
import me.sbntt.mpp.math.extensions.comparators.lowerThan

abstract class DoubleMathUnit<C : DoubleMathUnit<C>>(value: Double) : MathUnit<Double, C>(value) {

    override fun valueEquals(other: MathUnit<*, *>): Boolean {
        if (other !is DoubleMathUnit<*>) return false
        return this.value eq other.value
    }

    override fun compareTo(other: C): Int {
        return when {
            value eq other.value -> 0
            value lowerThan other.value -> -1
            else -> 1
        }
    }

}