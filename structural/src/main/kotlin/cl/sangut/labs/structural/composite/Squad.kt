package cl.sangut.labs.structural.composite

import cl.sangut.labs.structural.bridge.Trooper

class Squad(private val units: List<Trooper>) :
    Trooper {

    constructor(vararg units: Trooper) : this(units.toList())

    override fun move(x: Long, y: Long) {
        for (u in units) {
            u.move(x, y)
        }
    }

    override fun attackRebel(x: Long, y: Long) {
        for (u in units) {
            u.attackRebel(x, y)
        }
    }
}
