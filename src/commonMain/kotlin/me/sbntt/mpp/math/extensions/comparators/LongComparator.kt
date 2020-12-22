package me.sbntt.mpp.math.extensions.comparators

infix fun Long.eq(other: Long) = this == other
infix fun Long.dt(other: Long) = this != other
infix fun Long.differentThan(other: Long) = this != other
infix fun Long.gt(other: Long) = this > other
infix fun Long.greaterThan(other: Long) = this > other
infix fun Long.lt(other: Long) = this < other
infix fun Long.lowerThan(other: Long) = this < other
infix fun Long.geq(other: Long) = this >= other
infix fun Long.greaterOrEquals(other: Long) = this >= other
infix fun Long.leq(other: Long) = this <= other
infix fun Long.lowerOrEquals(other: Long) = this <= other
