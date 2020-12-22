package me.sbntt.mpp.math.extensions.comparators

import kotlin.math.abs

infix fun Float.eq(other: Float) = abs(this - other) < 0.0000001F
infix fun Float.dt(other: Float) = !(this eq other)
infix fun Float.differentThan(other: Float) = this dt other
infix fun Float.gt(other: Float) = this > other && this dt other
infix fun Float.greaterThan(other: Float) = this gt other
infix fun Float.lt(other: Float) = this < other && this dt other
infix fun Float.lowerThan(other: Float) = this lt other
infix fun Float.geq(other: Float) = this > other || this eq other
infix fun Float.greaterOrEquals(other: Float) = this geq other
infix fun Float.leq(other: Float) = this < other || this eq other
infix fun Float.lowerOrEquals(other: Float) = this leq other
