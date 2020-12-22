@file:Suppress("DuplicatedCode")

package me.sbntt.mpp.math.extensions

import me.sbntt.mpp.math.extensions.comparators.*

infix fun Double.coerceCircularIn(range: ClosedRange<Double>): Double {
    if (range.start == range.endInclusive) {
        throw IllegalArgumentException("Cannot coerce value to an empty range: $range.")
    }

    val (s, e) = if (range.start < range.endInclusive)
                      listOf(range.start, range.endInclusive)
                 else listOf(range.endInclusive + 1, range.start + 1)

    return when {
        this lowerThan s -> e - (s - this) % (e - s)
        this greaterOrEquals e -> s + (this - e) % (e - s)
        else -> this
    }
}

infix fun Float.coerceCircularIn(range: ClosedRange<Float>): Float {
    if (range.start == range.endInclusive) {
        throw IllegalArgumentException("Cannot coerce value to an empty range: $range.")
    }

    val (s, e) = if (range.start < range.endInclusive)
                      listOf(range.start, range.endInclusive)
                 else listOf(range.endInclusive + 1, range.start + 1)

    return when {
        this lowerThan s -> e - (s - this) % (e - s)
        this greaterOrEquals e -> s + (this - e) % (e - s)
        else -> this
    }
}

infix fun Int.coerceCircularIn(range: ClosedRange<Int>): Int {
    if (range.start == range.endInclusive) {
        throw IllegalArgumentException("Cannot coerce value to an empty range: $range.")
    }

    val (s, e) = if (range.start < range.endInclusive)
                      listOf(range.start, range.endInclusive)
                 else listOf(range.endInclusive + 1, range.start + 1)

    return when {
        this lowerThan s -> e - (s - this) % (e - s)
        this greaterOrEquals e -> s + (this - e) % (e - s)
        else -> this
    }
}

infix fun Long.coerceCircularIn(range: ClosedRange<Long>): Long {
    if (range.start == range.endInclusive) {
        throw IllegalArgumentException("Cannot coerce value to an empty range: $range.")
    }

    val (s, e) = if (range.start < range.endInclusive)
                      listOf(range.start, range.endInclusive)
                 else listOf(range.endInclusive + 1, range.start + 1)

    return when {
        this lowerThan s -> e - (s - this) % (e - s)
        this greaterOrEquals e -> s + (this - e) % (e - s)
        else -> this
    }
}