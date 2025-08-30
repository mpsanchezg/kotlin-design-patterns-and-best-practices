package cl.sangut.labs.structural.bridge

class AthleticLegs : Legs {
    override fun move(x: Long, y: Long) = Constants.REGULAR_SPEED * 2
}
