package cl.sangut.labs.structural.decorator

class DefaultStarTrekRepository : StarTrekRepository {
    private val starshipCaptains = mutableMapOf("USS Enterprise" to "Jean-Luc Picard")

    override fun get(starshipName: String): String {
        return starshipCaptains[starshipName] ?: "Unknown"
    }

    override fun set(starshipName: String, captainName: String) {
        starshipCaptains[starshipName] = captainName
    }
}
