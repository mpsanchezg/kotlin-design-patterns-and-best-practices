package cl.sangut.labs.structural.facade

class JsonParser : Parser {

    // Implementation specific to JSON files
    override fun property(prop: String): Property {
        TODO("Not yet implemented")
    }

    override fun server(propertyStrings: List<String>): ServerConfiguration {
        TODO("Not yet implemented")
    }
}