package cl.sangut.labs.structural.facade

interface Parser {
    fun property(prop: String): Property
    fun server(propertyStrings: List<String>): ServerConfiguration
}
