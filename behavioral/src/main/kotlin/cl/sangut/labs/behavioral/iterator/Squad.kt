package cl.sangut.labs.behavioral.iterator

import cl.sangut.labs.behavioral.command.Trooper

class Squad(private val units: List<Trooper>) : Trooper() {

    constructor(vararg units: Trooper) : this(units.toList())

    operator fun iterator(): Iterator<Trooper> {
        return TrooperIterator(units)
    }
}
