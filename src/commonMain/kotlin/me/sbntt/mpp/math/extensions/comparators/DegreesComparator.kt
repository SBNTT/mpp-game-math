package me.sbntt.mpp.math.extensions.comparators

import me.sbntt.mpp.math.units.Degrees
import me.sbntt.mpp.math.units.Radians

infix fun Degrees.eq(other: Degrees) = value eq other.value
infix fun Degrees.dt(other: Degrees) = value dt other.value
infix fun Degrees.differentThan(other: Degrees) = value differentThan other.value
infix fun Degrees.gt(other: Degrees) = value gt other.value
infix fun Degrees.greaterThan(other: Degrees) = value greaterThan other.value
infix fun Degrees.lt(other: Degrees) = value lt other.value
infix fun Degrees.lowerThan(other: Degrees) = value lowerThan other.value
infix fun Degrees.geq(other: Degrees) = value geq other.value
infix fun Degrees.greaterOrEquals(other: Degrees) = value greaterOrEquals other.value
infix fun Degrees.leq(other: Degrees) = value leq other.value
infix fun Degrees.lowerOrEquals(other: Degrees) = value lowerOrEquals other.value

infix fun Degrees.eq(other: Radians) = this eq other.toDegrees()
infix fun Degrees.dt(other: Radians) = this dt other.toDegrees()
infix fun Degrees.differentThan(other: Radians) = this differentThan other.toDegrees()
infix fun Degrees.gt(other: Radians) = this gt other.toDegrees()
infix fun Degrees.greaterThan(other: Radians) = this greaterThan other.toDegrees()
infix fun Degrees.lt(other: Radians) = this lt other.toDegrees()
infix fun Degrees.lowerThan(other: Radians) = this lowerThan other.toDegrees()
infix fun Degrees.geq(other: Radians) = this geq other.toDegrees()
infix fun Degrees.greaterOrEquals(other: Radians) = this greaterOrEquals other.toDegrees()
infix fun Degrees.leq(other: Radians) = this leq other.toDegrees()
infix fun Degrees.lowerOrEquals(other: Radians) = this lowerOrEquals other.toDegrees()