import java.lang.IllegalArgumentException
import kotlin.math.abs
import kotlin.math.max


fun List<Int>.findClosestToZero(): Int =
        reduceOrNull { currentClosest, current ->
            val currentAbs = abs(current)
            val closestCurrentAbs = abs(currentClosest)
            when {
                currentAbs == closestCurrentAbs -> max(current, currentClosest)
                currentAbs < closestCurrentAbs -> current
                else -> currentClosest
            }
        } ?: throw IllegalArgumentException("input list cannot be empty")


