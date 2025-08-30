package cl.sangut.labs.behavioral.interpreter

@SqlDslMarker
class WhereClause(private val conditions: String) {
    override fun toString() = "WHERE $conditions"
}
