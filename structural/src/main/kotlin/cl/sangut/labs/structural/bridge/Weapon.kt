package cl.sangut.labs.structural.bridge

interface Weapon {
    fun attack(x: Long, y: Long): PointsOfDamage
}

typealias PointsOfDamage = Long
