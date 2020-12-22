package me.sbntt.mpp.math.extensions.comparators

import kotlin.math.abs

infix fun Double.eq(other: Double) = abs(this - other) < 0.00000000000001
infix fun Double.dt(other: Double) = !(this eq other)
infix fun Double.differentThan(other: Double) = this dt other
infix fun Double.gt(other: Double) = this > other && this dt other
infix fun Double.greaterThan(other: Double) = this gt other
infix fun Double.lt(other: Double) = this < other && this dt other
infix fun Double.lowerThan(other: Double) = this lt other
infix fun Double.geq(other: Double) = this > other || this eq other
infix fun Double.greaterOrEquals(other: Double) = this geq other
infix fun Double.leq(other: Double) = this < other || this eq other
infix fun Double.lowerOrEquals(other: Double) = this leq other
