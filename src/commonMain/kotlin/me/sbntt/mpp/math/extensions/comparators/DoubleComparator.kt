package me.sbntt.mpp.math.extensions.comparators

import me.sbntt.mpp.math.extensions.comparators.abstracts.NumericComparator
import kotlin.math.abs

object DoubleComparator : NumericComparator<Double, Double> {

    private const val DOUBLE_EQUALS_THRESHOLD = 0.00000000000001

    override fun Double.eq(other: Double) = abs(this - other) < DOUBLE_EQUALS_THRESHOLD

    override fun Double.dt(other: Double) = !(this eq other)
    override fun Double.differentThan(other: Double) = this dt other

    override fun Double.gt(other: Double) = this > other && this dt other
    override fun Double.greaterThan(other: Double) = this gt other

    override fun Double.lt(other: Double) = this < other && this dt other
    override fun Double.lowerThan(other: Double) = this lt other

    override fun Double.geq(other: Double) = this > other || this eq other
    override fun Double.greaterOrEquals(other: Double) = this geq other

    override fun Double.leq(other: Double) = this < other || this eq other
    override fun Double.lowerOrEquals(other: Double) = this leq other

}