package cl.sangut.labs.structural.flyweight

import java.io.File

class TansanianSnail {
    val directionFacing = Direction.LEFT

    // This is the Flyweight we're using
    val sprites = SnailSprites.sprites

    fun getCurrentSprite(): File {
        return when (directionFacing) {
            Direction.LEFT -> sprites[0]
            Direction.RIGHT -> sprites[1]
        }
    }

    // More information about the state of a snail comes here

    // This may include its health, for example
}
