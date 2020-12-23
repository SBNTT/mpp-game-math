package me.sbntt.mpp.math.units

import me.sbntt.mpp.math.extensions.coerceCircularIn
import me.sbntt.mpp.math.units.Degrees.Extensions.degrees
import me.sbntt.mpp.math.units.abstracts.DoubleMathUnit
import kotlin.math.PI

class Radians private constructor(value: Double) : DoubleMathUnit<Radians>(value) {

    override var value: Double = value coerceCircularIn MIN_VALUE .. MAX_VALUE
        set(value) {
            field = value coerceCircularIn MIN_VALUE .. MAX_VALUE
        }

    companion object {
        const val MIN_VALUE = 0.0
        const val MAX_VALUE = 2 * PI
    }

    fun toDegrees(): Degrees {
        return (value * 180.0 / PI).degrees
    }

    object Extensions {
        val Number.radians get() = Radians(this.toDouble())
    }

}