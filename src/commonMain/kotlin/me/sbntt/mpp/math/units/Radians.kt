package me.sbntt.mpp.math.units

import me.sbntt.mpp.math.extensions.comparators.*
import me.sbntt.mpp.math.units.Degrees.Extensions.degrees
import me.sbntt.mpp.math.units.abstracts.DoubleMathUnit
import kotlin.math.PI

class Radians private constructor(value: Double) : DoubleMathUnit<Radians>(value) {

    companion object Extensions {
        val Number.radians get() = Radians(this.toDouble())
    }

    fun toDegrees(): Degrees {
        return (value * 180.0 / PI).degrees
    }

}