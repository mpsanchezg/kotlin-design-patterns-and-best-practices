package cl.sangut.labs.structural.facade

import kotlin.io.path.Path

fun Server.startFromConfiguration(fileLocation: String) {
    val path = Path(fileLocation)

    val lines = path.toFile().readLines()

    val configuration = try {
        JsonParser().server(lines)
    } catch (e: RuntimeException) {
        YamlParser().server(lines)
    }

    Server.withPort(configuration.port)
}
