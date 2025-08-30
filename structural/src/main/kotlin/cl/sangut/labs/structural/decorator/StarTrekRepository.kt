package cl.sangut.labs.structural.decorator

interface StarTrekRepository {
    operator fun get(starshipName: String): String
    operator fun set(starshipName: String, captainName: String)
}
