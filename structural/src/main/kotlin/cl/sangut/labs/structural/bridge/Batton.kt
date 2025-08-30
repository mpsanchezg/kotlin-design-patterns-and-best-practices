package cl.sangut.labs.structural.bridge

import cl.sangut.labs.structural.bridge.Constants.RIFLE_DAMAGE

class Batton : Weapon {
    override fun attack(x: Long, y: Long) = RIFLE_DAMAGE * 3
}
