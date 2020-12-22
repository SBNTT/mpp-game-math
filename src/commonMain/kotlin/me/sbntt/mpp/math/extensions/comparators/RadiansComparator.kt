package me.sbntt.mpp.math.extensions.comparators

import me.sbntt.mpp.math.units.Degrees
import me.sbntt.mpp.math.units.Radians

infix fun Radians.eq(other: Radians) = value eq other.value
infix fun Radians.dt(other: Radians) = value dt other.value
infix fun Radians.differentThan(other: Radians) = value differentThan other.value
infix fun Radians.gt(other: Radians) = value gt other.value
infix fun Radians.greaterThan(other: Radians) = value greaterThan other.value
infix fun Radians.lt(other: Radians) = value lt other.value
infix fun Radians.lowerThan(other: Radians) = value lowerThan other.value
infix fun Radians.geq(other: Radians) = value geq other.value
infix fun Radians.greaterOrEquals(other: Radians) = value greaterOrEquals other.value
infix fun Radians.leq(other: Radians) = value leq other.value
infix fun Radians.lowerOrEquals(other: Radians) = value lowerOrEquals other.value

infix fun Radians.eq(other: Degrees) = this eq other.toRadians()
infix fun Radians.dt(other: Degrees) = this dt other.toRadians()
infix fun Radians.differentThan(other: Degrees) = this differentThan other.toRadians()
infix fun Radians.gt(other: Degrees) = this gt other.toRadians()
infix fun Radians.greaterThan(other: Degrees) = this greaterThan other.toRadians()
infix fun Radians.lt(other: Degrees) = this lt other.toRadians()
infix fun Radians.lowerThan(other: Degrees) = this lowerThan other.toRadians()
infix fun Radians.geq(other: Degrees) = this geq other.toRadians()
infix fun Radians.greaterOrEquals(other: Degrees) = this greaterOrEquals other.toRadians()
infix fun Radians.leq(other: Degrees) = this leq other.toRadians()
infix fun Radians.lowerOrEquals(other: Degrees) = this lowerOrEquals other.toRadians()