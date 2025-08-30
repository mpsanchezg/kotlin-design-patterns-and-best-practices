package cl.sangut.labs.structural.decorator

class ValidatingAdd(private val repository: StarTrekRepository) : StarTrekRepository by repository {
    private val maxNameLength = 15
    override fun set(starshipName: String, captainName: String) {
        require(captainName.length < maxNameLength) {
            "$captainName name is longer than $maxNameLength characters!"
        }

        repository[starshipName] = captainName
    }
}
