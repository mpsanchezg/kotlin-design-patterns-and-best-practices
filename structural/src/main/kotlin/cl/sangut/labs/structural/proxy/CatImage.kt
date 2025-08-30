package cl.sangut.labs.structural.proxy

import java.net.URL

data class CatImage(
    val thumbnailUrl: String,
    val url: String
) {
    val image: ByteArray by lazy {
        println("Fetching image, please wait")
        // Read image as bytes
        URL(url).readBytes()
    }
}
