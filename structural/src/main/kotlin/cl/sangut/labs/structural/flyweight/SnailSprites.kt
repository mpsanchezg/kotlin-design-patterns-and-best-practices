package cl.sangut.labs.structural.flyweight

object SnailSprites {
    val sprites = List(8) { i ->
        java.io.File(
            when (i) {
                0 -> "snail-left.jpg"
                1 -> "snail-right.jpg"
                in 2..4 -> "snail-move-left-${i - 1}.jpg"
                else -> "snail-move-right${(4 - i)}.jpg"
            }
        )
    }
}
