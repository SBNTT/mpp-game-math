package me.sbntt.mpp.math.extensions.comparators

infix fun Short.eq(other: Short) = this == other
infix fun Short.dt(other: Short) = this != other
infix fun Short.differentThan(other: Short) = this != other
infix fun Short.gt(other: Short) = this > other
infix fun Short.greaterThan(other: Short) = this > other
infix fun Short.lt(other: Short) = this < other
infix fun Short.lowerThan(other: Short) = this < other
infix fun Short.geq(other: Short) = this >= other
infix fun Short.greaterOrEquals(other: Short) = this >= other
infix fun Short.leq(other: Short) = this <= other
infix fun Short.lowerOrEquals(other: Short) = this <= other
