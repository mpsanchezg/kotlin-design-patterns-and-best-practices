package cl.sangut.labs.structural.adapter

fun usPowerOutlet(): USPlug {
    return object : USPlug {
        override val hasPower = 1
    }
}
