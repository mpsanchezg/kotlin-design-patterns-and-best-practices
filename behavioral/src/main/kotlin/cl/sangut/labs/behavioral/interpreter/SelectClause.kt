package cl.sangut.labs.behavioral.interpreter

@SqlDslMarker
class SelectClause(private vararg val columns: String) {
    private lateinit var from: FromClause
    fun from(
        table: String,
        where: FromClause.() -> Unit
    ): FromClause {
        this.from = FromClause(table)
        return this.from.apply(where)
    }

    override fun toString() = "SELECT ${columns.joinToString(separator = ", ")} $from"
}
