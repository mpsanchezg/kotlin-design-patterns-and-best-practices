package cl.sangut.labs.structural.bridge

data class StormTrooper(
    private val weapon: Weapon,
    private val legs: Legs
) : Trooper {
    override fun move(x: Long, y: Long) {
        legs.move(x, y)
    }

    override fun attackRebel(x: Long, y: Long) {
        println("Attacking")
        weapon.attack(x, y)
    }
}
