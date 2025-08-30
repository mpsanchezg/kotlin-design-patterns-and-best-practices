package cl.sangut.labs.behavioral.strategy

interface Weapon {
    fun shoot(
        x: Int,
        y: Int,
        direction: Direction
    ): Projectile
}
