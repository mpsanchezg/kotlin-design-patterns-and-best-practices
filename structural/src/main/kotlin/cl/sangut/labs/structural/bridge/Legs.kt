package cl.sangut.labs.structural.bridge

interface Legs {
    fun move(x: Long, y: Long): Meters
}

typealias Meters = Int
