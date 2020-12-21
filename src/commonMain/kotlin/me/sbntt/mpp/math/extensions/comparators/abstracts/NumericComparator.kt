package me.sbntt.mpp.math.extensions.comparators.abstracts

interface NumericComparator<T, O> {

    infix fun T.eq(other: O): Boolean

    // Kotlin does not supports infix negation like !eq for now
    infix fun T.dt(other: O): Boolean
    infix fun T.differentThan(other: O): Boolean

    infix fun T.gt(other: O): Boolean
    infix fun T.greaterThan(other: O): Boolean

    infix fun T.lt(other: O): Boolean
    infix fun T.lowerThan(other: O): Boolean

    infix fun T.geq(other: O): Boolean
    infix fun T.greaterOrEquals(other: O): Boolean

    infix fun T.leq(other: O): Boolean
    infix fun T.lowerOrEquals(other: O): Boolean

}