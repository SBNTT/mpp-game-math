package me.sbntt.mpp.math.extensions.comparators

infix fun Int.eq(other: Int) = this == other
infix fun Int.dt(other: Int) = this != other
infix fun Int.differentThan(other: Int) = this != other
infix fun Int.gt(other: Int) = this > other
infix fun Int.greaterThan(other: Int) = this > other
infix fun Int.lt(other: Int) = this < other
infix fun Int.lowerThan(other: Int) = this < other
infix fun Int.geq(other: Int) = this >= other
infix fun Int.greaterOrEquals(other: Int) = this >= other
infix fun Int.leq(other: Int) = this <= other
infix fun Int.lowerOrEquals(other: Int) = this <= other
