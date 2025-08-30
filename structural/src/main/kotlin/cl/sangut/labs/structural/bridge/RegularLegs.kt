package cl.sangut.labs.structural.bridge

import cl.sangut.labs.structural.bridge.Constants.REGULAR_SPEED

class RegularLegs : Legs {
    override fun move(x: Long, y: Long) = REGULAR_SPEED
}
